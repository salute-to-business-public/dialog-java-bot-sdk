package im.dlg.botsdk.light;

import im.dlg.botsdk.domain.Message;

import java.util.concurrent.ExecutionException;

@FunctionalInterface
public interface MessageListener {
    void onMessage(Message message) throws ExecutionException, InterruptedException;
}
