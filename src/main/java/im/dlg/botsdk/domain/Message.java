package im.dlg.botsdk.domain;

import java.util.UUID;

public class Message {

    private Peer peer;
    private Peer sender;
    private UUID messageId;
    private String text;

    public Message(Peer peer, Peer sender, UUID messageId, String text) {
        this.peer = peer;
        this.sender = sender;
        this.messageId = messageId;
        this.text = text;
    }

    public Peer getPeer() {
        return peer;
    }

    public Peer getSender() {
        return sender;
    }

    public UUID getMessageId() {
        return messageId;
    }

    public String getText() {
        return text;
    }
}
