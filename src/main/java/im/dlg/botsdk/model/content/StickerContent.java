package im.dlg.botsdk.model.content;

import im.dlg.botsdk.model.sticker.Sticker;
import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

public class StickerContent extends Content {
    @Getter
    private final int collectionId;
    @Getter
    private final Sticker sticker;

    StickerContent(MessagingOuterClass.StickerMessage sticker) {
        collectionId = sticker.getStickerCollectionId().getValue();
        this.sticker = new Sticker(sticker.getStickerId().getValue(), sticker.getEmoji().getValue());
    }
}
