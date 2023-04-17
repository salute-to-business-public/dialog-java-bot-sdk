package im.dlg.botsdk.model.media;

import lombok.Getter;

public class ImageMedia {
    @Getter
    private final ImageLocation imageLocation;

    public ImageMedia(ImageLocation imageLocation) {
        this.imageLocation = imageLocation;
    }
}
