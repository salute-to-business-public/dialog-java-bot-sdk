package im.dlg.botsdk;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Bot {

    private BotConfig botConfig;

    private final Object stopLock = new Object();

    private InternalBotApi internalBotApi;
    private MessagingApi messagingApi;
    private UsersApi users;
    private InteractiveApi interactiveApi;
    private MediaAndFilesApi mediaAndFilesApi;
    private DialogExecutor executor;

    private volatile CompletableFuture<Bot> voidCompletableFuture;

    private Bot() {
        this.executor = new DialogExecutor(4);
    }

    private Bot(BotConfig botConfig) {
        this.botConfig = botConfig;
        this.executor = new DialogExecutor(4);
    }


    public static CompletableFuture<Bot> start(String token) {
        Config config = ConfigFactory.load("dialog.conf").getConfig("dialog.botsdk");

        BotConfig botConfig = new BotConfig.Builder().withToken(token)
                .withHost(config.getString("host"))
                .withPort(config.getInt("port")).build();

        Bot instance = new Bot(botConfig);
        instance.internalBotApi = new InternalBotApi(botConfig, instance.executor);

        instance.voidCompletableFuture = instance.internalBotApi.start().thenAccept(v -> {
            instance.runApis(instance.internalBotApi);
        }).thenCompose(aVoid -> CompletableFuture.completedFuture(instance));

        return instance.voidCompletableFuture;
    }

    public static CompletableFuture<Bot> start(BotConfig botConfig) {
        Bot instance = new Bot();
        instance.internalBotApi = new InternalBotApi(botConfig, instance.executor);

        instance.voidCompletableFuture = instance.internalBotApi.start().thenAccept(v -> {
            instance.runApis(instance.internalBotApi);
        }).thenCompose(aVoid -> CompletableFuture.completedFuture(instance));

        return instance.voidCompletableFuture;
    }

    private void runApis(InternalBotApi internalBotApi) {
        messagingApi = new MessagingApi(internalBotApi);
        users = new UsersApi(internalBotApi);
        interactiveApi = new InteractiveApi(internalBotApi);
        mediaAndFilesApi = new MediaAndFilesApi(internalBotApi);
    }

    public void await() throws InterruptedException {
        synchronized (stopLock) {
            stopLock.wait();
        }
    }

    public void stop() {
        synchronized (stopLock) {
            stopLock.notifyAll();
        }
    }

    private void lock() {
        try {
            voidCompletableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public MessagingApi messaging() {
        lock();
        return messagingApi;
    }

    public UsersApi users() {
        lock();
        return users;
    }

    public InteractiveApi interactiveApi() {
        lock();
        return interactiveApi;
    }

    public MediaAndFilesApi mediaAndFilesApi() {
        lock();
        return mediaAndFilesApi;
    }
}
