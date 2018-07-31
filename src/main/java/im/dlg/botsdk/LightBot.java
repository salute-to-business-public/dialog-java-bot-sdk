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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class LightBot {

////
    private static Integer appId = 11011;

    private Config config;
    private DialogExecutor executor;
    private ManagedChannel channel;
////

    private ExecutorService executorService = Executors.newFixedThreadPool(4);
    private String token;
    private String name;

    private volatile boolean isInited = false;
    private final Object initLock = new Object();

//    private Runnable onMessage;


    private ActiveBot activeBot;
    private Messaging messaging;


    public LightBot(String token, String name) {
        this.token = token;
        this.name = name;

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
                activeBot = new ActiveBot(header, executor, channel);
                messaging = new Messaging(activeBot);
                //////


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
                        stub.seqUpdates(Empty.newBuilder().build(), activeBot);
                        return new Object();
                    }
            );

            System.out.println("Bot authorized with id = " + p.getLeft().getId());

            notifyInit();
            return null;
        });
    }

//    public void stop() {
//
//    }

    private void notifyInit() {
        synchronized (initLock) {
            isInited = true;
            initLock.notifyAll();
        }
    }

    private void waitForInit() {
        synchronized (initLock) {
            while (!isInited) {
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

    public Messaging messaging() {
        waitForInit();
        return messaging;
    }
}
