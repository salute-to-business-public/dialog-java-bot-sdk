package im.dlg.botsdk;

import com.google.protobuf.StringValue;
import dialog.ProfileGrpc;
import dialog.ProfileOuterClass;
import io.grpc.ManagedChannel;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

//TODO: remove
public class ProfileHandlers {
    private InternalBotApi bot;
    private ManagedChannel channel;
    private Executor executor;

    public ProfileHandlers(InternalBotApi bot, ManagedChannel channel, Executor executor) {
        this.bot = bot;
        this.channel = channel;
        this.executor = executor;
    }

    public CompletableFuture<Void> editName(String name) {
        return bot.withToken(
                ProfileGrpc.newFutureStub(channel),
                stub -> stub.editName(ProfileOuterClass.RequestEditName.newBuilder().setName(name).build())
        ).thenAcceptAsync(x -> bot.setName(name), executor);
    }

    public CompletableFuture<Void> editNickname(String nick) {
        return bot.withToken(
                ProfileGrpc.newFutureStub(channel),
                stub -> stub.editNickName(
                        ProfileOuterClass.RequestEditNickName.newBuilder()
                                .setNickname(StringValue.newBuilder().setValue(nick).build())
                                .build()
                )
        ).thenAcceptAsync(x -> bot.setNick(nick), executor);
    }

    public CompletableFuture<Void> editAbout(String about) {
        return bot.withToken(
                ProfileGrpc.newFutureStub(channel),
                stub -> stub.editAbout(ProfileOuterClass.RequestEditAbout.newBuilder()
                        .setAbout(StringValue.newBuilder().setValue(about).build())
                        .build()
                )
        ).thenAcceptAsync(x -> bot.setAbout(about), executor);
    }
}
