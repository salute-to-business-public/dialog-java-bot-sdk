package im.dlg.botsdk.domain.media;

public class AudioMedia {
    private AudioLocation audioLocation;

    public AudioMedia(AudioLocation audioLocation) {
        this.audioLocation = audioLocation;
    }

    public AudioLocation getAudioLocation() {
        return audioLocation;
    }
}
