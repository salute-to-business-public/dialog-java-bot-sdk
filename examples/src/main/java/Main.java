import im.dlg.botsdk.*;

public class Main {
    public static void main(String[] args) {
        BotSdk sdk = new BotSdk();

        sdk.start(new MyBot("9d1da2b1dc53bd555709243a5928bc9fdacd0028")).thenComposeAsync(bot -> {
            System.out.println("My bot name is " + bot.getName());
            System.out.println("My bot nick is " + bot.getName());
            System.out.println("My bot about is " + bot.getName());

            return bot.profile().editName("My superbot")
                    .thenComposeAsync(x -> bot.profile().editNickname("Superbot"))
                    .thenComposeAsync(x -> bot.profile().editAbout("Best bot in the world!"));
        });

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}