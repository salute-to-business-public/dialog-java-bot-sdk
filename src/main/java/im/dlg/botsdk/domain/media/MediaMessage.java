package im.dlg.botsdk.domain.media;

import java.util.List;

import dialog.MessagingOuterClass;
import im.dlg.botsdk.domain.interactive.InteractiveGroup;

public class MediaMessage {
    private ImageMedia imageMedia;
    private AudioMedia audioMedia;
    private WebPageMedia webPageMedia;
    private List<InteractiveGroup> actions;

    public MediaMessage(ImageMedia imageMedia,
                        AudioMedia audioMedia,
                        WebPageMedia webPageMedia,
                        List<InteractiveGroup> actions) {
        this.imageMedia = imageMedia;
        this.audioMedia = audioMedia;
        this.webPageMedia = webPageMedia;
        this.actions = actions;
    }

    public ImageMedia getImageMedia() {
        return imageMedia;
    }

    public AudioMedia getAudioMedia() {
        return audioMedia;
    }

    public WebPageMedia getWebPageMedia() {
        return webPageMedia;
    }

    public List<InteractiveGroup> getActions() {
        return actions;
    }

    public static MessagingOuterClass.MessageMedia buildMedia(MediaMessage media) {
        MessagingOuterClass.ImageMedia image = MessagingOuterClass.ImageMedia
                .newBuilder()
                .setImage(ImageLocation.buildImageLocation(media.getImageMedia().getImageLocation()))
                .build();

        MessagingOuterClass.AudioMedia audio = MessagingOuterClass.AudioMedia
                .newBuilder()
                .setAudio(AudioLocation.buildAudioLocation(media.getAudioMedia().getAudioLocation()))
                .build();

        MessagingOuterClass.WebpageMedia webpage = WebPageMedia.buildWebpage(media.getWebPageMedia());

        return MessagingOuterClass.MessageMedia.newBuilder()
                .setImage(image)
                .setWebpage(webpage)
                .setAudio(audio)
                .build();
    }
}
