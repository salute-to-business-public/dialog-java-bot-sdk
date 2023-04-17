package im.dlg.botsdk.model.media;

import im.dlg.grpc.services.MediaAndFilesOuterClass;
import lombok.Getter;

public class AudioLocation {
    @Getter
    private final FileLocation fileLocation;
    @Getter
    private final int duration;
    @Getter
    private final String mimeType;
    @Getter
    private final int fileSize;

    public AudioLocation(FileLocation fileLocation, int duration, String mimeType, int fileSize) {
        this.fileLocation = fileLocation;
        this.duration = duration;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
    }

    protected MediaAndFilesOuterClass.AudioLocation toServer(){
        return MediaAndFilesOuterClass.AudioLocation
                .newBuilder()
                .setDuration(this.duration)
                .setMimeType(this.mimeType)
                .setFileSize(this.fileSize)
                .setFileLocation(fileLocation.toServer())
                .build();
    }
}
