package im.dlg.botsdk.model.sticker;

import im.dlg.grpc.services.StickersOuterClass;
import lombok.Getter;

public class Sticker {
    @Getter
    private final int id;
    @Getter
    private final String emoji;

    public Sticker(int id, String emoji){
        this.id = id;
        this.emoji = emoji;
    }

    Sticker(StickersOuterClass.StickerDescriptor descriptor){
        this.id = descriptor.getId();
        this.emoji = descriptor.getEmoji().getValue();
    }
}
