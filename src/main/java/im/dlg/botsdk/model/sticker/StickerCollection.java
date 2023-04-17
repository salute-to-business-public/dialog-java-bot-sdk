package im.dlg.botsdk.model.sticker;

import im.dlg.grpc.services.StickersOuterClass;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

public class StickerCollection {
    @Getter
    private final int collectionId;
    @Getter
    private final List<Sticker> stickers;


    public StickerCollection(StickersOuterClass.StickerCollection collection) {
        this.collectionId = collection.getId();
        stickers = collection.getStickersList().stream().map(Sticker::new).collect(Collectors.toList());

    }
}
