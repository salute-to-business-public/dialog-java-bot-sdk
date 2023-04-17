package im.dlg.botsdk.model;

import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

public class MessageRead {

    @Getter
    private final Peer peer;

    @Getter
    private final long startDate;

    @Getter
    private final long readDate;

    public MessageRead(MessagingOuterClass.UpdateMessageRead msg){
        this.peer = new Peer(msg.getPeer());
        startDate = msg.getStartDate();
        readDate = msg .getReadDate();

    }
}
