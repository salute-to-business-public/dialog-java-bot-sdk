package im.dlg.botsdk.api;

import im.dlg.botsdk.internal.InternalBot;
import im.dlg.botsdk.model.Peer;
import im.dlg.botsdk.model.thread.ChatConversation;
import im.dlg.botsdk.model.thread.SubscribedThreadGroup;
import im.dlg.botsdk.utils.UUIDUtils;
import im.dlg.grpc.services.ThreadsGrpc;
import im.dlg.grpc.services.ThreadsOuterClass;
import io.grpc.ManagedChannel;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Slf4j
public class ThreadApi {

    private ManagedChannel channel;
    private InternalBot internalBot;

    public ThreadApi(ManagedChannel channel, InternalBot internalBot) {

        this.channel = channel;
        this.internalBot = internalBot;
    }


    /**
     * Создаёт тред у сообщения в группе
     *
     * @param groupPeer - Peer группы
     * @param messageId - UUID сообщения
     * @return CompletableFuture с Peer обсуждения
     */
    public CompletableFuture<Peer> createThread(Peer groupPeer, UUID messageId) {
        ThreadsOuterClass.RequestCreateThread request = ThreadsOuterClass.RequestCreateThread.newBuilder()
                .setGroupPeer(groupPeer.toServerGroupOutPeer())
                .setRootMessageId(UUIDUtils.convertToApi(messageId))
                .build();
        return internalBot.withToken(
                        ThreadsGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.createThread(request))
                .handle((result, ex) -> {

                    if (ex != null){
                        return null;
                    }
                    return result;
                })
                .thenApply(resp -> {
                    Peer peer = new Peer(resp.getPeer());
                    internalBot.putOutPeer(peer);
                    return peer;

                });
    }


    /**
     * Возвращает обсуждения в группе
     *
     * @param peer - Peer группы
     * @param limit - Максимальное число обсуждений
     * @see #getConversationThreads(Peer, int, long)
     * @return CompletableFuture с данными об обсуждениях
     */
    public CompletableFuture<List<ChatConversation>> getConversationThreads(Peer peer, int limit) {
        return getConversationThreads(peer, limit, 0);
    }

    /**
     * Возвращает обсуждения в группе
     *
     * @param peer - Peer группы
     * @return CompletableFuture с данными об обсуждениях
     * @see #getConversationThreads(Peer, int, long)
     */
    public CompletableFuture<List<ChatConversation>> getConversationThreads(Peer peer) {
        return getConversationThreads(peer, 100, 0);
    }


    /**
     * Возвращает обсуждения в группе
     *
     * @param peer - Peer группы
     * @param limit - Максимальное число обсуждений
     * @param fromClock дата с которого начинается поиск
     * @return CompletableFuture с данными об обсуждениях
     * @see #getConversationThreads(Peer, int, long)
     */
    public CompletableFuture<List<ChatConversation>> getConversationThreads(Peer peer, int limit, long fromClock) {
        ThreadsOuterClass.RequestGetConversationThreads request = ThreadsOuterClass.RequestGetConversationThreads.newBuilder()
                .setGroupPeer(peer.toServerGroupOutPeer())
                .setLimit(limit)
                .setFromClock(fromClock)
                .build();

        return internalBot.withToken(
                        ThreadsGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.getConversationThreads(request))
                .thenApply(resp -> {
                    return resp.getThreadsList().stream().map(ChatConversation::new).collect(Collectors.toList());
                });
    }

    /**
     * Возвращает обсуждени в группе
     *
     * @param peer - Peer группы
     * @return CompletableFuture с данными об обсуждении
     */
    public CompletableFuture<Optional<ChatConversation>> getThread(Peer peer) {
        List<Peer> peers = new ArrayList<>();
        peers.add(peer);
        return getThreads(peers).thenApply(threads -> {
            if (threads.isEmpty()) return Optional.empty();
            return Optional.of(threads.get(0));
        });
    }

    /**
     * Возвращает обсуждения в группе
     *
     * @param peers - Peer-ы группы
     * @return CompletableFuture с данными об обсуждениях
     */
    public CompletableFuture<List<ChatConversation>> getThreads(List<Peer> peers) {
        ThreadsOuterClass.RequestGetThreads request = ThreadsOuterClass.RequestGetThreads.newBuilder()
                .addAllThreadOutPeers(peers.stream().map(p -> p.toServerThreadOutPeer()).collect(Collectors.toList()))
                .build();

        return internalBot.withToken(
                        ThreadsGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.getThreads(request))
                .thenApply(resp -> {
                    return resp.getThreadsList().stream().map(ChatConversation::new).collect(Collectors.toList());
                });
    }

    /**
     * Возвращает 100 сохранённых тредов
     *
     * @return CompletableFuture данными о подписках на треды
     * @see #getSubscribed(int)
     */
    public CompletableFuture<List<SubscribedThreadGroup>> getSubscribed() {
        return getSubscribed(100);
    }


    /**
     * Возвращает сохарненные треды
     * @param limit количество тредов
     * @return CompletableFuture данными о подписках на треды
     */
    public CompletableFuture<List<SubscribedThreadGroup>> getSubscribed(int limit) {
        ThreadsOuterClass.RequestSubscribedThreads request = ThreadsOuterClass.RequestSubscribedThreads.newBuilder()
                .setLimit(limit)
                .build();

        return internalBot.withToken(
                        ThreadsGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.getSubscribedThreads(request))
                .thenApply(resp -> resp.getThreadGroups2List().stream().map(SubscribedThreadGroup::new).collect(Collectors.toList()));

    }

    /**
     * Подписаться на тред
     * @param peer Peer треда
     * @return CompletableFuture
     */
    public CompletableFuture<Void> subscribe(Peer peer) {
        ThreadsOuterClass.RequestSubscribeToThread request = ThreadsOuterClass.RequestSubscribeToThread.newBuilder()
                .setThreadPeer(peer.toServerThreadOutPeer())
                .build();

        return internalBot.withToken(
                        ThreadsGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.subscribe(request))
                .thenApply(resp -> null);
    }

    /**
     * Отписаться от треда
     * @param peer Peer треда
     * @return CompletableFuture
     */
    public CompletableFuture<Void> unsubscribe(Peer peer) {
        ThreadsOuterClass.RequestUnsubscribeFromThread request = ThreadsOuterClass.RequestUnsubscribeFromThread.newBuilder()
                .setThreadPeer(peer.toServerThreadOutPeer())
                .build();

        return internalBot.withToken(
                        ThreadsGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.unsubscribe(request))
                .thenApply(resp -> null);
    }

    /**
     * Отписаться от всех тредов
     * @return CompletableFuture
     */
    public CompletableFuture<Void> unsubscribeFromAllThreads() {
        ThreadsOuterClass.RequestUnsubscribeFromAllThreads request = ThreadsOuterClass.RequestUnsubscribeFromAllThreads.newBuilder()
                .build();

        return internalBot.withToken(
                        ThreadsGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                        stub -> stub.unsubscribeFromAllThreads(request))
                .thenApply(resp -> null);
    }
}
