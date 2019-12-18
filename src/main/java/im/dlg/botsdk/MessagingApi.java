package im.dlg.botsdk;

import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import dialog.Definitions;
import dialog.MessagingGrpc;
import dialog.MessagingOuterClass;
import dialog.MessagingOuterClass.*;
import dialog.Peers;
import im.dlg.botsdk.domain.Message;
import im.dlg.botsdk.domain.Peer;
import im.dlg.botsdk.domain.content.Content;
import im.dlg.botsdk.domain.content.DocumentContent;
import im.dlg.botsdk.light.MessageListener;
import im.dlg.botsdk.utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static dialog.MediaAndFilesOuterClass.FastThumb;

/**
 * Central class for messaging API
 */
public class MessagingApi {

    private final Logger log = LoggerFactory.getLogger(MessagingApi.class);

    private InternalBotApi privateBot;
    private MessageListener onMessage = null;

    MessagingApi(InternalBotApi privateBot) {
        this.privateBot = privateBot;

        privateBot.subscribeOn(UpdateMessage.class, msg -> {
            try {
                String _text = "";

                if (msg.getMessage().hasTextMessage()) {
                    _text = msg.getMessage().getTextMessage().getText();
                } else if (msg.getMessage().hasDocumentMessage()) {
                    _text = String.valueOf(msg.getMessage().getDocumentMessage().getFileId());
                }

                final String text = _text;

                privateBot.findOutPeer(msg.getPeer()).thenAccept(optOutPeer -> {
                    optOutPeer.ifPresent(outPeer -> {
                        privateBot.loadSenderOutPeer(msg.getSenderUid(), outPeer, msg.getDate())
                                .thenAcceptAsync(optSenderOutPeer ->
                                        optSenderOutPeer.ifPresent(senderOutPeer -> {
                                            final UUID uuid = UUIDUtils.convert(msg.getMid());
                                            onReceiveMessage(new Message(
                                                    PeerUtils.toDomainPeer(outPeer),
                                                    PeerUtils.toDomainPeer(senderOutPeer),
                                                    uuid, text, msg.getDate(), Content.fromMessage(msg.getMessage())));
                                        })
                                );
                    });
                });
            } catch (Throwable th) {
                log.error("Failed to init MessagingApi", th);
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

        Peers.OutPeer outPeer = PeerUtils.toServerOutPeer(peer);
        RequestSendMessage.Builder request = RequestSendMessage.newBuilder().setDeduplicationId(MsgUtils.uniqueCurrentTimeMS())
                .setPeer(outPeer).setMessage(message);

        if (targetUser != null) {
            request.setIsOnlyForUser(targetUser);
        }

        if (reply != null) {
            request.setReply(reply);
        } else if (forward != null) {
            request.setForward(forward);
        }

        return privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel.getChannel())
                        .withDeadlineAfter(2, TimeUnit.MINUTES),
                stub -> stub.sendMessage(request.build())
        ).thenApplyAsync(resp -> UUIDUtils.convert(resp.getMessageId()), privateBot.executor.getExecutor());
    }

    /**
     * Delete message by message Id
     *
     * @param messageId  - subj
     * @return - future with message UUID which has been deleted
     */
    public CompletableFuture<UUID> delete(@Nonnull UUID messageId) {
        Date date = new Date();
        BoolValue boolValue = BoolValue.newBuilder().setValue(false).build();
        DeletedMessage deletedMessage = DeletedMessage.newBuilder()
                .setIsLocal(boolValue)
                .build();
        MessageContent messageContent = MessageContent.newBuilder()
                .setDeletedMessage(deletedMessage)
                .build();
        RequestUpdateMessage request = RequestUpdateMessage.newBuilder()
                .setMid(UUIDUtils.convertToApi(messageId))
                .setLastEditedAt(date.getTime())
                .setUpdatedMessage(messageContent)
                .build();

        return privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel.getChannel())
                        .withDeadlineAfter(2, TimeUnit.MINUTES),
                stub -> stub.updateMessage(request)
        ).thenApplyAsync(res -> UUIDUtils.convert(res.getMid()));
    }

    /**
     * Delete list of messages by message Id
     *
     * @param messageIds  - subj
     */
    public void delete(List<UUID> messageIds){
        List<Definitions.UUIDValue> mids = new ArrayList<Definitions.UUIDValue>();
        for (UUID mid: messageIds){
            mids.add(Definitions.UUIDValue.newBuilder()
                    .setLsb(mid.getLeastSignificantBits())
                    .setMsb(mid.getMostSignificantBits())
                    .build());
        }
        MessagingOuterClass.RequestDeleteMessageObsolete request = RequestDeleteMessageObsolete
                .newBuilder()
                .addAllMids(mids)
                .build();
        privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel.getChannel())
                        .withDeadlineAfter(2, TimeUnit.MINUTES),
                stub -> stub.deleteMessageObsolete(request));
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

    /**
     * Sending a file to peer
     *
     * @param peer - address peer
     * @param file - java file reference
     * @return UUID - message id
     */
    public CompletableFuture<UUID> sendFile(@Nonnull final Peer peer, @Nonnull final File file) {

        if (!file.exists()) {
            new CompletableFuture<>().completeExceptionally(
                    new FileNotFoundException("File not found: " + file.getPath()));
        }

        if (!file.isFile()) {
            new CompletableFuture<>().completeExceptionally(
                    new FileNotFoundException("Path is not a file: " + file.getPath()));
        }

        String fileName = file.getName();
        int fileSize = (int) file.length();

        return MediaAndFilesApi.upLoadFile(file, "application/octet-stream").thenCompose(fileLocation -> {
            DocumentMessage document = DocumentMessage
                    .newBuilder()
                    .setFileId(fileLocation.getFileId())
                    .setAccessHash(fileLocation.getAccessHash())
                    .setFileSize(fileSize)
                    .setName(fileName)
                    .setMimeType("application/octet-stream")
                    .build();

            MessageContent msg = MessageContent.newBuilder()
                    .setDocumentMessage(document)
                    .build();

            return send(peer, msg, null);
        });
    }

    /**
     * Sending a file to peer
     *
     * @param peer - address peer
     * @param image - java file reference
     * @return UUID - message id
     */
    public CompletableFuture<UUID> sendImage(@Nonnull final Peer peer, @Nonnull final File image) {
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

        CompletableFuture<UUID> resp = new CompletableFuture<>();

        try {

            InputStream is = new BufferedInputStream(new FileInputStream(image));
            String mimeType = URLConnection.guessContentTypeFromStream(is);
            is.close();

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

            resp = MediaAndFilesApi.upLoadFile(image, mimeType)
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
                                .build();

                        MessageContent msg = MessageContent.newBuilder()
                                .setDocumentMessage(document)
                                .build();

                        return send(peer, msg, null);
                    });
        } catch (IOException e) {
            resp = new CompletableFuture<>();
            resp.completeExceptionally(e);
        }

        return resp;
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
     * @param messageId  - the message id
     * @param text       - text of message
     * @return           - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> update(UUID messageId, String text){
        Date date = new Date();
        MessageContent messageContent = MessageContent.newBuilder()
                .setTextMessage(TextMessage.newBuilder().setText(text).build())
                .build();
        RequestUpdateMessage request = RequestUpdateMessage.newBuilder()
                .setMid(UUIDUtils.convertToApi(messageId))
                .setLastEditedAt(date.getTime())
                .setUpdatedMessage(messageContent)
                .build();

        return privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel.getChannel())
                        .withDeadlineAfter(2, TimeUnit.MINUTES),
                stub -> stub.updateMessage(request)
        ).thenApplyAsync(res -> UUIDUtils.convert(res.getMid()));
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
        DocumentMessage documentMessage = DocumentContent.createDocumentMessage(document);

        MessageContent msg = MessageContent.newBuilder()
                .setDocumentMessage(documentMessage)
                .build();
        return send(peer, msg, targetUser);
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
    public CompletableFuture<List<Message>> load(Peer peer, long date, int limit, Direction direction) {

        RequestLoadHistory.Builder request =
                RequestLoadHistory.newBuilder()
                        .setPeer(PeerUtils.toServerOutPeer(peer))
                        .setDate(date).setLimit(limit)
                        .addAllOptimizations(Constants.OPTIMISATIONS);

        if (direction == Direction.FORWARD) {
            request.setLoadMode(ListLoadMode.LISTLOADMODE_FORWARD);
        } else if (direction == Direction.BACKWARD) {
            request.setLoadMode(ListLoadMode.LISTLOADMODE_BACKWARD);
        } else if (direction == Direction.BOTH) {
            request.setLoadMode(ListLoadMode.LISTLOADMODE_BOTH);
        }

        return privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel.getChannel())
                        .withDeadlineAfter(2, TimeUnit.MINUTES),
                stub -> stub.loadHistory(request.build())
        ).thenApplyAsync(resp -> resp.getHistoryList().stream()
                .map(MsgUtils::toMessage).collect(Collectors.toList()));
    }

    /**
     * Marking a message and all previous as read
     *
     * @param peer - chat peer
     * @param date - date of message
     * @return a future
     */
    public CompletableFuture<Void> read(@Nonnull Peer peer, long date) {
        RequestMessageRead request = RequestMessageRead.newBuilder()
                .setPeer(PeerUtils.toServerOutPeer(peer)).setDate(date).build();

        return privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel.getChannel())
                        .withDeadlineAfter(2, TimeUnit.MINUTES),
                stub -> stub.messageRead(request)
        ).thenApplyAsync(resp -> null, privateBot.executor.getExecutor());
    }

    private void onReceiveMessage(@Nonnull Message message) {
        if (onMessage != null) {
            onMessage.onMessage(message);
            return;
        }

        log.debug("Got a message");
    }

    public enum Direction {
        FORWARD,
        BACKWARD,
        BOTH
    }

    /**
     * Delete chat
     * @param peer - peer chat
     * @return a future
     */
    public CompletableFuture<Void> deleteChat(@Nonnull Peer peer) {
        RequestDeleteChat request = RequestDeleteChat.newBuilder()
                .setPeer(PeerUtils.toServerOutPeer(peer)).build();
        return privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel.getChannel())
                        .withDeadlineAfter(2, TimeUnit.MINUTES),
                stub -> stub.deleteChat(request)
        ).thenApplyAsync(resp -> null, privateBot.executor.getExecutor());
    }
}
