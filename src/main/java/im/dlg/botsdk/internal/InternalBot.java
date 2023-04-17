package im.dlg.botsdk.internal;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.StringValue;
import im.dlg.botsdk.BotConfig;
import im.dlg.botsdk.BotCredentials;
import im.dlg.botsdk.listeners.UpdateListener;
import im.dlg.botsdk.model.Message;
import im.dlg.botsdk.model.Peer;
import im.dlg.botsdk.model.content.Content;
import im.dlg.botsdk.retry.TaskManager;
import im.dlg.botsdk.utils.Constants;
import im.dlg.botsdk.utils.UUIDUtils;
import im.dlg.grpc.services.*;
import im.dlg.grpc.services.MessagingOuterClass.HistoryMessage;
import im.dlg.grpc.services.MessagingOuterClass.ListLoadMode;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.futureconverter.java8guava.FutureConverter;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

import static im.dlg.grpc.services.AuthenticationOuterClass.*;
import static im.dlg.grpc.services.Peers.*;
import static im.dlg.grpc.services.RegistrationOuterClass.RequestRegisterDevice;
import static im.dlg.grpc.services.SequenceAndUpdatesOuterClass.*;

@Slf4j
public class InternalBot {

    public static final long RECONNECT_DELAY = 1000;
    private static final Integer APP_ID = 11011;

    private final Map<String, OutPeer> outPeerMap = new ConcurrentHashMap<>();
    private final Map<Class, List<UpdateListener>> subscribers = new ConcurrentHashMap<>();
    private final AtomicInteger currentSequence = new AtomicInteger();
    private final InternalBotStream stream = new InternalBotStream(this, currentSequence);

    private final ManagedChannel channel;
    private final BotConfig config;
    private final boolean anonymousAuth;

    private volatile Metadata metadata;

    public InternalBot(ManagedChannel channel, BotConfig config, boolean anonymousAuth) {
        this.channel = channel;
        this.config = config;
        this.anonymousAuth = anonymousAuth;
    }

    @Getter
    private Integer botId;

    public CompletableFuture<Void> start() {
        CompletableFuture<Metadata> meta = new CompletableFuture<>();

        RequestRegisterDevice request = RequestRegisterDevice.newBuilder()
                .setAppId(APP_ID)
                .setAppTitle(config.getName())
                .setDeviceTitle(config.getName())
                .build();

        return FutureConverter.toCompletableFuture(
                RegistrationGrpc.newFutureStub(channel).registerDevice(request)
        ).whenComplete((res, t) -> {
            if (res == null) {
                meta.completeExceptionally(t);
                return;
            }

            Metadata header = new Metadata();
            Metadata.Key<String> key = Metadata.Key.of("x-auth-ticket", Metadata.ASCII_STRING_MARSHALLER);
            header.put(key, res.getToken());

            meta.complete(header);
            metadata = header;
            log.info("Bot registered with token = {}", res.getToken());

        }).thenCompose(res -> meta).thenCompose(m -> {
            if (anonymousAuth) {
                return FutureConverter.toCompletableFuture(withToken(m,
                        AuthenticationGrpc.newFutureStub(channel),
                        stub -> stub.startAnonymousAuth(
                                RequestStartAnonymousAuth.newBuilder()
                                        .addPreferredLanguages("RU")
                                        .setTimeZone(StringValue.newBuilder().setValue("+3").build())
                                        .build()
                        )
                )).thenApply(res -> new ImmutablePair<>(res.getUser(), m));
            } else if (config.getCredentials() != null) {
                BotCredentials credentials = config.getCredentials();

                switch (credentials.getMethod()) {
                    case TOKEN:
                        return FutureConverter.toCompletableFuture(withToken(m,
                                AuthenticationGrpc.newFutureStub(channel),
                                stub -> stub.startTokenAuth(
                                        RequestStartTokenAuth.newBuilder()
                                                .addPreferredLanguages("RU")
                                                .setTimeZone(StringValue.newBuilder().setValue("+3").build())
                                                .setToken(credentials.getValue())
                                                .build()
                                )
                        )).thenApply(res -> new ImmutablePair<>(res.getUser(), m));
                    case PASSWORD:
                        return FutureConverter.toCompletableFuture(withToken(m,
                                        AuthenticationGrpc.newFutureStub(channel),
                                        stub -> stub.startUsernameAuth(
                                                RequestStartUsernameAuth.newBuilder()
                                                        .setUsername(config.getName())
                                                        .addPreferredLanguages("RU")
                                                        .setTimeZone(StringValue.newBuilder().setValue("+3").build())
                                                        .build()
                                        )))
                                .thenCompose(res -> FutureConverter.toCompletableFuture(withToken(m,
                                        AuthenticationGrpc.newFutureStub(channel),
                                        stub -> stub.validatePassword(
                                                RequestValidatePassword.newBuilder()
                                                        .setTransactionHash(res.getTransactionHash())
                                                        .setPassword(credentials.getValue())
                                                        .build()
                                        ))))
                                .thenApply(res -> new ImmutablePair<>(res.getUser(), m));
                    default:
                        return null;
                }
            } else {
                return null;
            }
        }).thenApply(p -> {
            withToken(p.getRight(),
                    SequenceAndUpdatesGrpc.newStub(channel),
                    stub -> {
                        stub.seqUpdates(Empty.newBuilder().build(), stream);
                        return null;
                    }
            );

            botId = p.getLeft().getId();
            log.info("Bot authorized with id = {}", p.getLeft().getId());
            return null;
        });
    }

