package im.dlg.botsdk.domain;

import java.util.UUID;

import im.dlg.botsdk.domain.content.Content;

public class Message {

    private Peer peer;
    private Peer sender;
    private UUID messageId;
    private String text;
    private long date;
    private Content messageContent;

    public Message(Peer peer, Peer sender, UUID messageId, String text, long date, Content messageContent) {
        this.peer = peer;
        this.sender = sender;
        this.messageId = messageId;
        this.text = text;
        this.date = date;
        this.messageContent = messageContent;
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

    public long getDate() {
        return date;
    }

    public Content getMessageContent() {
        return messageContent;
    }

    @Override
    public String toString() {
        return "Message{" +
                "peer=" + peer +
                ", sender=" + sender +
                ", messageId=" + messageId +
                ", text='" + text + '\'' +
                '}';
    }
}
