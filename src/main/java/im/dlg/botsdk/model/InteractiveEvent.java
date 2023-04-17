package im.dlg.botsdk.model;

import lombok.Getter;

import java.util.UUID;

/**
 * Event that happens when user interact to button/select menu
 */
public class InteractiveEvent {

    @Getter
    private final UUID mid;
    @Getter
    private final String id;
    @Getter
    private final String value;
    @Getter
    private final Peer peer;

    public InteractiveEvent(UUID mid, String id, String value, Peer peer) {
        this.mid = mid;
        this.id = id;
        this.value = value;
        this.peer = peer;
    }
}
