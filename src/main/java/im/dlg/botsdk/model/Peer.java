package im.dlg.botsdk.model;

import im.dlg.grpc.services.Peers;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Peer {

    @Getter
    private final Integer id;
    @Getter
    private final PeerType type;
    @Getter
    private final long accessHash;

    public String hash(){
        return id + "_"+  type;
    }

    /**
     * Peer from server out peer
     *
     * @param peer Server out peer
     */
    public Peer(Peers.OutPeer peer) {
        id = peer.getId();
        type = PeerType.fromServer(peer.getType());
        accessHash = peer.getAccessHash();
    }

    /**
     * Peer from server user out peer
     *
     * @param peer Server user out peer
     */
    public Peer(Peers.UserOutPeer peer) {
        type = PeerType.PRIVATE;
        id = peer.getUid();
        accessHash = peer.getAccessHash();
    }

    /**
     * Peer from server thread out peer
     * @param peer Server thread out peer
     */
    public Peer(Peers.ThreadOutPeer peer){
        type = PeerType.THREAD;
        id = peer.getThreadId();
        accessHash = peer.getAccessHash();
    }

    /**
     * Peer from server group out peer
     *
     * @param peer Server group out peer
     */
    public Peer(Peers.GroupOutPeer peer) {
        type = PeerType.GROUP;
        id = peer.getGroupId();
        accessHash = peer.getAccessHash();
    }

    /**
     * Peer from server peer
     *
     * @param peer Server peer
     */
    public Peer(Peers.Peer peer) {
        id = peer.getId();
        type = PeerType.fromServer(peer.getType());
        accessHash = 0;
    }

    public Peer(int id, PeerType type, long accessHash) {
        this.id = id;
        this.type = type;
        this.accessHash = accessHash;
    }


    @Override
    public String toString() {
        return "Peer{" +
                "id=" + id +
                ", type=" + type +
                ", accessHash=" + accessHash +
                '}';
    }

    /**
     * Convert this peer to server user out peer
     *
     * @return Server user out peer
     */
    public Peers.UserOutPeer toServerUserOutPeer() {
        return Peers.UserOutPeer.newBuilder()
                .setUid(id)
                .setAccessHash(accessHash)
                .build();
    }

    /**
     * Convert this peer to serer group out peer
     *
     * @return Group out peer
     */
    public Peers.GroupOutPeer toServerGroupOutPeer() {
        return Peers.GroupOutPeer.newBuilder()
                .setGroupId(id)
                .setAccessHash(accessHash)
                .build();
    }

    public Peers.ThreadOutPeer toServerThreadOutPeer(){
        return Peers.ThreadOutPeer.newBuilder()
                .setThreadId(id)
                .setAccessHash(accessHash)
                .build();
    }

    /**
     * Convert this peer to server out peer
     *
     * @return Server out peer
     */
    public Peers.OutPeer toServerOutPeer() {
        return Peers.OutPeer.newBuilder()
                .setId(id)
                .setType(PeerType.toServer(this.type))
                .setAccessHash(accessHash)
                .build();
    }

    /**
     * Convert this peer to server peer
     *
     * @return Server peer
     */
    public Peers.Peer toServerPeer() {
        return Peers.Peer.newBuilder()
                .setId(id)
                .setType(PeerType.toServer(this.type))
                .build();
    }

    public enum PeerType {
        PRIVATE,
        GROUP,
        SIP,
        UNKNOWN,
        ENCRYPTED_PRIVATE,
        THREAD;

        static public PeerType fromServer(Peers.PeerType type) {
            switch (type) {
                case PEERTYPE_PRIVATE:
                    return PRIVATE;
                case PEERTYPE_GROUP:
                    return GROUP;
                case PEERTYPE_SIP:
                    return SIP;
                case PEERTYPE_ENCRYPTEDPRIVATE:
                    return ENCRYPTED_PRIVATE;
                case PEERTYPE_THREAD:
                    return THREAD;
                default:
                    return UNKNOWN;

            }
        }

        static public Peers.PeerType toServer(PeerType type) {
            switch (type) {
                case PRIVATE:
                    return Peers.PeerType.PEERTYPE_PRIVATE;
                case GROUP:
                    return Peers.PeerType.PEERTYPE_GROUP;
                case SIP:
                    return Peers.PeerType.PEERTYPE_SIP;
                case ENCRYPTED_PRIVATE:
                    return Peers.PeerType.PEERTYPE_ENCRYPTEDPRIVATE;
                case THREAD:
                    return Peers.PeerType.PEERTYPE_THREAD;
                default:
                    return Peers.PeerType.PEERTYPE_UNKNOWN;
            }

        }
    }
}
