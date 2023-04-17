package im.dlg.botsdk.api;

import im.dlg.botsdk.model.sticker.StickerCollection;
import im.dlg.grpc.services.StickersGrpc;
import im.dlg.grpc.services.StickersOuterClass.RequestLoadStickerCollection;

import io.grpc.ManagedChannel;
import im.dlg.botsdk.internal.InternalBot;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class StickerApi {

    private final ManagedChannel channel;
    private final InternalBot internalBot;


    public StickerApi(ManagedChannel channel, InternalBot internalBot) {
        this.channel = channel;
        this.internalBot = internalBot;
    }


    public CompletableFuture<StickerCollection> loadStickerCollection(int id) {
        RequestLoadStickerCollection request = RequestLoadStickerCollection.newBuilder()
                .setId(id)
                .build();
        return internalBot.withToken(StickersGrpc.newFutureStub(channel),
                stub -> stub.loadStickerCollection(request)).thenApply(t -> t.getCollection()).thenApply(StickerCollection::new);
    }


}
