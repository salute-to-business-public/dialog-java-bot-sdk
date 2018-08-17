package im.dlg.botsdk;

import com.google.protobuf.StringValue;
import dialog.MessagingGrpc;
import dialog.MessagingOuterClass.*;
import dialog.Peers;
import im.dlg.botsdk.domain.InteractiveEvent;
import im.dlg.botsdk.domain.Peer;
import im.dlg.botsdk.domain.interactive.InteractiveAction;
import im.dlg.botsdk.domain.interactive.InteractiveButton;
import im.dlg.botsdk.domain.interactive.InteractiveGroup;
import im.dlg.botsdk.domain.interactive.InteractiveWidget;
import im.dlg.botsdk.light.InteractiveEventListener;
import im.dlg.botsdk.utils.MsgUtils;
import im.dlg.botsdk.utils.PeerUtils;
import im.dlg.botsdk.utils.UUIDUtils;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class InteractiveApi {

    private InternalBotApi privateBot;
    private InteractiveEventListener listener = null;

    public InteractiveApi(InternalBotApi privateBot) {

        this.privateBot = privateBot;

        privateBot.subscribeOn(UpdateInteractiveMediaEvent.class, evt -> {
            try {
                privateBot.findUserOutPeer(evt.getUid()).thenAccept(opt -> opt.ifPresent(outPeer -> {
                    onEventInternal(new InteractiveEvent(UUIDUtils.convert(evt.getMid()), evt.getId(),
                            evt.getValue(), PeerUtils.toDomainPeer(outPeer)));
                }));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }

    public void onEvent(InteractiveEventListener listener) {
        this.listener = listener;
    }

    private void onEventInternal(InteractiveEvent event) {
        if (listener != null) {
            listener.onEvent(event);
            return;
        }

        System.out.println("Got an event");
    }

    public CompletableFuture<UUID> send(Peer peer, InteractiveGroup group) {
        Peers.OutPeer outPeer = PeerUtils.toServerOutPeer(peer);

        InteractiveMediaGroup.Builder apiMediaGroup =
                InteractiveMediaGroup.newBuilder()
                        .setDescription(StringValue.of(group.getDescription()))
                        .setTitle(StringValue.of(group.getTitle()));

        for (InteractiveAction interactiveAction : group.getActions()) {
            InteractiveWidget w1 = interactiveAction.getWidget();
            if (w1 instanceof InteractiveButton) {

                InteractiveButton b = (InteractiveButton) w1;
                InteractiveMediaButton btn =
                        InteractiveMediaButton.newBuilder().setValue(b.getValue())
                                .setLabel(StringValue.newBuilder().setValue(b.getLabel()).build()).build();


                InteractiveMediaWidget widget =
                        InteractiveMediaWidget.newBuilder().setInteractiveMediaButton(btn).build();


                InteractiveMedia media =
                        InteractiveMedia.newBuilder().setWidget(widget).build();


                apiMediaGroup.addActions(media);
            }
        }

        MessageMedia messageMedia = MessageMedia.newBuilder().addActions(apiMediaGroup).build();

        MessageContent msg = MessageContent.newBuilder()
                .setTextMessage(TextMessage.newBuilder()
                        .addMedia(messageMedia)
                        .build())
                .build();

        return privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel.getChannel()),
                stub -> stub.sendMessage(RequestSendMessage.newBuilder().setRid(MsgUtils.uniqueCurrentTimeMS())

                        .setPeer(outPeer).setMessage(msg).build())
        ).thenApplyAsync(resp -> UUIDUtils.convert(resp.getMid()), privateBot.executor.getExecutor());
    }
}
