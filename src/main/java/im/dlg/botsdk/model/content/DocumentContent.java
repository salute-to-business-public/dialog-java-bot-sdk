package im.dlg.botsdk.model.content;

import im.dlg.grpc.services.MediaAndFilesOuterClass;
import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

public class DocumentContent extends Content {

    @Getter
    private final long fileId;
    @Getter
    private final long accessHash;
    @Getter
    private final int fileSize;
    @Getter
    private final String name;
    @Getter
    private final String mimeType;
    @Getter
    private final MediaAndFilesOuterClass.FastThumb fastThumb;
    @Getter
    private final MessagingOuterClass.DocumentEx ext;
    @Getter
    private final String caption;

    public DocumentContent(MessagingOuterClass.DocumentMessage document) {
        this.fileId = document.getFileId();
        this.accessHash = document.getAccessHash();
        this.fileSize = document.getFileSize();
        this.name = document.getName();
        this.mimeType = document.getMimeType();
        this.fastThumb = document.getThumb();
        this.ext = document.getExt();
        this.caption = document.getCaption().getValue();
    }

    public MessagingOuterClass.DocumentMessage toServer() {
        DocumentContent content = this;
        MediaAndFilesOuterClass.FastThumb thumb = content.getFastThumb();
        MediaAndFilesOuterClass.FastThumb fastThumb = MediaAndFilesOuterClass.FastThumb
                .newBuilder()
                .setH(thumb.getH())
                .setW(thumb.getW())
                .setThumb(thumb.getThumb())
                .build();

        return MessagingOuterClass.DocumentMessage
                .newBuilder()
                .setFileId(content.getFileId())
                .setAccessHash(content.getAccessHash())
                .setFileSize(content.getFileSize())
                .setName(content.getName())
                .setMimeType(content.getMimeType())
                .setThumb(fastThumb)
                .setExt(content.getExt())
                .build();
    }

}
