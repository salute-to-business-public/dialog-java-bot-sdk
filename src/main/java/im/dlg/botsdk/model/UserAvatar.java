package im.dlg.botsdk.model;

import im.dlg.botsdk.model.media.FileLocation;
import im.dlg.grpc.services.MediaAndFilesOuterClass;
import lombok.Getter;

public class UserAvatar {
    @Getter
    private final FileLocation fullImage;
    @Getter
    private final FileLocation smallImage;
    @Getter
    private final FileLocation largeImage;
    public UserAvatar(MediaAndFilesOuterClass.Avatar avatar){
        fullImage = new FileLocation(avatar.getFullImage().getFileLocation());
        smallImage = new FileLocation(avatar.getSmallImage().getFileLocation());
        largeImage = new FileLocation(avatar.getLargeImage().getFileLocation());

    }
}
