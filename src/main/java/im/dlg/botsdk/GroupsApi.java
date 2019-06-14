package im.dlg.botsdk;

import com.google.protobuf.StringValue;
import dialog.*;
import im.dlg.botsdk.domain.Group;
import im.dlg.botsdk.domain.GroupType;
import im.dlg.botsdk.domain.Peer;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

public class GroupsApi {

    private InternalBotApi privateBot;

    GroupsApi(InternalBotApi privateBot) {
        this.privateBot = privateBot;
    }

    public CompletableFuture<Group> createGroup(String title, String username) {
        GroupsOuterClass.RequestCreateGroup request = GroupsOuterClass.RequestCreateGroup.newBuilder()
                .setGroupType(GroupsOuterClass.GroupType.GROUPTYPE_GROUP)
                .setTitle(title)
                .setUsername(StringValue.of(username))
                .setRid(LocalDateTime.now().getSecond())
                .build();

        return privateBot.withToken(
                GroupsGrpc.newFutureStub(privateBot.channel.getChannel()),
                stub -> stub.createGroup(request)
        ).thenApplyAsync(g -> {
            GroupsOuterClass.Group group = g.getGroup();
            return new Group(
                    group.getShortname().getValue(),
                    group.getTitle(),
                    new Peer(group.getId(), Peer.PeerType.GROUP, group.getAccessHash()),
                    GroupType.fromServer(group.getGroupType()));
        }, privateBot.executor.getExecutor());
    }
}