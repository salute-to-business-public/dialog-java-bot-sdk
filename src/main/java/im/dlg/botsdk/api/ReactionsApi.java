package im.dlg.botsdk.api;

import im.dlg.botsdk.listeners.ReactionListener;
import im.dlg.botsdk.model.reactions.MessageReaction;
import im.dlg.botsdk.model.reactions.Reaction;
import im.dlg.botsdk.utils.UUIDUtils;
import im.dlg.grpc.services.ReactionsGrpc;
import im.dlg.grpc.services.ReactionsOuterClass;
import im.dlg.grpc.services.ReactionsOuterClass.*;
import io.grpc.ManagedChannel;
import im.dlg.botsdk.internal.InternalBot;
import im.dlg.botsdk.model.Peer;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ReactionsApi {
    private final ManagedChannel channel;
    private final InternalBot internalBot;
    private ReactionListener reactionListener = null;

    public ReactionsApi(ManagedChannel channel, InternalBot internalBot) {
        this.channel = channel;
        this.internalBot = internalBot;
        internalBot.subscribeOn(MessageReactionsUpdate.class, reaction -> {
            MessageReaction reaction1 = new MessageReaction(reaction);
            if (reactionListener!= null){
                reactionListener.onReaction(new Peer(reaction.getPeer()),reaction1);
            }
        });
    }

    /**
     * Get reactions
     *
     * @param peer      Dialog peer
     * @param fromClock From clock
     * @return Future with list message reactions
     */
    public CompletableFuture<List<MessageReaction>> getReactions(Peer peer, int fromClock) {
        GetReactionsRequest request = GetReactionsRequest.newBuilder()
                .setPeer(peer.toServerPeer())
                .setFromClock(fromClock)
                .build();

        return internalBot.withToken(ReactionsGrpc.newFutureStub(channel),
                stub -> stub.getReactions(request))
                .thenApply(r -> r.getMessageReactionsList().stream().map(MessageReaction::new)
                        .collect(Collectors.toList()));
    }

    /**
     * Get reactions
     *
     * @param peer      Dialog peer
     * @param messagesId Message uids
     * @return Future with list message reactions
     */
    public CompletableFuture<List<MessageReaction>> getMessageReaction(Peer peer, List<UUID> messagesId){
        GetMessageReactionsRequest request = GetMessageReactionsRequest.newBuilder()
                .setPeer(peer.toServerPeer())
                .addAllMessageIds(messagesId.stream().map(UUIDUtils::convertToApi).collect(Collectors.toList()))
                .build();
        return internalBot.withToken(ReactionsGrpc.newFutureStub(channel),
                stub -> stub.getMessageReactions(request))
                .thenApply(t -> t.getMessageReactionsList().stream().map(MessageReaction::new).collect(Collectors.toList()));
    }

    /**
     * Set reaction to message
     * @param peer Dialog peer
     * @param mid Message id
     * @param code Emoji code
     * @return a feature
     */
    public CompletableFuture<Void> setMessageReaction(Peer peer, UUID mid, String code){
        RequestSetMessageReaction request = RequestSetMessageReaction.newBuilder()
                .setPeer(peer.toServerPeer())
                .setCode(code)
                .setMid(UUIDUtils.convertToApi(mid))
                .build();
        return internalBot.withToken(ReactionsGrpc.newFutureStub(channel),
                stub -> stub.messageSetReaction(request)).thenApply(t -> null);
    }

    /**
     * Remove reaction from message
     * @param peer Dialog peer
     * @param mid Message id
     * @param code Emoji code
     * @return a feature
     */
    public CompletableFuture<Void> removeMessageReaction(Peer peer, UUID mid, String code){
        RequestRemoveMessageReaction request = RequestRemoveMessageReaction.newBuilder()
                .setPeer(peer.toServerPeer())
                .setMid(UUIDUtils.convertToApi(mid))
                .setCode(code)
                .build();

        return internalBot.withToken(ReactionsGrpc.newFutureStub(channel),
                stub -> stub.messageRemoveReaction(request)).thenApply(t -> null);
    }

    public void onReaction(ReactionListener listener){
        reactionListener = listener;
    }




}
