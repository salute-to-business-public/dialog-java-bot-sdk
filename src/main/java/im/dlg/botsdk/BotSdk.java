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

public class BotSdk {
    private static Integer appId = 11011;

    private Config config;
    private DialogExecutor executor;
    private ManagedChannel channel;

    public BotSdk() {
        this.config = ConfigFactory.load().getConfig("dialog.botsdk");
        this.executor = new DialogExecutor(config.getInt("fork-join-pool.parallelism"));
        this.channel = ManagedChannelBuilder
                .forAddress(config.getString("host"), config.getInt("port"))
                .usePlaintext()
                .build();
    }

    public CompletableFuture<ActiveBot> start(Bot bot) {
        String deviceTitle = "BotWithToken" + bot.getRegistrationToken();
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
                                        .setToken(bot.getRegistrationToken())
                                        .build()
                        )
                )).thenApplyAsync(res -> new ImmutablePair<>(res.getUser(), m))
        ).thenApplyAsync(p -> {
            ActiveBot activeBot = new ActiveBot(this, p.getLeft(), p.getRight());

            withToken(
                    p.getRight(),
                    SequenceAndUpdatesGrpc.newStub(channel),
                    stub -> {
                        stub.seqUpdates(Empty.newBuilder().build(), new BotSdkSeqUpdatesObserver(activeBot, bot));
                        return new Object();
                    }
            );

            System.out.println("Bot authorized with id = " + p.getLeft().getId());

            return activeBot;
        });
    }

    private <T extends AbstractStub<T>, R> R withToken(Metadata meta, T stub, Function<T, R> f) {
        T newStub = MetadataUtils.attachHeaders(stub, meta);
        return f.apply(newStub);
    }

    DialogExecutor getExecutor() {
        return executor;
    }

    ManagedChannel getChannel() {
        return channel;
    }
}
