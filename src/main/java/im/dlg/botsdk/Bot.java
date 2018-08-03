package im.dlg.botsdk;

import com.google.protobuf.Empty;
import com.google.protobuf.StringValue;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import dialog.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.MetadataUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class Bot {

    private static Integer appId = 11011;

    private Config config;
    private DialogExecutor executor;
    private ManagedChannel channel;

    private String token;

    private volatile boolean isInitialised = false;

    private final Object initLock = new Object();
    private final Object stopLock = new Object();

    private InternalBotApi internalBotApi;
    private MessagingApi messagingApi;
    private UsersApi users;
    private InteractiveApi interactiveApi;

    public Bot(String token) {
        this.token = token;

        this.config = ConfigFactory.load().getConfig("dialog.botsdk");
        this.executor = new DialogExecutor(config.getInt("fork-join-pool.parallelism"));
        this.channel = ManagedChannelBuilder
                .forAddress(config.getString("host"), config.getInt("port"))
                .usePlaintext()
                .build();
    }

    public CompletableFuture<Void> start() {


        String deviceTitle = "BotWithToken" + token;
        CompletableFuture<Metadata> meta = new CompletableFuture<>();

        return executor.convert(
                RegistrationGrpc.newFutureStub(channel).registerDevice(
                        RegistrationOuterClass.RequestRegisterDevice.newBuilder()
                                .setAppId(appId)
                                .setAppTitle("BotSdk")
                                .setDeviceTitle(deviceTitle)
                                .build()
                )
        ).whenCompleteAsync((res, t) -> {
            if (res != null) {
                Metadata header = new Metadata();
                Metadata.Key<String> key = Metadata.Key.of("x-auth-ticket", Metadata.ASCII_STRING_MARSHALLER);
                header.put(key, res.getToken());

                // start internal apis
                internalBotApi = new InternalBotApi(header, executor, channel);
                runApis(internalBotApi);

                meta.complete(header);
                System.out.println("Bot registered with token = " + res.getToken());
            } else if (t != null) {
                meta.completeExceptionally(t);
            }
        }).thenComposeAsync(res -> meta).thenComposeAsync(m ->
                executor.convert(withToken(
                        m,
                        AuthenticationGrpc.newFutureStub(channel),
                        stub -> stub.startTokenAuth(
                                AuthenticationOuterClass.RequestStartTokenAuth.newBuilder()
                                        .setApiKey("BotSdk")
                                        .setAppId(appId)
                                        .setDeviceTitle(deviceTitle)
                                        .addPreferredLanguages("RU")
                                        .setTimeZone(StringValue.newBuilder().setValue("+3").build())
                                        .setToken(token)
                                        .build()
                        )
                )).thenApplyAsync(res -> new ImmutablePair<>(res.getUser(), m))
        ).thenApplyAsync(p -> {

            withToken(
                    p.getRight(),
                    SequenceAndUpdatesGrpc.newStub(channel),
                    stub -> {
                        stub.seqUpdates(Empty.newBuilder().build(), internalBotApi);
                        return new Object();
                    }
            );

            System.out.println("Bot authorized with id = " + p.getLeft().getId());

            notifyInit();
            return null;
        });
    }

    private void runApis(InternalBotApi internalBotApi) {
        messagingApi = new MessagingApi(internalBotApi);
        users = new UsersApi(internalBotApi);
        interactiveApi = new InteractiveApi(internalBotApi);
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

    private void notifyInit() {
        synchronized (initLock) {
            isInitialised = true;
            initLock.notifyAll();
        }
    }

    private void waitForInit() {
        synchronized (initLock) {
            while (!isInitialised) {
                try {
                    initLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private <T extends AbstractStub<T>, R> R withToken(Metadata meta, T stub, Function<T, R> f) {
        T newStub = MetadataUtils.attachHeaders(stub, meta);
        return f.apply(newStub);
    }

    public MessagingApi messaging() {
        waitForInit();
        return messagingApi;
    }

    public UsersApi users() {
        waitForInit();
        return users;
    }

    public InteractiveApi interactiveApi() {
        waitForInit();
        return interactiveApi;
    }
}
