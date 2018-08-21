import im.dlg.botsdk.Bot;

import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Bot bot = Bot.start("76046c2bff10a0fe6a9c101d1156d340ef664fd6").get();

        bot.messaging().onMessage(message ->
                bot.users().get(message.getSender()).thenAccept(userOpt -> userOpt.ifPresent(user -> {
                            System.out.println("Got a message: " + message.getText() + " from user: " + user.getName());
                        })
                ).thenCompose(aVoid ->
                        bot.messaging().send(message.getPeer(), "Reply to : " + message.getText())
                ).thenAccept(uuid ->
                        System.out.println("Sent a message with UUID: " + uuid)));

        bot.await();
    }
}