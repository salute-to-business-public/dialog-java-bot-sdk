import im.dlg.botsdk.Bot;
import im.dlg.botsdk.BotConfig;
import im.dlg.botsdk.domain.content.DocumentContent;
import im.dlg.botsdk.domain.content.TextContent;

import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        BotConfig botConfig = BotConfig.Builder.aBotConfig()
                .withHost("")
                .withPort(443)
                .withCertPath("")
                .withCertPassword("").build();

        Bot bot = Bot.start(botConfig).get();

        bot.messaging().onMessage(message ->
                bot.users().get(message.getSender()).thenAccept(userOpt -> userOpt.ifPresent(user -> {
                            System.out.println("Got a message: " + message.getText() + " from user: " + user.getName());
                        })
                ).thenCompose(aVoid -> {
                            switch (message.getText()) {
                                case "Send me photo":
                                    return bot.messaging().sendMedia(message.getPeer(), ((TextContent) message.getMessageContent()).getMedias());
                                case "Send me video":
                                    return bot.messaging().sendDocument(message.getPeer(), (DocumentContent) message.getMessageContent());
                                default:
                                    return bot.messaging().reply(message.getPeer(), message.getMessageId(), "some reply");
                            }
                        }
                ).exceptionally(ex -> {
                    ex.printStackTrace();
                    return null;
                }).thenAccept(uuid ->
                        System.out.println("Sent a message with UUID: " + uuid)));

        bot.await();
    }
}