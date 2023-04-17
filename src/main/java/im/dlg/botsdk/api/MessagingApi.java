package im.dlg.botsdk.api;

import com.google.protobuf.*;
import im.dlg.botsdk.internal.InternalBot;
import im.dlg.botsdk.listeners.AbstractCommandListener;
import im.dlg.botsdk.listeners.MessageListener;
import im.dlg.botsdk.model.CommandMessage;
import im.dlg.botsdk.model.Message;
import im.dlg.botsdk.model.Peer;
import im.dlg.botsdk.model.content.Content;
import im.dlg.botsdk.model.content.DocumentContent;
import im.dlg.botsdk.utils.Constants;
import im.dlg.botsdk.utils.ImageUtils;
import im.dlg.botsdk.utils.MsgUtils;
import im.dlg.botsdk.utils.UUIDUtils;
import im.dlg.grpc.services.*;
import im.dlg.grpc.services.MessagingOuterClass.*;
import im.dlg.grpc.services.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites;
import io.grpc.ManagedChannel;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URLConnection;
import java.time.Instant;
import java.util.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static im.dlg.grpc.services.MediaAndFilesOuterClass.FastThumb;

/**
 * Central class for messaging API
 */
@Slf4j
public class MessagingApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessagingApi.class);

    private final ManagedChannel channel;
    private final InternalBot internalBot;
    private final MediaAndFilesApi mediaAndFilesApi;
    private MessageListener onMessage = null;
    private AbstractCommandListener onCommand = null;

    public MessagingApi(ManagedChannel channel, InternalBot internalBot, MediaAndFilesApi mediaAndFilesApi) {
        this.channel = channel;
        this.internalBot = internalBot;
        this.mediaAndFilesApi = mediaAndFilesApi;


        internalBot.subscribeOn(UpdateMessage.class, msg -> {
            try {
                String _text = "";
                List<Peer> mentions = new ArrayList<>();
                if (msg.getMessage().hasTextMessage()) {
                    _text = msg.getMessage().getTextMessage().getText();
                    mentions.addAll(msg.getMessage().getTextMessage().getMentionsList().stream().map(m -> m.getPeer()).map(Peer::new).collect(Collectors.toList()));
                } else if (msg.getMessage().hasDocumentMessage()) {
                    _text = String.valueOf(msg.getMessage().getDocumentMessage().getFileId());
                }


                String text = _text;
                internalBot.findOutPeer(new Peer(msg.getPeer())).thenAccept(optOutPeer -> {
                    optOutPeer.ifPresent(outPeer -> {
                        internalBot.loadSenderOutPeer(msg.getSenderUid(), outPeer, msg.getDate())
                                .thenAccept(optSenderOutPeer ->

                                        optSenderOutPeer.ifPresent(senderOutPeer -> {
                                            String commandRegex = "^/\\w+$";
                                            if (System.getenv("im.dlg.enableArguments") != null && System.getenv("im.dlg.enableArguments").equals("true")) {
                                                commandRegex = "^/(\\w+)\\s?(.+)?$";
                                            }

                                            boolean hasCommand = false;
                                            if (msg.getPeer().getType() == Peers.PeerType.PEERTYPE_GROUP) {
                                                if (
                                                        mentions.stream().anyMatch(p -> p.getId().equals(internalBot.getBotId()))
                                                                &&
                                                                text.replaceAll("^@\\w+ ", "").matches(commandRegex)) {
                                                    hasCommand = true;
                                                }
                                            } else if (msg.getPeer().getType() == Peers.PeerType.PEERTYPE_PRIVATE) {
                                                if (text.matches(commandRegex)) {
                                                    hasCommand = true;
                                                }
                                            }
                                            UUID uuid = UUIDUtils.convert(msg.getMid());
                                            ;
                                            if (msg.getPeer().getType() == Peers.PeerType.PEERTYPE_PRIVATE) {
                                                read(new Peer(outPeer), Instant.ofEpochMilli(msg.getDate()));
                                            }
                                            if (hasCommand) {
                                                CommandMessage command = new CommandMessage(outPeer, senderOutPeer, text, uuid);
                                                onCommandReceive(command);
                                                return;
                                            }

                                            onReceiveMessage(new Message(
                                                    new Peer(outPeer),
                                                    new Peer(senderOutPeer),
                                                    uuid, text, msg.getDate(), Content.fromMessage(msg.getMessage()),
                                                    msg.getForward().getMidsList().stream()
                                                            .map(u -> UUIDUtils.convert(u))
                                                            .collect(Collectors.toList()),
                                                    mentions,
                                                    msg.getReply().getMidsList().stream()
                                                            .map(u -> UUIDUtils.convert(u))
                                                            .collect(Collectors.toList())));
                                        })
                                );
                    });
                });
            } catch (Throwable th) {
                log.error("Failed to init MessagingApi, {}", th);
            }
        });
    }

    /**
     * Subscribe to incoming messages
     *
     * @param listener - listener callback
     */
    public void onMessage(@Nullable MessageListener listener) {
        onMessage = listener;
    }

    public void onCommand(@Nullable AbstractCommandListener listener) {
        onCommand = listener;
    }

    /**
     * Send message to particular peer
     *
     * @param peer       - the address peer user/channel/group
     * @param message    - message content
     * @param targetUser - message will be visible only to this UID
     * @return - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> send(@Nonnull Peer peer, @Nonnull MessageContent message, @Nullable Integer targetUser) {
        return send(peer, message, targetUser, null, null);
    }

    private CompletableFuture<UUID> send(@Nonnull Peer peer, @Nonnull MessageContent message,
                                         @Nullable Integer targetUser, @Nullable ReferencedMessages reply,
                                         @Nullable ReferencedMessages forward) {
        RequestSendMessage.Builder request = RequestSendMessage.newBuilder()
                .setDeduplicationId(MsgUtils.uniqueCurrentTimeMS())
                .setPeer(peer.toServerOutPeer())
                .setMessage(message);

        if (targetUser != null) {
            request.setIsOnlyForUser(targetUser);
        }

        if (reply != null) {
            request.setReply(reply);
        } else if (forward != null) {
            request.setForward(forward);
        }

        return internalBot.withToken(
                        MessagingGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.sendMessage(request.build()))
                .thenApply(resp -> UUIDUtils.convert(resp.getMessageId()));
    }

    /**
     * Delete message by message Id
     *
     * @param messageId - subj
     * @return - future with message UUID which has been deleted
     */
    public CompletableFuture<UUID> delete(@Nonnull UUID messageId) {
        DeletedMessage deletedMessage = DeletedMessage.newBuilder()
                .setIsLocal(BoolValue.newBuilder().setValue(false).build())
                .build();

        MessageContent messageContent = MessageContent.newBuilder()
                .setDeletedMessage(deletedMessage)
                .build();

        RequestUpdateMessage request = RequestUpdateMessage.newBuilder()
                .setMid(UUIDUtils.convertToApi(messageId))
                .setLastEditedAt(Instant.now().toEpochMilli())
                .setUpdatedMessage(messageContent)
                .build();

        return internalBot.withToken(
                        MessagingGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.updateMessage(request))
                .thenApply(res -> UUIDUtils.convert(res.getMid()));
    }

    /**
     * Delete list of messages by message Id
     *
     * @param messageIds - subj
     * @return - future
     */
    public CompletableFuture<Void> delete(List<UUID> messageIds) {
        List<Definitions.UUIDValue> mids = new ArrayList<>();

        for (UUID mid : messageIds) {
            mids.add(Definitions.UUIDValue.newBuilder()
                    .setLsb(mid.getLeastSignificantBits())
                    .setMsb(mid.getMostSignificantBits())
                    .build());
        }

        RequestDeleteMessageObsolete request = RequestDeleteMessageObsolete
                .newBuilder()
                .addAllMids(mids)
                .build();

        return internalBot.withToken(
                        MessagingGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.deleteMessageObsolete(request))
                .thenApply(t -> null);
    }

    /**
     * Send plain text to particular peer
     *
     * @param peer - the address peer user/channel/group
     * @param text - text of message
     * @return - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> sendText(@Nonnull Peer peer, @Nonnull String text) {
        return sendText(peer, text, null);
    }

    public CompletableFuture<UUID> sendFile(@Nonnull final Peer peer, @Nonnull final File file) {
        return sendFile(peer, file, "");
    }

    /**
     * Sending a file to peer
     *
     * @param peer - address peer
     * @param file - java file reference
     * @return UUID - message id
     */
    public CompletableFuture<UUID> sendFile(@Nonnull final Peer peer, @Nonnull final File file, String caption) {

        if (!file.exists()) {
            System.out.println("Not a file");
            new CompletableFuture<>().completeExceptionally(
                    new FileNotFoundException("File not found: " + file.getPath()));
        }

        if (!file.isFile()) {
            new CompletableFuture<>().completeExceptionally(
                    new FileNotFoundException("Path is not a file: " + file.getPath()));
        }
        String fileName = file.getName();
        int fileSize = (int) file.length();

        return mediaAndFilesApi.uploadFile(file).thenCompose(fileLocation -> {
            DocumentMessage document = DocumentMessage
                    .newBuilder()
                    .setFileId(fileLocation.getFileId())
                    .setAccessHash(fileLocation.getAccessHash())
                    .setFileSize(fileSize)
                    .setName(fileName)
                    .setCaption(StringValue.of(caption))
                    .build();

            MessageContent msg = MessageContent.newBuilder()
                    .setDocumentMessage(document)
                    .build();

            return send(peer, msg, null);
        });
    }

    public CompletableFuture<UUID> sendImage(@Nonnull final Peer peer, @Nonnull final File image) {
        return sendImage(peer, image, "");
    }


    /**
     * Sending a file to peer as image
     *
     * @param peer    - address peer
     * @param image   - java file reference
     * @param caption - caption to file
     * @return UUID - message id
     */
    public CompletableFuture<UUID> sendImage(@Nonnull final Peer peer, @Nonnull final File image, @Nonnull String caption) {
        if (!image.exists()) {
            new CompletableFuture<>().completeExceptionally(
                    new FileNotFoundException("File not found: " + image.getPath()));
        }

        if (!image.isFile()) {
            new CompletableFuture<>().completeExceptionally(
                    new FileNotFoundException("Path is not a file: " + image.getPath()));
        }

        String fileName = image.getName();
        int fileSize = (int) image.length();

        try (InputStream is = new BufferedInputStream(new FileInputStream(image))) {
            String mimeType = URLConnection.guessContentTypeFromStream(is);
            Dimension dimension = ImageUtils.getImageDimension(image);

            BufferedImage bufImage = ImageIO.read(image);

            BufferedImage resized = ImageUtils.resize(bufImage, 50, 50);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            ImageIO.write(resized, "jpg", baos);

            FastThumb fastThumb = FastThumb.newBuilder()
                    .setThumb(ByteString.copyFrom(baos.toByteArray()))
                    .setH(50)
                    .setW(50)
                    .build();

            DocumentExPhoto documentExPhoto = DocumentExPhoto.newBuilder()
                    .setH(dimension.height)
                    .setW(dimension.width)
                    .build();

            DocumentEx documentEx = DocumentEx.newBuilder()
                    .setPhoto(documentExPhoto)
                    .build();

            return mediaAndFilesApi.uploadFile(image)
                    .thenCompose(fileLocation -> {
                        DocumentMessage document = DocumentMessage
                                .newBuilder()
                                .setFileId(fileLocation.getFileId())
                                .setAccessHash(fileLocation.getAccessHash())
                                .setFileSize(fileSize)
                                .setName(fileName)
                                .setMimeType(mimeType)
                                .setThumb(fastThumb)
                                .setExt(documentEx)
                                .setCaption(StringValue.of(caption))
                                .build();

                        MessageContent msg = MessageContent.newBuilder()
                                .setDocumentMessage(document)
                                .build();

                        return send(peer, msg, null);
                    });
        } catch (IOException e) {
            CompletableFuture<UUID> resp = new CompletableFuture<>();
            resp.completeExceptionally(e);
            return resp;
        }
    }

    public CompletableFuture<UUID> updateImage(UUID messageId, @Nonnull final File image, @Nonnull String caption) {
        if (!image.exists()) {
            new CompletableFuture<>().completeExceptionally(
                    new FileNotFoundException("File not found: " + image.getPath()));
        }

        if (!image.isFile()) {
            new CompletableFuture<>().completeExceptionally(
                    new FileNotFoundException("Path is not a file: " + image.getPath()));
        }

        String fileName = image.getName();
        int fileSize = (int) image.length();

        try (InputStream is = new BufferedInputStream(new FileInputStream(image))) {
            String mimeType = URLConnection.guessContentTypeFromStream(is);
            Dimension dimension = ImageUtils.getImageDimension(image);

            BufferedImage bufImage = ImageIO.read(image);

            BufferedImage resized = ImageUtils.resize(bufImage, 50, 50);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            ImageIO.write(resized, "jpg", baos);

            FastThumb fastThumb = FastThumb.newBuilder()
                    .setThumb(ByteString.copyFrom(baos.toByteArray()))
                    .setH(50)
                    .setW(50)
                    .build();

            DocumentExPhoto documentExPhoto = DocumentExPhoto.newBuilder()
                    .setH(dimension.height)
                    .setW(dimension.width)
                    .build();

            DocumentEx documentEx = DocumentEx.newBuilder()
                    .setPhoto(documentExPhoto)
                    .build();

            return mediaAndFilesApi.uploadFile(image)
                    .thenCompose(fileLocation -> {
                        DocumentMessage document = DocumentMessage
                                .newBuilder()
                                .setFileId(fileLocation.getFileId())
                                .setAccessHash(fileLocation.getAccessHash())
                                .setFileSize(fileSize)
                                .setName(fileName)
                                .setMimeType(mimeType)
                                .setThumb(fastThumb)
                                .setExt(documentEx)
                                .setCaption(StringValue.of(caption))
                                .build();

                        MessageContent msg = MessageContent.newBuilder()
                                .setDocumentMessage(document)
                                .build();
                        RequestUpdateMessage request = RequestUpdateMessage.newBuilder()
                                .setMid(UUIDUtils.convertToApi(messageId))
                                .setLastEditedAt(Instant.now().toEpochMilli())
                                .setUpdatedMessage(msg)
                                .build();
                        return internalBot.withToken(
                                MessagingGrpc.newFutureStub(channel)
                                        .withDeadlineAfter(2, TimeUnit.MINUTES),
                                stub -> stub.updateMessage(request)
                        ).thenApply(res -> UUIDUtils.convert(res.getMid()));

                    });
        } catch (IOException e) {
            CompletableFuture<UUID> resp = new CompletableFuture<>();
            resp.completeExceptionally(e);
            return resp;
        }
    }

    /**
     * Send plain text to particular peer
     *
     * @param peer       - the address peer user/channel/group
     * @param text       - text of message
     * @param targetUser - message will be visible only to this UID
     * @return - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> sendText(@Nonnull Peer peer, @Nonnull String text, @Nullable Integer targetUser) {
        MessageContent msg = MessageContent.newBuilder()
                .setTextMessage(TextMessage.newBuilder().setText(text).build())
                .build();
        return send(peer, msg, targetUser);
    }

    /**
     * Update plain text to particular peer by message id
     *
     * @param messageId - the message id
     * @param text      - text of message
     * @return - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> update(UUID messageId, String text) {
        MessageContent messageContent = MessageContent.newBuilder()
                .setTextMessage(TextMessage.newBuilder().setText(text).build())
                .build();
        RequestUpdateMessage request = RequestUpdateMessage.newBuilder()
                .setMid(UUIDUtils.convertToApi(messageId))
                .setLastEditedAt(Instant.now().toEpochMilli())
                .setUpdatedMessage(messageContent)
                .build();

        return internalBot.withToken(
                MessagingGrpc.newFutureStub(channel)
                        .withDeadlineAfter(2, TimeUnit.MINUTES),
                stub -> stub.updateMessage(request)
        ).thenApply(res -> UUIDUtils.convert(res.getMid()));
    }

    /**
     * Reply on specific message
     *
     * @param peer      - the address peer user/channel/group
     * @param messageId - the message id reply to
     * @param text      - reply text
     * @return - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> reply(@Nonnull Peer peer, @Nonnull UUID messageId, @Nonnull String text) {
        MessageContent msg = MessageContent.newBuilder()
                .setTextMessage(TextMessage.newBuilder().setText(text).build())
                .build();

        ReferencedMessages reply = ReferencedMessages.newBuilder()
                .addMids(UUIDUtils.convertToApi(messageId))
                .build();
        return send(peer, msg, null, reply, null);
    }

    /**
     * Reply on specific message
     *
     * @param peer      - the address peer user/channel/group
     * @param messageId - the message ids (array) reply to
     * @param text      - reply text
     * @return - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> reply(@Nonnull Peer peer, @Nonnull List<UUID> messageId, @Nonnull String text) {
        MessageContent msg = MessageContent.newBuilder()
                .setTextMessage(TextMessage.newBuilder().setText(text).build())
                .build();

        ReferencedMessages.Builder reply = ReferencedMessages.newBuilder();
        IntStream.range(0, messageId.size()).forEach(index -> reply.addMids(UUIDUtils.convertToApi(messageId.get(index))));
        return send(peer, msg, null, reply.build(), null);
    }

    /**
     * @param peer   - the address peer user/channel/group
     * @param medias - media attachments
     * @return - future with message UUID, that completes when deliver to server
     * @see #sendMedia(Peer, List, Integer)
     */
    public CompletableFuture<UUID> sendMedia(@Nonnull Peer peer,
                                             @Nonnull List<MessageMedia> medias) {
        return sendMedia(peer, medias, null);
    }

    /**
     * Send media message to particular peer
     *
     * @param peer       - the address peer user/channel/group
     * @param medias     - media attachments
     * @param targetUser - message will be visible only to this UID
     * @return - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> sendMedia(@Nonnull Peer peer,
                                             @Nonnull List<MessageMedia> medias,
                                             @Nullable Integer targetUser) {
        TextMessage.Builder textMessage = TextMessage
                .newBuilder();
        IntStream.range(0, medias.size())
                .forEach(index ->
                        textMessage.addMedia(medias.get(index)));

        MessageContent msg = MessageContent.newBuilder()
                .setTextMessage(textMessage.build())
                .build();
        return send(peer, msg, targetUser);
    }

    /**
     * Send document message to particular peer
     *
     * @param peer     - the address peer user/channel/group
     * @param document - document/video attachment
     * @return - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> sendDocument(@Nonnull Peer peer,
                                                @Nonnull DocumentContent document) {
        return sendDocument(peer, document, null);
    }

    /**
     * Send document message to particular peer
     *
     * @param peer       - the address peer user/channel/group
     * @param document   - document/video attachment
     * @param targetUser - message will be visible only to this UID
     * @return - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> sendDocument(@Nonnull Peer peer,
                                                @Nonnull DocumentContent document,
                                                @Nullable Integer targetUser) {

        MessageContent msg = MessageContent.newBuilder()
                .setDocumentMessage(document.toServer())
                .build();
        return send(peer, msg, targetUser);
    }

    /**
     * Send sticker message to peer
     *
     * @param peer         the address peer user/channel/group
     * @param collectionId collection id sticker
     * @param stickerId    sticker id
     * @return future with message UUID
     */
    public CompletableFuture<UUID> sendSticker(@Nonnull Peer peer, Integer collectionId, Integer stickerId) {
        StickersOuterClass.RequestLoadStickerCollection request = StickersOuterClass.RequestLoadStickerCollection.newBuilder()
                .setId(collectionId)
                .build();

        return internalBot.withToken(StickersGrpc.newFutureStub(channel),
                        stub -> stub.loadStickerCollection(request)).thenApply(t -> t.getCollection().getStickersList().stream().filter(e -> e.getId() == stickerId).collect(Collectors.toList()).get(0))
                .thenCompose(sticker -> send(peer, MessageContent.newBuilder()
                        .setStickerMessage(StickerMessage.newBuilder()
                                .setEmoji(sticker.getEmoji())
                                .setImage256(sticker.getImage256())
                                .setImage512(sticker.getImage512())
                                .setStickerId(Int32Value.of(stickerId))
                                .setStickerCollectionId(Int32Value.of(collectionId))
                                .build())
                        .build(), null));

    }

    /**
     * Load history of messages in a chat
     *
     * @param peer      - peer chat
     * @param date      - date from
     * @param limit     - size of message batch
     * @param direction - direction
     * @return future with messages list
     */
    public CompletableFuture<List<Message>> load(Peer peer, Instant date, int limit, Direction direction) {
        RequestLoadHistory.Builder request = RequestLoadHistory.newBuilder()
                .setPeer(peer.toServerOutPeer())
                .setDate(date.toEpochMilli())
                .setLimit(limit)
                .addAllOptimizations(Constants.OPTIMISATIONS);

        if (direction == Direction.FORWARD) {
            request.setLoadMode(ListLoadMode.LISTLOADMODE_FORWARD);
        } else if (direction == Direction.BACKWARD) {
            request.setLoadMode(ListLoadMode.LISTLOADMODE_BACKWARD);
        } else if (direction == Direction.BOTH) {
            request.setLoadMode(ListLoadMode.LISTLOADMODE_BOTH);
        }

        return internalBot.withToken(
                        MessagingGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.loadHistory(request.build()))
                .thenApply(resp -> resp.getHistoryList().stream()
                        .map(Message::new)
                        .collect(Collectors.toList()));
    }

    public CompletableFuture<Void> loadDialogs() {
        RequestLoadDialogs requestLoadDialogs = RequestLoadDialogs.newBuilder()
                .addFilters(DialogsFilter.DIALOGSFILTER_EXCLUDEARCHIVED)
                .build();

        return internalBot.withToken(
                        MessagingGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.loadDialogs(requestLoadDialogs))
                .thenApply(t -> {
//                    System.out.println(t);
                    for (MessagingOuterClass.Dialog d : t.getDialogsList()) {
                        System.out.println(d.getMessage());
                    }
                    System.out.println(t.getUserPeersCount());
                    System.out.println(t.getDialogsCount());
                    System.out.println(t.getGroupPeersCount());
                    return null;
                });


    }

    public CompletableFuture<Message> getMessageById(UUID uuid) {
        return this.getMessagesById(Collections.singletonList(uuid)).thenApply(messages -> messages.get(0));
    }


    public CompletableFuture<List<Message>> getMessagesById(List<UUID> uuids) {
        List<Definitions.UUIDValue> apiUuid = uuids.stream().map(u -> UUIDUtils.convertToApi(u)).collect(Collectors.toList());
        RequestGetReferencedEntitites request = RequestGetReferencedEntitites.newBuilder()
                .addAllMids(apiUuid)
                .build();

        return internalBot.withToken(
                        SequenceAndUpdatesGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.getReferencedEntitites(request))
                .thenApply(resp -> resp.getMessagesList().stream()
                        .map(Message::new)
                        .collect(Collectors.toList())

                );
    }

    /**
     * Marking a message and all previous as read
     *
     * @param peer - chat peer
     * @param date - date of message
     * @return a future
     */
    public CompletableFuture<Void> read(@Nonnull Peer peer, Instant date) {
        RequestMessageRead request = RequestMessageRead.newBuilder()
                .setPeer(peer.toServerOutPeer())
                .setDate(date.toEpochMilli())
                .build();

        return internalBot.withToken(
                        MessagingGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.messageRead(request))
                .thenApply(resp -> null);
    }


    private void onReceiveMessage(@Nonnull Message message) {
        if (onMessage != null) {
            onMessage.onMessage(message);
            return;
        }

        LOGGER.debug("Got a message");
    }

    private void onCommandReceive(@Nullable CommandMessage message) {
        if (onCommand != null)
            onCommand.onCommand(message);
        LOGGER.debug("Got a command");
    }

    public enum Direction {
        FORWARD,
        BACKWARD,
        BOTH
    }

    /**
     * Delete chat
     *
     * @param peer - peer chat
     * @return a future
     */
    public CompletableFuture<Void> deleteChat(@Nonnull Peer peer) {
        RequestDeleteChat request = RequestDeleteChat.newBuilder()
                .setPeer(peer.toServerOutPeer())
                .build();

        return internalBot.withToken(
                        MessagingGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.deleteChat(request))
                .thenApply(resp -> null);
    }
}
