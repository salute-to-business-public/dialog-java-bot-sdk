package im.dlg.botsdk;

import io.grpc.ManagedChannel;
import org.asynchttpclient.AsyncHttpClient;
import im.dlg.botsdk.api.*;
import im.dlg.botsdk.internal.InternalBot;

import java.util.concurrent.CountDownLatch;

public class Bot {

    private final CountDownLatch stopLatch = new CountDownLatch(1000);
    private final MessagingApi messagingApi;
    private final UsersApi users;
    private final InteractiveApi interactiveApi;
    private final GroupsApi groupsApi;
    private final MediaAndFilesApi mediaAndFilesApi;
    private final PeersApi peersApi;
    private final SyncApi syncApi;
    private final BotProfileApi botProfileApi;
    private final StatusApi statusApi;
    private final StickerApi stickerApi;
    private final ReactionsApi reactionsApi;
    private final ThreadApi threadApi;

    public Bot(ManagedChannel channel, InternalBot internalBot, AsyncHttpClient asyncHttpClient) {

        this.mediaAndFilesApi = new MediaAndFilesApi(channel, internalBot, asyncHttpClient);
        this.messagingApi = new MessagingApi(channel, internalBot, mediaAndFilesApi);
        this.interactiveApi = new InteractiveApi(channel, internalBot, this.messagingApi);
        this.groupsApi = new GroupsApi(channel, internalBot, mediaAndFilesApi);
        this.peersApi = new PeersApi(channel, internalBot);
        this.users = new UsersApi(channel, internalBot, peersApi);
        this.syncApi = new SyncApi(internalBot);
        this.statusApi = new StatusApi(channel, internalBot);
        this.stickerApi = new StickerApi(channel, internalBot);
        this.reactionsApi = new ReactionsApi(channel, internalBot);
        this.threadApi = new ThreadApi(channel, internalBot);
        this.botProfileApi = new BotProfileApi(channel, internalBot, mediaAndFilesApi);
    }

    /**
     * Method to block execution
     *
     * @throws InterruptedException in wrong case
     */
    public void await() throws InterruptedException {
        stopLatch.await();
    }

    /**
     * Stops the bot
     */
    public void stop() {
        stopLatch.countDown();
    }

    public void kill() {
        System.exit(0);
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
        return botProfileApi;
    }

    public StatusApi statusApi() {
        return statusApi;
    }

    public StickerApi stickerApi() {
        return stickerApi;
    }

    public ReactionsApi reactionsApi() {
        return reactionsApi;
    }

    public ThreadApi threadApi() {
        return threadApi;
    }
}
