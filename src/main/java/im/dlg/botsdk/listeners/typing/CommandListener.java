package im.dlg.botsdk.listeners.typing;

import im.dlg.botsdk.model.CommandMessage;

public interface CommandListener {
    void invoke(CommandMessage message);
}
