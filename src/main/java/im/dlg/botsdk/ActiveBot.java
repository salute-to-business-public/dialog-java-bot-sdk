package im.dlg.botsdk;

import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import dialog.*;
import io.grpc.Metadata;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.MetadataUtils;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class ActiveBot {
    private BotSdk sdk;
    private Metadata meta;
    private Map<Peers.Peer, Peers.OutPeer> outPeerMap = new ConcurrentHashMap<>();
    volatile private String name;
    volatile private String nick;
    volatile private String about = "";

    protected MessagingHandlers messagingHandlers;
    protected ProfileHandlers profileHandlers;
    protected UserHandlers userHandlers;

    public ActiveBot(BotSdk sdk, UsersOuterClass.User profile, Metadata meta) {
        this.sdk = sdk;
        this.meta = meta;
        this.name = profile.getName();
        this.nick = profile.getNick().getValue();

        this.messagingHandlers = new MessagingHandlers(this, sdk.getChannel(), sdk.getExecutor().getExecutor());
        this.profileHandlers = new ProfileHandlers(this, sdk.getChannel(), sdk.getExecutor().getExecutor());
        this.userHandlers = new UserHandlers(this, sdk.getChannel(), sdk.getExecutor().getExecutor());
    }

    <T extends AbstractStub<T>, R> CompletableFuture<R> withToken(T stub, Function<T, ListenableFuture<R>> f) {
        T newStub = MetadataUtils.attachHeaders(stub, meta);
        return sdk.getExecutor().convert(f.apply(newStub));
    }

    CompletableFuture<Optional<Peers.OutPeer>> findOutPeer(Peers.Peer peer) {
        return outPeerMap.containsKey(peer) ?
                CompletableFuture.completedFuture(Optional.of(outPeerMap.get(peer))) :
                // implicitly load outPeers of loaded dialogs
                messagingHandlers.loadDialogs(Sets.newHashSet(peer)).thenApplyAsync(x ->
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
                messagingHandlers.load(peer, date, 2).thenApplyAsync(x ->
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

    // handlers
    public MessagingHandlers messaging() {
        return messagingHandlers;
    }

    public ProfileHandlers profile() {
        return profileHandlers;
    }

    public UserHandlers users() {
        return userHandlers;
    }

    // -- handlers

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getAbout() {
        return about;
    }
}
