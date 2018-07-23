package im.dlg.botsdk;

import dialog.Peers;
import im.dlg.botsdk.domain.Message;

import java.util.concurrent.CompletableFuture;

public abstract class Bot {
    protected abstract String getRegistrationToken();
    protected abstract CompletableFuture<Void> onMessage(Message message, ActiveBot bot);
    protected CompletableFuture<Void> onMessageRead(Peers.OutPeer peer, long date, ActiveBot bot) {
        return CompletableFuture.completedFuture(null);
    }
    protected CompletableFuture<Void> onMessageReceived(Peers.OutPeer peer, long date, ActiveBot bot) {
        return CompletableFuture.completedFuture(null);
    }
}