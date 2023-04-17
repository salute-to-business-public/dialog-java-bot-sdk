package im.dlg.botsdk.model;

import im.dlg.botsdk.model.group.GroupData;
import im.dlg.grpc.services.GroupsOuterClass;
import lombok.Getter;

public class Group {
    @Getter
    private final  String shortname;
    @Getter
    private final String title;
    @Getter
    private final Peer peer;
    @Getter
    private final GroupType type;
    @Getter
    private final GroupMember member;
    @Getter
    private final GroupData groupData;

    public Group(GroupsOuterClass.Group serverGroup) {
        shortname = serverGroup.getShortname().getValue();
        title = serverGroup.getTitle();
        peer = new Peer(serverGroup.getId(), Peer.PeerType.GROUP, serverGroup.getAccessHash());
        type = GroupType.fromServer(serverGroup.getGroupType());
        member = new GroupMember(serverGroup.getSelfMember());
        groupData = new GroupData(serverGroup.getData());

    }
}
