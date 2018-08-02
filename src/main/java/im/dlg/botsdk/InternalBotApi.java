package im.dlg.botsdk;

import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.InvalidProtocolBufferException;
import dialog.MessagingGrpc;
import dialog.MessagingOuterClass;
import dialog.MessagingOuterClass.*;
import dialog.Peers;
import dialog.SequenceAndUpdatesOuterClass;
import im.dlg.botsdk.domain.Message;
import im.dlg.botsdk.light.UpdateListener;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

public class InternalBotApi implements StreamObserver<SequenceAndUpdatesOuterClass.SeqUpdateBox> {

    private Metadata meta;
    private Map<Peers.Peer, Peers.OutPeer> outPeerMap = new ConcurrentHashMap<>();
    volatile private String name;
    volatile private String nick;
    volatile private String about = "";

    DialogExecutor executor;
    ManagedChannel channel;

    private Map<Integer, List<UpdateListener>> subscribers = new ConcurrentHashMap<>();

    public InternalBotApi(Metadata meta, DialogExecutor executor, ManagedChannel channel) {
        this.meta = meta;
        this.executor = executor;
        this.channel = channel;
    }

    <T extends AbstractStub<T>, R> CompletableFuture<R> withToken(T stub, Function<T, ListenableFuture<R>> f) {
        T newStub = MetadataUtils.attachHeaders(stub, meta);
        return executor.convert(f.apply(newStub));
    }

    CompletableFuture<Optional<Peers.OutPeer>> findOutPeer(Peers.Peer peer) {
        return outPeerMap.containsKey(peer) ?
                CompletableFuture.completedFuture(Optional.of(outPeerMap.get(peer))) :
                // implicitly load outPeers of loaded dialogs
                loadDialogs(Sets.newHashSet(peer)).thenApplyAsync(x ->
                        outPeerMap.containsKey(peer) ? Optional.of(outPeerMap.get(peer)) : Optional.empty()
                );
    }

    CompletableFuture<Peers.OutPeer> getOutPeer(Peers.Peer peer) {
        return findOutPeer(peer).thenApplyAsync(optPeer ->
                optPeer.orElseThrow(() -> SecurityUtils.unaccessibleDestination(peer))
        );
    }

    CompletableFuture<Optional<Peers.OutPeer>> loadSenderOutPeer(Integer senderId, Peers.OutPeer peer, long date) {
        Peers.Peer senderPeer = PeerUtils.toUserPeer(senderId);
        return outPeerMap.containsKey(senderPeer) ?
                CompletableFuture.completedFuture(Optional.of(outPeerMap.get(senderPeer))) :
                // implicitly load outPeers of loaded dialogs
                load(peer, date, 2).thenApplyAsync(x ->
                        outPeerMap.containsKey(senderPeer) ? Optional.of(outPeerMap.get(senderPeer)) : Optional.empty()
                );
    }

    void setName(String name) {
        this.name = name;
    }

    void setNick(String nick) {
        this.nick = nick;
    }

    void setAbout(String about) {
        this.about = about;
    }

    void putOutPeer(Peers.OutPeer outPeer) {
        outPeerMap.put(PeerUtils.toPeer(outPeer), outPeer);
    }

    void putOutPeer(Peers.UserOutPeer outPeer) {
        outPeerMap.put(PeerUtils.toPeer(outPeer), PeerUtils.toOutPeer(outPeer));
    }

    void putOutPeer(Peers.GroupOutPeer outPeer) {
        outPeerMap.put(PeerUtils.toPeer(outPeer), PeerUtils.toOutPeer(outPeer));
    }

    public CompletableFuture<List<Message>> load(Peers.OutPeer peer, long from, Integer limit) {
        return withToken(
                MessagingGrpc.newFutureStub(channel),
                stub -> stub.loadHistory(MessagingOuterClass.RequestLoadHistory.newBuilder()
                        .setDate(from)
                        .setLimit(limit)
                        .setLoadMode(ListLoadMode.LISTLOADMODE_FORWARD)
                        .addAllOptimizations(RequestsDefaults.optimizations)
                        .setPeer(peer)
                        .build()
                )
        ).thenApplyAsync(res -> {
            res.getGroupPeersList().forEach(this::putOutPeer);
            res.getUserPeersList().forEach(this::putOutPeer);

            List<HistoryMessage> historyList = res.getHistoryList();
            List<Message> messages = new ArrayList<>();
            for (HistoryMessage hm : historyList) {
                putOutPeer(hm.getSenderPeer());
                messages.add(new Message(
                        PeerUtils.toDomainPeer(peer),
                        PeerUtils.toDomainPeer(hm.getSenderPeer()),
                        UUIDUtils.convert(hm.getMid()),
                        hm.getMessage().getTextMessage().getText()
                ));
            }

            return messages;
        }, executor.getExecutor());
    }

    CompletableFuture<List<Dialog>> loadDialogs(Set<Peers.Peer> peers) {
        RequestLoadDialogs request = RequestLoadDialogs.newBuilder()
                .setLimit(1)
                .addAllPeersToLoad(peers)
                .addAllOptimizations(RequestsDefaults.optimizations)
                .build();

        return withToken(
                MessagingGrpc.newFutureStub(channel),
                stub -> stub.loadDialogs(request)
        ).thenApplyAsync(res -> {
            res.getGroupPeersList().forEach(this::putOutPeer);
            res.getUserPeersList().forEach(this::putOutPeer);

            return res.getDialogsList();
        }, executor.getExecutor());
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getAbout() {
        return about;
    }


    public synchronized void subscribeOn(int code, UpdateListener listener) {
        if (!subscribers.containsKey(code)) {
            subscribers.put(code, new CopyOnWriteArrayList<>());
        }

        subscribers.get(code).add(listener);
    }

    @Override
    public void onNext(SequenceAndUpdatesOuterClass.SeqUpdateBox value) {
        try {
            SequenceAndUpdatesOuterClass.UpdateSeqUpdate upd =
                    SequenceAndUpdatesOuterClass.UpdateSeqUpdate.parseFrom(value.getUpdate().getValue());

            int headerCode = upd.getUpdateHeader();
            if (subscribers.containsKey(headerCode)) {
                subscribers.get(headerCode).forEach(updateListener -> updateListener.onUpdate(upd.getUpdate()));
            } else {
                System.out.println("Unhandled update with header: " + headerCode);
            }

        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onError(Throwable t) {
        //TODO: reconnect
    }

    @Override
    public void onCompleted() {
        //TODO: reconnect
    }
}
