import java.util.concurrent.ExecutionException;

import im.dlg.botsdk.Bot;
import im.dlg.botsdk.domain.content.DocumentContent;
import im.dlg.botsdk.domain.content.TextContent;
import im.dlg.botsdk.domain.interactive.InteractiveGroup;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Bot bot = Bot.start("cbb4994cabfa8d2a5bce0b5f7a44c23da943f767").get();

        bot.messaging().onMessage(message ->
                System.out.println("Got a message: ")
        );

        bot.await();
    }
}