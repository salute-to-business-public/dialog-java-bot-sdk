package im.dlg.botsdk.model.media;

import im.dlg.grpc.services.MediaAndFilesOuterClass;
import lombok.Getter;

public class FileLocation {
    @Getter
    private final long fileId;
    @Getter
    private final long accessHash;

    public FileLocation(MediaAndFilesOuterClass.FileLocation fileLocation) {
        fileId = fileLocation.getFileId();
        accessHash = fileLocation.getAccessHash();
    }

    public FileLocation(long fileId, long accessHash) {
        this.fileId = fileId;
        this.accessHash = accessHash;
    }


    public MediaAndFilesOuterClass.FileLocation toServer() {
        return MediaAndFilesOuterClass.FileLocation
                .newBuilder()
                .setFileId(fileId)
                .setAccessHash(accessHash)
                .build();
    }

}
