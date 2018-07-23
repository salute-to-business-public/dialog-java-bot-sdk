package im.dlg.botsdk.domain;

import dialog.Peers;

import java.util.UUID;

public class Message {
    Peers.OutPeer peer;
    Peers.OutPeer sender;
    UUID messageId;
    String text;

    public Message(Peers.OutPeer peer, Peers.OutPeer sender, UUID messageId, String text) {
        this.peer = peer;
        this.sender = sender;
        this.messageId = messageId;
        this.text = text;
    }

    public Peers.OutPeer getPeer() {
        return peer;
    }

    public Peers.OutPeer getSender() {
        return sender;
    }

    public UUID getMessageId() {
        return messageId;
    }

    public String getText() {
        return text;
    }
}
