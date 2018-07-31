import im.dlg.botsdk.LightBot;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        LightBot bot = new LightBot("c1ff5ca4b7e5fa4660c6a730fdcb613e31deafd8");
        bot.start();

        bot.messaging().onMessage((message) -> {
            System.out.println("Got a message: " + message.getText());

            // Sending reply
            bot.messaging().send(message.getPeer(), "Reply to : " + message.getText()).thenAccept(uuid -> {
                System.out.println("Sent a message with UUID: " + uuid);
            });
        });

        bot.await();
    }
}