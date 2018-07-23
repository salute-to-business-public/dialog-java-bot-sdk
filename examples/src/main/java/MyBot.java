import im.dlg.botsdk.ActiveBot;
import im.dlg.botsdk.Bot;
import im.dlg.botsdk.domain.Message;

import java.util.concurrent.CompletableFuture;

public class MyBot extends Bot {
    private String registrationToken;

    public MyBot(String registrationToken) {
        super();
        this.registrationToken = registrationToken;
    }

    @Override
    public String getRegistrationToken() {
        return registrationToken;
    }

    @Override
    protected CompletableFuture<Void> onMessage(Message message, ActiveBot bot) {
        System.out.println("Message received '" + message.getText() + "' from sender " + message.getSender().getId());

        return bot.users().load(message.getSender()).thenComposeAsync(optSender ->
                optSender.map(sender ->
                        bot.messaging()
                                .send(message.getSender(), "Hello, " + sender.getName() + "!")
                                .thenAcceptAsync(x -> {})
                ).orElse(CompletableFuture.completedFuture(null))
        );
    }
}
