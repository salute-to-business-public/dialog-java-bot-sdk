package im.dlg.botsdk.model;

import im.dlg.grpc.services.GroupsOuterClass;

public enum GroupPermission {

    UNRECOGNIDED,
    DELETE,
    KICK,
    LEAVE,
    INVITE,
    UNKNOWN,
    TARGETING,
    PINMESSAGE,
    UPDATEINFO,
    EDITMESSAGE,
    SENDMESSAGE,
    VIEWMEMBERS,
    DELETEMESSAGE,
    EDITSHORTNAME,
    SETPERMISSIONS,
    MANAGE_CONFERENCE,
    GETINTEGRATIONTOKEN,
    WRITE_THREAD,
    READ_THREAD,
    MANAGE_THREAD
    ;

    public static GroupPermission fromServer(GroupsOuterClass.GroupAdminPermission permission) {
        switch (permission) {

            case GROUPADMINPERMISSION_KICK:
                return KICK;
            case GROUPADMINPERMISSION_LEAVE:
                return LEAVE;
            case GROUPADMINPERMISSION_INVITE:
                return INVITE;
            case GROUPADMINPERMISSION_UNKNOWN:
                return UNKNOWN;
            case GROUPADMINPERMISSION_TARGETING:
                return TARGETING;
            case GROUPADMINPERMISSION_PINMESSAGE:
                return PINMESSAGE;
            case GROUPADMINPERMISSION_UPDATEINFO:
                return UPDATEINFO;
            case GROUPADMINPERMISSION_EDITMESSAGE:
                return EDITMESSAGE;
            case GROUPADMINPERMISSION_SENDMESSAGE:
                return SENDMESSAGE;
            case GROUPADMINPERMISSION_VIEWMEMBERS:
                return VIEWMEMBERS;
            case GROUPADMINPERMISSION_DELETEMESSAGE:
                return DELETEMESSAGE;
            case GROUPADMINPERMISSION_EDITSHORTNAME:
                return EDITSHORTNAME;
            case GROUPADMINPERMISSION_SETPERMISSIONS:
                return SETPERMISSIONS;
            case GROUPADMINPERMISSION_MANAGE_CONFERENCE:
                return MANAGE_CONFERENCE;
            case GROUPADMINPERMISSION_GETINTEGRATIONTOKEN:
                return GETINTEGRATIONTOKEN;
            case GROUPADMINPERMISSION_DELETE:
                return DELETE;
            case GROUPADMINPERMISSION_MANAGE_THREADS:
                return MANAGE_THREAD;
            case GROUPADMINPERMISSION_READ_THREADS:
                return READ_THREAD;
            case GROUPADMINPERMISSION_WRITE_THREADS:
                return WRITE_THREAD;
            case UNRECOGNIZED:
            default:
                return GroupPermission.UNRECOGNIDED;
        }
    }

    public static GroupsOuterClass.GroupAdminPermission toServer(GroupPermission permission) {
        switch (permission) {
            case KICK:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_KICK;
            case LEAVE:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_LEAVE;
            case INVITE:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_INVITE;
            case UNKNOWN:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_UNKNOWN;
            case TARGETING:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_TARGETING;
            case PINMESSAGE:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_PINMESSAGE;
            case UPDATEINFO:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_UPDATEINFO;
            case EDITMESSAGE:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_EDITMESSAGE;
            case SENDMESSAGE:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_SENDMESSAGE;
            case VIEWMEMBERS:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_VIEWMEMBERS;
            case DELETEMESSAGE:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_DELETEMESSAGE;
            case EDITSHORTNAME:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_EDITSHORTNAME;
            case SETPERMISSIONS:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_SETPERMISSIONS;
            case MANAGE_CONFERENCE:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_MANAGE_CONFERENCE;
            case GETINTEGRATIONTOKEN:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_GETINTEGRATIONTOKEN;
            case DELETE:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_DELETE;
            case MANAGE_THREAD:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_MANAGE_THREADS;
            case READ_THREAD:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_READ_THREADS;
            case WRITE_THREAD:
                return GroupsOuterClass.GroupAdminPermission.GROUPADMINPERMISSION_WRITE_THREADS;
            case UNRECOGNIDED:
            default:
                return GroupsOuterClass.GroupAdminPermission.UNRECOGNIZED;
        }
    }
}