    public void reconnect() {
        withToken(metadata, SequenceAndUpdatesGrpc.newStub(channel), stub -> {
            stub.seqUpdates(Empty.newBuilder().build(), stream);
            return new Object();
        });
    }

    public <T extends AbstractStub<T>, R> CompletableFuture<R> withToken(T stub, Function<T, ListenableFuture<R>> f) {
        T newStub = metadata != null ? MetadataUtils.attachHeaders(stub, metadata) : stub;
        TaskManager<R> task = new TaskManager<>(FutureConverter.toCompletableFuture(f.apply(newStub)), config.getRetryOptions());
        return task.scheduleTask(0);
    }

    public <T extends AbstractStub<T>, R> R withToken(Metadata meta, T stub, Function<T, R> f) {
        T newStub = MetadataUtils.attachHeaders(stub, meta);
        return f.apply(newStub);
    }

    public <T extends AbstractStub<T>, R> StreamObserver<R> withObserverToken(T stub, Function<T, StreamObserver<R>> f) {
        T newStub = MetadataUtils.attachHeaders(stub, metadata);
        return f.apply(newStub);
    }

    public CompletableFuture<Optional<OutPeer>> findOutPeer(Peer peer) {
        String peerHash = peer.hash();
        OutPeer outPeer = outPeerMap.get(peerHash);
        if (outPeer != null) {
            return CompletableFuture.completedFuture(Optional.of(outPeer));
        }

        return setHashsetOutPeer(peer.toServerPeer())
                .thenApply(x -> outPeerMap.containsKey(peerHash) ?
                        Optional.of(outPeerMap.get(peerHash)) : Optional.empty());
    }

    private CompletableFuture<Void> setHashsetOutPeer(Peers.Peer peer) {
        String peerHash = new Peer(peer).hash();
        if (peer.getType() == PeerType.PEERTYPE_PRIVATE) {

            UsersOuterClass.RequestLoadUserData.Claim claim = UsersOuterClass.RequestLoadUserData.Claim.newBuilder()
                    .setUserPeer(peer)
                    .setP2P(true)
                    .build();


            UsersOuterClass.RequestLoadUserData request = UsersOuterClass.RequestLoadUserData.newBuilder()
                    .addClaims(claim)
                    .addClaims(UsersOuterClass.RequestLoadUserData.Claim.newBuilder()
                            .build())
                    .build();

            return withToken(UsersGrpc.newFutureStub(channel),
                    stub -> stub.loadUserData(request))
                    .thenAccept(res -> {
                        res.getUsersList().forEach(u ->
                        {
                            outPeerMap.put(peerHash,
                                    new Peer(u.getId(),
                                            Peer.PeerType.PRIVATE,
                                            u.getAccessHash()).toServerOutPeer());
                        });
                    });
        } else {
            outPeerMap.put(peerHash, new Peer(peer).toServerOutPeer());
            return CompletableFuture.completedFuture(null);
//            GroupOutPeer groupOutPeer = GroupOutPeer.newBuilder()
//                    .setGroupId(peer.getId())
//                    .setAccessHash(0)
//                    .build();
//            RequestGetReferencedEntitites request = RequestGetReferencedEntitites.newBuilder()
//                    .addGroups(groupOutPeer)
//                    .build();
//
//            return withToken(SequenceAndUpdatesGrpc.newFutureStub(channel),
//                    stub -> stub.getReferencedEntitites(request))
//                    .thenAccept(res -> res.getGroupsList()
//                            .forEach(g -> outPeerMap.put(peerHash,
//                                    new Peer(g.getId(),
//                                            Peer.PeerType.GROUP,
//                                            g.getAccessHash()).toServerOutPeer())));
        }
    }

    public CompletableFuture<Optional<OutPeer>> loadSenderOutPeer(Integer senderId, OutPeer peer, long date) {
        Peer senderPeer = new Peer(senderId, Peer.PeerType.PRIVATE, 0);
        String peerHash = senderPeer.hash();
        return outPeerMap.containsKey(peerHash) ?
                CompletableFuture.completedFuture(Optional.of(outPeerMap.get(peerHash))) :

                load(peer, date, 2).thenApply(x ->
                        outPeerMap.containsKey(peerHash) ? Optional.of(outPeerMap.get(peerHash)) : Optional.empty()
                );
    }

