package im.dlg.botsdk;

import dialog.MessagingOuterClass;
import im.dlg.botsdk.domain.InteractiveEvent;
import im.dlg.botsdk.light.InteractiveEventListener;

public class InteractiveApi {

    private InternalBotApi privateBot;
    private InteractiveEventListener listener = null;

    public InteractiveApi(InternalBotApi privateBot) {

        this.privateBot = privateBot;

        privateBot.subscribeOn(17, update -> {
            try {
                MessagingOuterClass.UpdateInteractiveMediaEvent evt =
                        MessagingOuterClass.UpdateInteractiveMediaEvent.parseFrom(update);

                privateBot.findUserOutPeer(evt.getUid()).thenAccept(opt -> opt.ifPresent(outPeer -> {
                    onEvent(new InteractiveEvent(UUIDUtils.convert(evt.getMid()), evt.getId(),
                            evt.getValue(), PeerUtils.toDomainPeer(outPeer)));
                }));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }

    private void onEvent(InteractiveEvent event) {
        if (listener != null) {
            listener.onEvent(event);
            return;
        }

        System.out.println("Got an event");
    }
}
