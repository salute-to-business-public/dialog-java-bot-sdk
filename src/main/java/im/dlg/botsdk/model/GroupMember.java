package im.dlg.botsdk.model;

import im.dlg.grpc.services.GroupsOuterClass;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

public class GroupMember {
    @Getter
    private final Integer uid;
    @Getter
    private final Long invitedAt;
    @Getter
    private final List<GroupPermission> permissions;

    public GroupMember(GroupsOuterClass.GroupMemberPermission permission){
        uid = permission.getUserId();
        permissions = permission.getPermissionsList().stream().map(GroupPermission::fromServer).collect(Collectors.toList());
        invitedAt = null;
    }

    public GroupMember(GroupsOuterClass.Member member) {
        uid = member.getUid();
        permissions = member.getPermissionsList().stream().map(GroupPermission::fromServer).collect(Collectors.toList());
        invitedAt = member.getInvitedAt();
    }
}
