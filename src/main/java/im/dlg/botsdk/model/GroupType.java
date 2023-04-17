package im.dlg.botsdk.model;

import im.dlg.grpc.services.GroupsOuterClass;

public enum GroupType {
    GROUP,
    CHANNEL,
    UNKNOWN;

    public static GroupType fromServer(GroupsOuterClass.GroupType groupType) {
        switch (groupType) {
            case GROUPTYPE_GROUP:
                return GroupType.GROUP;
            case GROUPTYPE_CHANNEL:
                return GroupType.CHANNEL;
            default:
                return GroupType.UNKNOWN;
        }
    }

    public GroupsOuterClass.GroupType toServer() {
        switch (this) {
            case GROUP:
                return GroupsOuterClass.GroupType.GROUPTYPE_GROUP;
            case CHANNEL:
                return GroupsOuterClass.GroupType.GROUPTYPE_CHANNEL;
            case UNKNOWN:
            default:
                return GroupsOuterClass.GroupType.GROUPTYPE_UNKNOWN;
        }
    }
}