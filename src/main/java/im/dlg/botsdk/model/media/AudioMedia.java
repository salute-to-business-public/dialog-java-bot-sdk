package im.dlg.botsdk.model.media;

import lombok.Getter;

public class AudioMedia {
    @Getter
    private final AudioLocation audioLocation;

    public AudioMedia(AudioLocation audioLocation) {
        this.audioLocation = audioLocation;
    }
}
