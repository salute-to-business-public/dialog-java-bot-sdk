package im.dlg.botsdk.model;

import im.dlg.botsdk.model.reactions.Reaction;
import im.dlg.grpc.services.MessagingOuterClass;
import im.dlg.botsdk.model.content.Content;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import im.dlg.botsdk.utils.UUIDUtils;
import lombok.Getter;
import lombok.Setter;

/**
 * Message entity for any content
 */
public class Message {

    @Getter
    private final Peer peer;
    @Getter
    private final Peer sender;
    @Getter
    private final UUID messageId;
    @Getter
    private final String text;
    @Getter
    private final long date;
    @Getter
    private final Content messageContent;
    @Getter
    private final List<UUID> forwardMesssages;
    @Getter
    private final List<Reaction> reactions;
    @Getter
    private final List<Peer> mentions;
    @Getter
    private final List<UUID> reply;

    public Message(MessagingOuterClass.HistoryMessage hm) {
        if (hm.getHostPeer() != null) {
            peer = new Peer(hm.getHostPeer());
        }
        else {
            //Справедливо только для p2p
            peer = new Peer(hm.getSenderPeer());
        }
        sender = new Peer(hm.getSenderPeer());

        messageId = UUIDUtils.convert(hm.getMid());
        text = hm.getMessage().getTextMessage().getText();
        date = hm.getDate();
        messageContent = Content.fromMessage(hm.getMessage());
        forwardMesssages = hm.getForward().getMidsList().stream().map(u -> UUIDUtils.convert(u)).collect(Collectors.toList());
        reactions = hm.getReactionsList().stream().map(Reaction::new).collect(Collectors.toList());
        if (hm.getMessage().hasTextMessage())
            mentions = hm.getMessage().getTextMessage().getMentionsList().stream().map(m -> m.getPeer()).map(Peer::new).collect(Collectors.toList());
        else
            mentions = new ArrayList<>();
        reply = hm.getReply().getMidsList().stream()
                .map(u -> UUIDUtils.convert(u))
                .collect(Collectors.toList());

    }

    public Message(Peer peer, Peer sender, UUID messageId, String text, long date, Content messageContent, List<UUID> referencedMessagesId, List<Peer> mentions, List<UUID> reply) {
        this.peer = peer;
        this.sender = sender;
        this.messageId = messageId;
        this.text = text;
        this.date = date;
        this.messageContent = messageContent;
        this.forwardMesssages = referencedMessagesId;
        this.reactions = new ArrayList<>();
        this.mentions = mentions;
        this.reply = reply;
    }
}
