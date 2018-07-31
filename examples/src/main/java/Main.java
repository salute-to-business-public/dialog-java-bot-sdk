import im.dlg.botsdk.Bot;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Bot bot = new Bot("c1ff5ca4b7e5fa4660c6a730fdcb613e31deafd8");
        bot.start();

        bot.messaging().onMessage((message) -> {
            bot.users().get(message.getSender()).thenAccept(user -> user.ifPresent(u -> {
                System.out.println("Got a message: " + message.getText() + " from user: " + u.getName());

                // Sending reply
                bot.messaging().send(message.getPeer(), "Reply to : " + message.getText()).thenAccept(uuid -> {
                    System.out.println("Sent a message with UUID: " + uuid);
                });
            }));
        });

        bot.await();
    }
}