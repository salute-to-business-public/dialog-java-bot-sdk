package im.dlg.botsdk.model.media;

import com.google.protobuf.StringValue;
import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

public class WebPageMedia {
    @Getter
    private final String url;
    @Getter
    private final String title;
    @Getter
    private final String description;
    @Getter
    private final ImageLocation image;

    public WebPageMedia(String url, String title, String description, ImageLocation image) {
        this.url = url;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    protected MessagingOuterClass.WebpageMedia toServer() {
        WebPageMedia webPageMedia = this;
        return MessagingOuterClass.WebpageMedia
                .newBuilder()
                .setUrl(StringValue.of(webPageMedia.getUrl()))
                .setTitle(StringValue.of(webPageMedia.getTitle()))
                .setDescription(StringValue.of(webPageMedia.getDescription()))
                .build();
    }
}
