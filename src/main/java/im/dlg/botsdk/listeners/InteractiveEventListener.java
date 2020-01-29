package im.dlg.botsdk.listeners;

import im.dlg.botsdk.domain.InteractiveEvent;

@FunctionalInterface
public interface InteractiveEventListener {
    void onEvent(InteractiveEvent event);
}
