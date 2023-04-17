package im.dlg.botsdk.api;

import com.google.protobuf.StringValue;
import im.dlg.botsdk.internal.InternalBot;
import im.dlg.botsdk.model.BotCommand;
import im.dlg.grpc.services.ProfileGrpc;
import im.dlg.grpc.services.ProfileOuterClass;
import io.grpc.ManagedChannel;

import javax.annotation.Nonnull;
import java.io.File;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static im.dlg.grpc.services.ProfileOuterClass.RequestEditAbout;

public class BotProfileApi {

    private final ManagedChannel channel;
    private final InternalBot internalBot;
    private final MediaAndFilesApi mediaAndFilesApi;

    public BotProfileApi(ManagedChannel channel, InternalBot internalBot, MediaAndFilesApi mediaAndFilesApi) {
        this.channel = channel;
        this.internalBot = internalBot;
        this.mediaAndFilesApi = mediaAndFilesApi;
    }

    public Integer getBotId() {
        return internalBot.getBotId();
    }

    public CompletableFuture<Void> editAbout(@Nonnull String about) {
        RequestEditAbout request = RequestEditAbout.newBuilder()
                .setAbout(StringValue.of(about))
                .build();

        return internalBot.withToken(ProfileGrpc.newFutureStub(channel),
                        stub -> stub.editAbout(request))
                .thenApply(t -> null);
    }

    public CompletableFuture<Void> updateBotCommands(List<BotCommand> commands) {
        ProfileOuterClass.RequestUpdateBotCommands request = ProfileOuterClass.RequestUpdateBotCommands.newBuilder()
                .addAllBotCommands(commands.stream().map(e -> e.toServer()).collect(Collectors.toList()))
                .build();

        return internalBot.withToken(
                        ProfileGrpc.newFutureStub(channel),
                        stub -> stub.updateBotCommands(request))
                .thenApply(resp -> null);
    }

    public CompletableFuture<Void> updateAvatar(String file) {
        return mediaAndFilesApi.uploadFile(new File(file)).thenAccept(res -> {
            ProfileOuterClass.RequestEditAvatar requestEditAvatar = ProfileOuterClass.RequestEditAvatar.newBuilder()
                    .setFileLocation(res.toServer())
                    .build();

            internalBot.withToken(
                            ProfileGrpc.newFutureStub(channel),
                            stub -> stub.editAvatar(requestEditAvatar))
                    .thenApply(resp -> null);


        });
    }

    public CompletableFuture<Void> updateAvatar(byte[] file) {
        return mediaAndFilesApi.uploadFile(file, "user_picture").thenAccept(res -> {
            ProfileOuterClass.RequestEditAvatar requestEditAvatar = ProfileOuterClass.RequestEditAvatar.newBuilder()
                    .setFileLocation(res.toServer())
                    .build();

            internalBot.withToken(
                            ProfileGrpc.newFutureStub(channel),
                            stub -> stub.editAvatar(requestEditAvatar))
                    .thenApply(resp -> null);


        });
    }

}
