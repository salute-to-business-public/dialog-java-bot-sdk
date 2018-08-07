package im.dlg.botsdk;

import com.google.protobuf.StringValue;
import dialog.MessagingGrpc;
import dialog.MessagingOuterClass.*;
import dialog.Peers;
import im.dlg.botsdk.domain.InteractiveEvent;
import im.dlg.botsdk.domain.Peer;
import im.dlg.botsdk.domain.interactive.InteractiveGroup;
import im.dlg.botsdk.light.InteractiveEventListener;

import java.util.Random;
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

        //TODO: configure properly
        InteractiveMediaButton btn =
                InteractiveMediaButton.newBuilder().setValue("test")
                        .setLabel(StringValue.newBuilder().setValue("test").build()).build();


        InteractiveMediaWidget widget =
                InteractiveMediaWidget.newBuilder().setInteractiveMediaButton(btn).build();

        InteractiveMedia media =
                InteractiveMedia.newBuilder().setWidget(widget).build();

        InteractiveMediaGroup gr =
                InteractiveMediaGroup.newBuilder()
                        .addActions(media)
                        .build();

        MessageMedia messageMedia = MessageMedia.newBuilder().addActions(gr).build();

        MessageContent msg = MessageContent.newBuilder()
                .setTextMessage(TextMessage.newBuilder()
                        .addMedia(messageMedia)
                        .build())
                .build();

        return privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel.getChannel()),
                stub -> stub.sendMessage(RequestSendMessage.newBuilder().setRid(new Random().nextLong())

                        .setPeer(outPeer).setMessage(msg).build())
        ).thenApplyAsync(resp -> UUIDUtils.convert(resp.getMid()), privateBot.executor.getExecutor());
    }
}
