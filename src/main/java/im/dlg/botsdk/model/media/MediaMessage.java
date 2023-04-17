package im.dlg.botsdk.model.media;

import im.dlg.grpc.services.MessagingOuterClass;
import im.dlg.botsdk.model.interactive.InteractiveGroup;
import lombok.Getter;

import java.util.List;

public class MediaMessage {
    @Getter
    private final ImageMedia imageMedia;
    @Getter
    private final AudioMedia audioMedia;
    @Getter
    private final WebPageMedia webPageMedia;
    @Getter
    private final List<InteractiveGroup> actions;

    public MediaMessage(ImageMedia imageMedia,
                        AudioMedia audioMedia,
                        WebPageMedia webPageMedia,
                        List<InteractiveGroup> actions) {
        this.imageMedia = imageMedia;
        this.audioMedia = audioMedia;
        this.webPageMedia = webPageMedia;
        this.actions = actions;
    }

    protected MessagingOuterClass.MessageMedia toServer() {
        MediaMessage media = this;
        MessagingOuterClass.MessageMedia.Builder msg = MessagingOuterClass.MessageMedia.newBuilder();
        if (media.getImageMedia() != null) {
            MessagingOuterClass.ImageMedia image = MessagingOuterClass.ImageMedia
                    .newBuilder()
                    .setImage(media.getImageMedia().getImageLocation().toServer())
                    .build();
            msg.setImage(image);
        }

        if (media.getAudioMedia() != null) {
            MessagingOuterClass.AudioMedia audio = MessagingOuterClass.AudioMedia
                    .newBuilder()
                    .setAudio(media.getAudioMedia().getAudioLocation().toServer())
                    .build();
            msg.setAudio(audio);
        }

        if (media.getWebPageMedia() != null) {
            MessagingOuterClass.WebpageMedia webpage = media.getWebPageMedia().toServer();
            msg.setWebpage(webpage);
        }

        return msg.build();
    }
}
