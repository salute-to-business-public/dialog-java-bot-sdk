package im.dlg.botsdk;

import dialog.MessagingGrpc;
import dialog.MessagingOuterClass;
import dialog.MessagingOuterClass.*;
import dialog.Peers;
import im.dlg.botsdk.domain.Message;
import im.dlg.botsdk.domain.Peer;
import im.dlg.botsdk.light.MessageListener;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class MessagingApi {

    private InternalBotApi privateBot;
    private MessageListener onMessage = null;


    public MessagingApi(InternalBotApi privateBot) {
        this.privateBot = privateBot;


        privateBot.subscribeOn(55, update -> {
            try {
                MessagingOuterClass.UpdateMessage msg =
                        MessagingOuterClass.UpdateMessage.parseFrom(update);
                if (msg.getMessage().getBodyCase().getNumber() == 1) {
                    privateBot.findOutPeer(msg.getPeer()).thenAccept(optOutPeer -> {
                        optOutPeer.ifPresent(outPeer -> {
                            privateBot.loadSenderOutPeer(msg.getSenderUid(), outPeer, msg.getDate())
                                    .thenAcceptAsync(optSenderOutPeer ->
                                            optSenderOutPeer.ifPresent(senderOutPeer -> {
                                                final String text = msg.getMessage().getTextMessage().getText();
                                                final UUID uuid = UUIDUtils.convert(msg.getMid());

                                                onReceiveMessage(new Message(
                                                        PeerUtils.toDomainPeer(outPeer),
                                                        PeerUtils.toDomainPeer(senderOutPeer), uuid, text));
                                            })
                                    );
                        });
                    });
                }
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }

    public void onMessage(MessageListener runnable) {
        onMessage = runnable;
    }

    public CompletableFuture<UUID> send(Peer peer, String text) {
        Peers.OutPeer outPeer = PeerUtils.toServerOutPeer(peer);
        MessageContent msg = MessageContent.newBuilder()
                .setTextMessage(TextMessage.newBuilder().setText(text).build())
                .build();
        return privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel),
                stub -> stub.sendMessage(RequestSendMessage.newBuilder().setPeer(outPeer).setMessage(msg).build())
        ).thenApplyAsync(resp -> UUIDUtils.convert(resp.getMid()), privateBot.executor.getExecutor());
    }

    private void onReceiveMessage(Message message) {
        if (onMessage != null) {
            onMessage.onMessage(message);
            return;
        }

        System.out.println("Got a message");
    }
}
