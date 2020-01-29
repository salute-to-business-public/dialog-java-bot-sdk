package im.dlg.botsdk;

import dialog.Peers;
import dialog.SearchGrpc;
import dialog.SearchOuterClass;
import im.dlg.botsdk.domain.Peer;
import im.dlg.botsdk.utils.PeerUtils;

import java.util.concurrent.CompletableFuture;

public class PeersApi {

    private InternalBotApi privateBot;

    PeersApi(InternalBotApi privateBot) {
        this.privateBot = privateBot;
    }

    public CompletableFuture<Peer> resolvePeer(String shortname) {
        SearchOuterClass.RequestResolvePeer request = SearchOuterClass.RequestResolvePeer.newBuilder()
                .setShortname(shortname)
                .build();

        return privateBot.withToken(
                SearchGrpc.newFutureStub(privateBot.channel.getChannel()),
                stub -> stub.resolvePeer(request)
        ).thenApply(res -> {
                    Peers.OutPeer peer = res.getPeer();
                    return new Peer(
                            peer.getId(),
                            PeerUtils.toDomainPeerType(peer.getType()),
                            peer.getAccessHash());
                });
    }
}
