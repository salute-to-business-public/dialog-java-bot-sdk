package im.dlg.botsdk.model.content;

import im.dlg.grpc.services.MessagingOuterClass;

public class EmptyContent extends Content {
    public EmptyContent(MessagingOuterClass.EmptyMessage emptyMessage) {

    }

    public MessagingOuterClass.EmptyMessage toServer(){
        return MessagingOuterClass.EmptyMessage.newBuilder().build();
    }
}
