package im.dlg.botsdk.listeners;

import im.dlg.botsdk.domain.Message;

@FunctionalInterface
public interface MessageListener {
    void onMessage(Message message);
}
