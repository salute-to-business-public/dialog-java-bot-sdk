package im.dlg.botsdk.model.reactions;


import im.dlg.botsdk.utils.UUIDUtils;
import im.dlg.grpc.services.ReactionsOuterClass;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class MessageReaction {

    /**
     * Message id
     */
    private final UUID messageId;

    /**
     * Reactions on message
     */
    private final List<Reaction> reactions;


    public MessageReaction(ReactionsOuterClass.MessageReactionsUpdate reactions) {

        this.messageId = UUIDUtils.convert(reactions.getMessageReaction().getMid());
        this.reactions = reactions.getMessageReaction().getReactionsList().stream().map(Reaction::new).collect(Collectors.toList());

    }
    public MessageReaction(ReactionsOuterClass.MessageReactions reactions) {

        this.messageId = UUIDUtils.convert(reactions.getMid());
        this.reactions = reactions.getReactionsList().stream().map(Reaction::new).collect(Collectors.toList());

    }

    @Override
    public String toString() {
        return "MessageReaction{" +
                "messageId=" + messageId +
                ", reactions=" + reactions +
                '}';
    }

    public UUID getMessageId() {
        return messageId;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }
}
