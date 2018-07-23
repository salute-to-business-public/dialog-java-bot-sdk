package im.dlg.botsdk;

import dialog.Peers;

class PeerUtils {
    static Peers.Peer toPeer(Peers.OutPeer op) {
        return Peers.Peer.newBuilder()
                .setType(op.getType())
                .setId(op.getId())
                .build();
    }

    static Peers.Peer toPeer(Peers.UserOutPeer uop) {
        return Peers.Peer.newBuilder()
                .setType(Peers.PeerType.PEERTYPE_PRIVATE)
                .setId(uop.getUid())
                .build();
    }

    static Peers.Peer toPeer(Peers.GroupOutPeer uop) {
        return Peers.Peer.newBuilder()
                .setType(Peers.PeerType.PEERTYPE_GROUP)
                .setId(uop.getGroupId())
                .build();
    }

    static Peers.OutPeer toOutPeer(Peers.UserOutPeer uop) {
        return Peers.OutPeer.newBuilder()
                .setType(Peers.PeerType.PEERTYPE_PRIVATE)
                .setId(uop.getUid())
                .setAccessHash(uop.getAccessHash())
                .build();
    }

    static Peers.OutPeer toOutPeer(Peers.GroupOutPeer uop) {
        return Peers.OutPeer.newBuilder()
                .setType(Peers.PeerType.PEERTYPE_GROUP)
                .setId(uop.getGroupId())
                .setAccessHash(uop.getAccessHash())
                .build();
    }

    static Peers.UserOutPeer toUserOutPeer(Peers.OutPeer outPeer) {
        return Peers.UserOutPeer.newBuilder()
                .setUid(outPeer.getId())
                .setAccessHash(outPeer.getAccessHash())
                .build();
    }

    static Peers.Peer toUserPeer(Integer userId) {
        return Peers.Peer.newBuilder()
                .setType(Peers.PeerType.PEERTYPE_PRIVATE)
                .setId(userId)
                .build();
    }
}
