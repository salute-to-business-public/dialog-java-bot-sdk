package im.dlg.botsdk.model.media;

import im.dlg.grpc.services.MediaAndFilesOuterClass;
import lombok.Getter;

public class ImageLocation {
    @Getter
    private final FileLocation fileLocation;
    @Getter
    private final int width;
    @Getter
    private final int height;
    @Getter
    private final int fileSize;

    public ImageLocation(FileLocation fileLocation, int width, int height, int fileSize) {
        this.fileLocation = fileLocation;
        this.width = width;
        this.height = height;
        this.fileSize = fileSize;
    }

    protected MediaAndFilesOuterClass.ImageLocation toServer() {
        return MediaAndFilesOuterClass.ImageLocation
                .newBuilder()
                .setWidth(this.width)
                .setHeight(this.height)
                .setFileSize(this.fileSize)
                .setFileLocation(this.fileLocation.toServer())
                .build();
    }
}
