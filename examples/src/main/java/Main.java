import im.dlg.botsdk.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        BotSdk sdk = new BotSdk();

        sdk.start(new MyBot("c07893196cd851b31428338cee2fec5e542de26e")).thenComposeAsync(bot -> {
            System.out.println("My bot name is " + bot.getName());
            System.out.println("My bot nick is " + bot.getNick());
            System.out.println("My bot about is " + bot.getAbout());

            return bot.profile().editName("My superbot")
                    .thenComposeAsync(x -> bot.profile().editNickname("Superbot"))
                    .thenComposeAsync(x -> bot.profile().editAbout("Best bot in the world!"));
        }).whenCompleteAsync((r, t) -> {
            if (t != null) System.out.println("ERROR: " + t.getMessage());
        });

        try {
            new CompletableFuture<Void>().get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}