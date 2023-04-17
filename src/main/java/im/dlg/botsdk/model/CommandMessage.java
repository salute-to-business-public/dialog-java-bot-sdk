package im.dlg.botsdk.model;

import im.dlg.grpc.services.Peers;
import lombok.Getter;

import java.util.UUID;

public class CommandMessage {
    @Getter
    private final Peer peer;
    @Getter
    private final Peer senderPeer;
    @Getter
    private final String command;
    @Getter
    private final UUID messageId;
    @Getter
    private final String arguments;

    public CommandMessage(Peers.OutPeer peer, Peers.OutPeer senderPeer, String text, UUID messageId) {
        this.peer = new Peer(peer);
        this.senderPeer = new Peer(senderPeer);
        String[] replaced = text.replaceAll("^@\\w+ ", "").replace("/", "").split(" ", 2);
        this.command = replaced[0];
        if (replaced.length > 1)
            arguments = replaced[1];
        else
            arguments = null;

        this.messageId = messageId;
    }
}
