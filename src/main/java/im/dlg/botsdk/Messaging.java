package im.dlg.botsdk;

import im.dlg.botsdk.light.UpdateListener;

public class Messaging {

    private ActiveBot privateBot;

    public Messaging(ActiveBot privateBot) {
        this.privateBot = privateBot;

        privateBot.subscribeOn(55, new UpdateListener() {
            @Override
            public void onUpdate(Object update) {

                onReceiveMessage();
            }
        });
    }

    private Runnable onMessage = null;

    public void onMessage(Runnable runnable) {
        onMessage = runnable;
    }

    private void onReceiveMessage() {

        if (onMessage != null) {
            onMessage.run();
            return;
        }

        System.out.println("OLOLOLOLO");
    }
}
