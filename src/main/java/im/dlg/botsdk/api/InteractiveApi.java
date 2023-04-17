package im.dlg.botsdk.api;

import com.google.protobuf.StringValue;
import im.dlg.botsdk.internal.InternalBot;
import im.dlg.botsdk.listeners.InteractiveEventListener;
import im.dlg.botsdk.model.InteractiveEvent;
import im.dlg.botsdk.model.Peer;
import im.dlg.botsdk.model.interactive.*;
import im.dlg.botsdk.utils.MsgUtils;
import im.dlg.botsdk.utils.UUIDUtils;
import im.dlg.grpc.services.MessagingGrpc;
import im.dlg.grpc.services.MessagingOuterClass;
import im.dlg.grpc.services.MessagingOuterClass.*;
import io.grpc.ManagedChannel;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * Api class for all the interactive requests, subscriptions
 */
public class InteractiveApi {

    private final Logger log = LoggerFactory.getLogger(InteractiveApi.class);

    private final ManagedChannel channel;
    private final InternalBot internalBot;
    private InteractiveEventListener listener = null;
    private final MessagingApi messagingApi;

    public InteractiveApi(ManagedChannel channel, InternalBot internalBot, MessagingApi messagingApi) {
        this.channel = channel;
        this.internalBot = internalBot;
        this.messagingApi = messagingApi;

        internalBot.subscribeOn(UpdateInteractiveMediaEvent.class, evt -> {
            try {
                internalBot
                        .findUserOutPeer(evt.getUid())
                        .thenAccept(opt -> opt.ifPresent(outPeer -> onEventInternal(new InteractiveEvent(UUIDUtils.convert(evt.getMid()), evt.getId(),
                        evt.getValue(), new Peer(outPeer)))));
            } catch (Throwable throwable) {
                log.error("Failed to subscribe", throwable);
            }
        });
    }

    /**
     * Subscribe on interactive events
     *
     * @param listener - listener callback
     */
    @SuppressWarnings("unused")
    public void onEvent(InteractiveEventListener listener) {
        this.listener = listener;
    }

    /**
     * Send an interactive action group to particular peer
     *
     * @param peer  - the address peer user/channel/group
     * @param group - group of interactive elements
     * @return - future with message UUID, that completes when deliver to server
     */
    @SuppressWarnings("unused")
    public CompletableFuture<UUID> send(@Nonnull Peer peer, @Nonnull InteractiveGroup group) {
        return send(peer, group, null, null );
    }

    /**
     * Update the interactive message, change elements
     *
     * @param uuid  - message UUID
     * @param group - new widgets group
     * @return - future with message UUID, that completes when deliver to server
     */
    @SuppressWarnings("unused")
    public CompletableFuture<UUID> update(@Nonnull UUID uuid, @Nonnull InteractiveGroup group) {
        return update(uuid, group, null);
    }

    public CompletableFuture<UUID> send(@Nonnull Peer peer, @Nonnull List<InteractiveGroup> group){
        return send(peer, group);
    }

    public CompletableFuture<UUID> send(@Nonnull Peer peer, @Nonnull List<InteractiveGroup> group, @Nullable Integer target){
        return send(peer, group, null, target);
    }

    public CompletableFuture<UUID> send(@Nonnull Peer peer, @Nonnull List<InteractiveGroup> group, @Nullable String text){
        return send(peer, group, text, null);
    }

    public CompletableFuture<UUID> send(@Nonnull Peer peer, @Nonnull List<InteractiveGroup> group, @Nullable String text, Integer target) {
        RequestSendMessage.Builder request = RequestSendMessage.newBuilder()
                .setDeduplicationId(MsgUtils.uniqueCurrentTimeMS())
                .setPeer(peer.toServerOutPeer());

        request.setMessage(buildMessageContent(group, text));

        if (target != null){
            request.setIsOnlyForUser(target);
        }

        return internalBot.withToken(
                MessagingGrpc.newFutureStub(channel),
                stub -> stub.sendMessage(request.build()))
                .thenApply(resp -> UUIDUtils.convert(resp.getMessageId()));
    }

    /**
     * Send an interactive action group and text to particular peer
     *
     * @param peer  - the address peer user/channel/group
     * @param group - group of interactive elements
     * @param text - message text (may be null)
     * @return - future with message UUID, that completes when deliver to server
     */
    public CompletableFuture<UUID> send(@Nonnull Peer peer, @Nonnull InteractiveGroup group, @Nullable String text, @Nullable Integer target) {
        ArrayList<InteractiveGroup> groups = new ArrayList<>();
        groups.add(group);
        return send(peer, groups, text, target);
    }

    public CompletableFuture<UUID> send(@Nonnull Peer peer, @Nonnull InteractiveGroup group, @Nullable Integer target){
        return send(peer, group, null, target );
    }

    public CompletableFuture<UUID> send(@Nonnull Peer peer, @Nonnull InteractiveGroup group, @Nullable String text){
        return send(peer, group, text, null );
    }

    /**
     * Update the interactive message, change elements
     *
     * @param uuid  - message UUID
     * @param group - new widgets group
     * @param text - message text (may be null)
     * @return - future with message UUID, that completes when deliver to server
     */
    @SuppressWarnings("unused")
    public CompletableFuture<UUID> update(@Nonnull UUID uuid, @Nonnull InteractiveGroup group, @Nullable String text) {
        RequestUpdateMessage.Builder request = RequestUpdateMessage.newBuilder()
                .setMid(UUIDUtils.convertToApi(uuid))
                .setLastEditedAt(Instant.now().toEpochMilli());

        request.setUpdatedMessage(buildMessageContent(group, text));

        return internalBot.withToken(
                MessagingGrpc.newFutureStub(channel),
                stub -> stub.updateMessage(request.build()))
                .thenApply(resp -> UUIDUtils.convert(resp.getMid()));
    }

    public CompletableFuture<Void> doInteractiveAction(UUID uuid, String id){
        RequestDoInteractiveMediaAction request = RequestDoInteractiveMediaAction.newBuilder()
                .setMid(UUIDUtils.convertToApi(uuid))
                .setId(id)
                .build();
        return internalBot.withToken(
                MessagingGrpc.newFutureStub(channel),
                stub -> stub.doInteractiveMediaAction(request)).thenCompose(t -> null);
    }

    private MessageContent buildMessageContent(List<InteractiveGroup> groups, String text){
        List<InteractiveMediaGroup> apiMediaGroups = new ArrayList<>();
        for (InteractiveGroup group: groups) {
            apiMediaGroups.add(group.toServer());
        }

        MessageMedia messageMedia = MessageMedia.newBuilder()
                .addAllActions(apiMediaGroups)
                .build();

        TextMessage.Builder textAndMedia = TextMessage.newBuilder().addMedia(messageMedia);
        if (text != null) {
            textAndMedia.setText(text);
        }

        return MessageContent.newBuilder()
                .setTextMessage(textAndMedia.build())
                .build();
    }

    private MessageContent buildMessageContent(InteractiveGroup group, String text) {
        ArrayList<InteractiveGroup> groups = new ArrayList<>();
        groups.add(group);
        return buildMessageContent(groups, text);
    }

    private void onEventInternal(InteractiveEvent event) {
        if (listener != null) {
            listener.onEvent(event);
            return;
        }

        log.debug("Got an event");
    }
}
