package im.dlg.botsdk.listeners;

import im.dlg.botsdk.model.Peer;
import im.dlg.botsdk.model.reactions.MessageReaction;
import im.dlg.botsdk.model.reactions.Reaction;

public interface ReactionListener {
    void onReaction(Peer peer, MessageReaction reaction);

}
