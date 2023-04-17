package im.dlg.botsdk.model.group;

import com.google.protobuf.Timestamp;
import im.dlg.botsdk.model.GroupPermission;
import im.dlg.botsdk.model.GroupType;
import im.dlg.botsdk.utils.UUIDUtils;
import im.dlg.grpc.services.GroupsOuterClass;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class GroupData {

    @Getter
    private final UUID spaceId;
    @Getter
    private final String title;
    @Getter
    private final int membersAmount;
    @Getter
    private final GroupType groupType;
    @Getter
    private final Timestamp createdAt;
    @Getter
    private final String about;
    @Getter
    private final String shortname;
    @Getter
    private final List<GroupPermission> basePermissions;
    @Getter
    private final long clock;
    @Getter
    private int ownerUserId;
    @Getter
    private final boolean threadEnabled;
    @Getter
    private final long pinnedAt;
    @Getter
    private final String conferenceLink;
    @Getter
    private final int membersCountLimit;
    @Getter
    private final long deletedAt;


    public GroupData(GroupsOuterClass.GroupData groupData) {
        spaceId = UUIDUtils.convert(groupData.getSpaceId());
        title = groupData.getTitle();
        membersAmount = groupData.getMembersAmount();
        groupType = GroupType.fromServer(groupData.getGroupType());
        createdAt = groupData.getCreatedAt();
        about = groupData.getAbout().getValue();
        shortname = groupData.getShortname().getValue();
        basePermissions = groupData.getBasePermissionsList().stream().map(GroupPermission::fromServer).collect(Collectors.toList());
        clock = groupData.getClock();
        pinnedAt = groupData.getPinnedAt().getValue();
        conferenceLink = groupData.getConferenceLink().getValue();
        membersCountLimit = groupData.getMembersCountLimit().getValue();
        deletedAt = groupData.getDeletedAt().getValue();
        ownerUserId = groupData.getOwnerUserId().getValue();
        threadEnabled = groupData.getThreadsEnabled().getValue();

    }
}
