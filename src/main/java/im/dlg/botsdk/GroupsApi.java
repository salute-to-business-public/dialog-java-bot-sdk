package im.dlg.botsdk;

import com.google.protobuf.StringValue;
import dialog.*;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

public class GroupsApi {

    private InternalBotApi privateBot;

    GroupsApi(InternalBotApi privateBot) {
        this.privateBot = privateBot;
    }

    public CompletableFuture<GroupsOuterClass.Group> createGroup(String title, String username) {
        GroupsOuterClass.RequestCreateGroup request = GroupsOuterClass.RequestCreateGroup.newBuilder()
                .setGroupType(GroupsOuterClass.GroupType.GROUPTYPE_GROUP)
                .setTitle(title)
                .setUsername(StringValue.of(username))
                .setRid(LocalDateTime.now().getSecond())
                .build();

        return privateBot.withToken(
                GroupsGrpc.newFutureStub(privateBot.channel.getChannel()),
                stub -> stub.createGroup(request)
        ).thenApplyAsync(GroupsOuterClass.ResponseCreateGroup::getGroup, privateBot.executor.getExecutor());
    }
}