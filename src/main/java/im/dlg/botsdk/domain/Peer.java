package im.dlg.botsdk.domain;

public class Peer {

    private int id;
    private PeerType type;
    private long accessHash;

    public enum PeerType {
        PRIVATE,
        GROUP,
        SIP,
        UNKNOWN
    }
}
