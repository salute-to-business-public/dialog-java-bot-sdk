package im.dlg.botsdk;

import dialog.Peers;

class SecurityUtils {
    static BotSdkSecurityException unaccessibleDestination(Peers.Peer peer) {
        return new BotSdkSecurityException(
                "Access to destination " +
                        (peer.getType() == Peers.PeerType.PEERTYPE_PRIVATE ? "user" : "group") +
                        " " + peer.getId() + " is denied"
        );
    }
}
