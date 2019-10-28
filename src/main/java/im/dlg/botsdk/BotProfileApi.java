package im.dlg.botsdk;

import com.google.protobuf.StringValue;
import dialog.ProfileGrpc;

import javax.annotation.Nonnull;
import java.util.concurrent.CompletableFuture;

import static dialog.ProfileOuterClass.RequestEditAbout;
import static dialog.ProfileOuterClass.RequestEditName;

public class BotProfileApi {

    private InternalBotApi privateBot;

    BotProfileApi(InternalBotApi privateBot) {
        this.privateBot = privateBot;
    }

    public CompletableFuture<Void> editName(@Nonnull String name) {
        RequestEditName request = RequestEditName.newBuilder().setName(name).build();
        return privateBot.withToken(
                ProfileGrpc.newFutureStub(privateBot.channel.getChannel()),
                stub -> stub.editName(request)).thenApply(t -> null);
    }

    public CompletableFuture<Void> editAbout(@Nonnull String about) {
        RequestEditAbout request = RequestEditAbout.newBuilder().setAbout(StringValue.of(about)).build();
        return privateBot.withToken(
                ProfileGrpc.newFutureStub(privateBot.channel.getChannel()),
                stub -> stub.editAbout(request)).thenApply(t -> null);
    }
}
