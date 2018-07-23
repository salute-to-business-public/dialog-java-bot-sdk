package im.dlg.botsdk;

import dialog.MessagingOuterClass;
import dialog.SequenceAndUpdatesOuterClass;
import im.dlg.botsdk.domain.Message;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

class BotSdkSeqUpdatesObserver implements StreamObserver<SequenceAndUpdatesOuterClass.SeqUpdateBox> {
    private ActiveBot activeBot;
    private Bot bot;

    public BotSdkSeqUpdatesObserver(ActiveBot activeBot, Bot bot) {
        this.activeBot = activeBot;
        this.bot = bot;
    }

    @Override
    public void onNext(SequenceAndUpdatesOuterClass.SeqUpdateBox value) {
        try {
            SequenceAndUpdatesOuterClass.UpdateSeqUpdate upd =
                    SequenceAndUpdatesOuterClass.UpdateSeqUpdate.parseFrom(value.getUpdate().getValue());

            switch (upd.getUpdateHeader()) {
                case 55:
                    MessagingOuterClass.UpdateMessage msg =
                            MessagingOuterClass.UpdateMessage.parseFrom(upd.getUpdate());
                    if (msg.getMessage().getBodyCase().getNumber() == 1) {
                        activeBot.findOutPeer(msg.getPeer()).thenAccept(optOutPeer -> {
                            UUID uuid = UUIDUtils.convert(msg.getMid());
                            optOutPeer.ifPresent(outPeer -> {
                                activeBot.loadSenderOutPeer(msg.getSenderUid(), outPeer, msg.getDate())
                                    .thenAcceptAsync(optSenderOutPeer ->
                                        optSenderOutPeer.ifPresent(senderOutPeer -> {
                                            String text = msg.getMessage().getTextMessage().getText();
                                            bot.onMessage(new Message(
                                                    outPeer,
                                                    senderOutPeer,
                                                    uuid,
                                                    text
                                            ), activeBot);
                                        })
                                    );

                                activeBot.messagingHandlers.read(outPeer, msg.getDate());
                            });
                        });
                    }
                case 19:
                    MessagingOuterClass.UpdateMessageRead read =
                            MessagingOuterClass.UpdateMessageRead.parseFrom(upd.getUpdate());

                    activeBot.findOutPeer(read.getPeer()).thenAccept(optOutPeer ->
                        optOutPeer.ifPresent(outPeer -> bot.onMessageRead(outPeer, read.getReadDate(), activeBot))
                    );
                case 54:
                    MessagingOuterClass.UpdateMessageReceived received =
                            MessagingOuterClass.UpdateMessageReceived.parseFrom(upd.getUpdate());

                    activeBot.findOutPeer(received.getPeer()).thenAccept(optOutPeer ->
                            optOutPeer.ifPresent(outPeer ->
                                    bot.onMessageRead(outPeer, received.getReceivedDate(), activeBot)
                            )
                    );
                default:;
            }
        } catch(Throwable e) {
        }
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onCompleted() {

    }
}