    public CompletableFuture<Optional<OutPeer>> findUserOutPeer(int userId) {
        return findOutPeer(new Peer(userId, Peer.PeerType.PRIVATE, 0));
    }

    public CompletableFuture<ResponseGetReferencedEntitites> getRefEntities(Collection<UserOutPeer> userOutPeers,
                                                                            Collection<GroupOutPeer> groupOutPeers) {
        RequestGetReferencedEntitites.Builder requestBuilder = RequestGetReferencedEntitites.newBuilder();

        if (userOutPeers != null) {
            requestBuilder.addAllUsers(userOutPeers);
        }

        if (groupOutPeers != null) {
            requestBuilder.addAllGroups(groupOutPeers);
        }

        return withToken(SequenceAndUpdatesGrpc.newFutureStub(channel),
                stub -> stub.getReferencedEntitites(requestBuilder.build()));
    }

    public void putOutPeer(Peer peer){
        outPeerMap.put(peer.hash(), peer.toServerOutPeer());
    }

    public CompletableFuture<List<Message>> load(OutPeer peer, long from, Integer limit) {

        return withToken(
                MessagingGrpc.newFutureStub(channel),
                stub -> stub.loadHistory(MessagingOuterClass.RequestLoadHistory.newBuilder()
                        .setDate(from)
                        .setLimit(limit)
                        .setLoadMode(ListLoadMode.LISTLOADMODE_FORWARD)
                        .addAllOptimizations(Constants.OPTIMISATIONS)
                        .setPeer(peer)
                        .build())
        ).thenApply(res -> {
            res.getGroupPeersList().stream().map(Peer::new).forEach(this::putOutPeer);
            res.getUserPeersList().stream().map(Peer::new).forEach(this::putOutPeer);

            List<HistoryMessage> historyList = res.getHistoryList();
            List<Message> messages = new ArrayList<>();

            for (HistoryMessage hm : historyList) {
                Peer senderPeer = new Peer(hm.getSenderPeer());
                List<Peer> mentions = new ArrayList<>();
                if (hm.getMessage().hasTextMessage())
                    mentions.addAll(hm.getMessage().getTextMessage().getMentionsList().stream().map(m -> m.getPeer()).map(Peer::new).collect(Collectors.toList()));
                messages.add(new Message(
                        new Peer(peer),
                        senderPeer,
                        UUIDUtils.convert(hm.getMid()),
                        hm.getMessage().getTextMessage().getText(), hm.getDate(),
                        Content.fromMessage(hm.getMessage()),
                        hm.getForward().getMidsList().stream()
                                .map(u -> UUIDUtils.convert(u))
                                .collect(Collectors.toList()),
                        mentions,
                        hm.getReply().getMidsList().stream()
                                .map(u -> UUIDUtils.convert(u))
                                .collect(Collectors.toList())));
            }

            return messages;
        });
    }

    public synchronized <T extends GeneratedMessageV3> void subscribeOn(Class<T> clazz, UpdateListener<T> listener) {
        subscribers.computeIfAbsent(clazz, s -> new CopyOnWriteArrayList<>());
        subscribers.get(clazz).add(listener);
    }

    public int getCurrentSequence() {
        return currentSequence.get();
    }

    public CompletableFuture<Integer> getDifference(int seq) {
        RequestGetDifference request = RequestGetDifference.newBuilder().setSeq(seq).build();

        return withToken(SequenceAndUpdatesGrpc.newFutureStub(channel)
                .withDeadlineAfter(2, TimeUnit.MINUTES), stub -> stub.getDifference(request))
                .thenCompose(res -> {

                    for (UpdateSeqUpdate update : res.getUpdatesList()) {
                        callListeners(update);
                    }

                    int lastSeq = res.getSeq();
                    this.currentSequence.set(lastSeq);

                    if (res.getNeedMore()) {
                        return getDifference(lastSeq);
                    } else {
                        return CompletableFuture.completedFuture(lastSeq);
                    }
                });
    }

    void callListeners(UpdateSeqUpdate upd) {
        Object updateRaw = null;

        try {
            Field f = upd.getClass().getDeclaredField("update_");
            f.setAccessible(true);
            updateRaw = f.get(upd);
        } catch (Exception e) {
            log.error("Failed to get sequence update field", e);
        }

        if (!(updateRaw instanceof GeneratedMessageV3)) {
            return;
        }

        GeneratedMessageV3 up = (GeneratedMessageV3) updateRaw;

        for (Map.Entry<Class, List<UpdateListener>> entry : subscribers.entrySet()) {
            if (updateRaw.getClass().isAssignableFrom(entry.getKey())) {
                entry.getValue().forEach(listener -> listener.onUpdate(up));
            }
        }
    }

}
