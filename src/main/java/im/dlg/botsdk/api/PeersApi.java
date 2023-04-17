package im.dlg.botsdk.api;

import im.dlg.grpc.services.SearchGrpc;
import im.dlg.grpc.services.SearchOuterClass;
import io.grpc.ManagedChannel;
import im.dlg.botsdk.internal.InternalBot;
import im.dlg.botsdk.model.Peer;

import java.util.concurrent.CompletableFuture;

public class PeersApi {

    private final ManagedChannel channel;
    private final InternalBot internalBot;

    public PeersApi(ManagedChannel channel, InternalBot internalBot) {
        this.channel = channel;
        this.internalBot = internalBot;
    }

    public CompletableFuture<Peer> resolvePeer(String shortname) {
        SearchOuterClass.RequestResolvePeer request = SearchOuterClass.RequestResolvePeer.newBuilder()
                .setShortname(shortname)
                .build();

        return internalBot.withToken(
                SearchGrpc.newFutureStub(channel),
                stub -> stub.resolvePeer(request)
        ).thenApply(res -> new Peer(res.getPeer()));
    }
}
