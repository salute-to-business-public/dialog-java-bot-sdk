package im.dlg.botsdk.domain.media;

public class ImageMedia {
    private ImageLocation imageLocation;

    public ImageMedia(ImageLocation imageLocation) {
        this.imageLocation = imageLocation;
    }

    public ImageLocation getImageLocation() {
        return imageLocation;
    }
}
