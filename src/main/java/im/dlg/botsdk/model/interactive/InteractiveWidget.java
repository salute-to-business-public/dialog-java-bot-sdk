package im.dlg.botsdk.model.interactive;

import im.dlg.grpc.services.MessagingOuterClass;

public interface InteractiveWidget {
    MessagingOuterClass.InteractiveMediaWidget toServer();
}
