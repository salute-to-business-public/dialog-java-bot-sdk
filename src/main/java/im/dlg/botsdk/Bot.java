package im.dlg.botsdk;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import im.dlg.botsdk.utils.NetUtils;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import static org.asynchttpclient.Dsl.asyncHttpClient;

public class Bot {

    private static final Logger log = LoggerFactory.getLogger(Bot.class);

    private final Object stopLock = new Object();

    private InternalBotApi internalBotApi;
    private MessagingApi messagingApi;
    private UsersApi users;
    private InteractiveApi interactiveApi;
    private GroupsApi groupsApi;
    private MediaAndFilesApi mediaAndFilesApi;
    private PeersApi peersApi;
    private SyncApi syncApi;
    private BotProfileApi botProfileApil;
    private AsyncHttpClient asyncHttpClient;

    private Bot() {
    }

    private Bot(BotConfig botConfig) {

    }


    /**
     * Launches the bot with token auth, the remaining configuration should go from config file
     *
     * @param token the token, received from parent bot or admin console
     * @return Future that completes when bot authorised
     */
    public static CompletableFuture<Bot> start(String token) {
        Config config = ConfigFactory.load("dialog.conf").getConfig("dialog.botsdk");

        BotConfig botConfig = BotConfig.Builder.newBuilder().withToken(token)
                .withHost(config.getString("host"))
                .withPort(config.getInt("port"))
                .build();

        Bot bot = new Bot(botConfig);
        bot.asyncHttpClient = createHttpClient(botConfig);
        bot.internalBotApi = new InternalBotApi(botConfig, bot.asyncHttpClient);

        return bot.internalBotApi.start()
                .thenAccept(v -> bot.runApis(bot.internalBotApi))
                .thenCompose(aVoid -> CompletableFuture.completedFuture(bot));
    }

    /**
     * Launches the bot with full config
     *
     * @param botConfig the constructed config object
     * @return Future that completes when bot authorised
     */
    public static CompletableFuture<Bot> start(BotConfig botConfig) {
        Bot bot = new Bot();
        bot.asyncHttpClient = createHttpClient(botConfig);
        bot.internalBotApi = new InternalBotApi(botConfig, bot.asyncHttpClient);

        return bot.internalBotApi.start()
                .thenAccept(v -> bot.runApis(bot.internalBotApi))
                .thenCompose(aVoid -> CompletableFuture.completedFuture(bot));
    }

    private void runApis(InternalBotApi internalBotApi) {
        messagingApi = new MessagingApi(internalBotApi);
        users = new UsersApi(internalBotApi);
        interactiveApi = new InteractiveApi(internalBotApi);
        mediaAndFilesApi = new MediaAndFilesApi(internalBotApi);
        groupsApi = new GroupsApi(internalBotApi);
        peersApi = new PeersApi(internalBotApi);
        syncApi = new SyncApi(internalBotApi);
        botProfileApil = new BotProfileApi(internalBotApi);
    }

    private static AsyncHttpClient createHttpClient(BotConfig botConfig) {
        DefaultAsyncHttpClientConfig.Builder builder = new DefaultAsyncHttpClientConfig.Builder();

        if (botConfig.getCertPath() != null && botConfig.getCertPassword() != null) {
            try {
                SslContext sslContext = SslContextBuilder.forClient()
                        .keyManager(NetUtils.createKeyFactory(new File(botConfig.getCertPath()),
                                botConfig.getCertPassword())).build();
                builder.setSslContext(sslContext);
            } catch (Exception e) {
                log.error("Failed to create http client", e);
            }
        }

        return asyncHttpClient(builder);
    }

    /**
     * Method to block execution
     *
     * @throws InterruptedException in wrong case
     */
    public void await() throws InterruptedException {
        synchronized (stopLock) {
            stopLock.wait();
        }
    }

    /**
     * Stops the bot
     */
    public void stop() {
        synchronized (stopLock) {
            if (!asyncHttpClient.isClosed()) {
                try {
                    asyncHttpClient.close();
                } catch (IOException e) {
                    log.error("Failed to stop bot", e);
                }
            }
            stopLock.notifyAll();
        }
    }

    /**
     * @return the object to interact with messaging
     */
    public MessagingApi messaging() {
        return messagingApi;
    }

    /**
     * @return the object to interact with users
     */
    public UsersApi users() {
        return users;
    }

    /**
     * @return the object to interact with buttons/select menus
     */
    public InteractiveApi interactiveApi() {
        return interactiveApi;
    }

    /**
     * @return the object to interact with different media files
     */
    public MediaAndFilesApi mediaAndFilesApi() {
        return mediaAndFilesApi;
    }

    public GroupsApi groupsApi() {
        return groupsApi;
    }

    public PeersApi peersApi() {
        return peersApi;
    }

    public SyncApi syncApi() {
        return syncApi;
    }

    public BotProfileApi botProfileApi() {
        return botProfileApil;
    }

}
