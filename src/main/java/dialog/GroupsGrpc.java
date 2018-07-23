package dialog;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.2)",
    comments = "Source: groups.proto")
public final class GroupsGrpc {

  private GroupsGrpc() {}

  public static final String SERVICE_NAME = "dialog.Groups";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestLoadFullGroups,
      dialog.GroupsOuterClass.ResponseLoadFullGroups> getLoadFullGroupsMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestLoadFullGroups,
      dialog.GroupsOuterClass.ResponseLoadFullGroups> getLoadFullGroupsMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestLoadFullGroups, dialog.GroupsOuterClass.ResponseLoadFullGroups> getLoadFullGroupsMethod;
    if ((getLoadFullGroupsMethod = GroupsGrpc.getLoadFullGroupsMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getLoadFullGroupsMethod = GroupsGrpc.getLoadFullGroupsMethod) == null) {
          GroupsGrpc.getLoadFullGroupsMethod = getLoadFullGroupsMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestLoadFullGroups, dialog.GroupsOuterClass.ResponseLoadFullGroups>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "LoadFullGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestLoadFullGroups.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.ResponseLoadFullGroups.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("LoadFullGroups"))
                  .build();
          }
        }
     }
     return getLoadFullGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestLoadMembers,
      dialog.GroupsOuterClass.ResponseLoadMembers> getLoadMembersMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestLoadMembers,
      dialog.GroupsOuterClass.ResponseLoadMembers> getLoadMembersMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestLoadMembers, dialog.GroupsOuterClass.ResponseLoadMembers> getLoadMembersMethod;
    if ((getLoadMembersMethod = GroupsGrpc.getLoadMembersMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getLoadMembersMethod = GroupsGrpc.getLoadMembersMethod) == null) {
          GroupsGrpc.getLoadMembersMethod = getLoadMembersMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestLoadMembers, dialog.GroupsOuterClass.ResponseLoadMembers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "LoadMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestLoadMembers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.ResponseLoadMembers.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("LoadMembers"))
                  .build();
          }
        }
     }
     return getLoadMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestCreateGroup,
      dialog.GroupsOuterClass.ResponseCreateGroup> getCreateGroupMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestCreateGroup,
      dialog.GroupsOuterClass.ResponseCreateGroup> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestCreateGroup, dialog.GroupsOuterClass.ResponseCreateGroup> getCreateGroupMethod;
    if ((getCreateGroupMethod = GroupsGrpc.getCreateGroupMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getCreateGroupMethod = GroupsGrpc.getCreateGroupMethod) == null) {
          GroupsGrpc.getCreateGroupMethod = getCreateGroupMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestCreateGroup, dialog.GroupsOuterClass.ResponseCreateGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestCreateGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.ResponseCreateGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("CreateGroup"))
                  .build();
          }
        }
     }
     return getCreateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupTitle,
      dialog.Miscellaneous.ResponseSeqDateMid> getEditGroupTitleMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupTitle,
      dialog.Miscellaneous.ResponseSeqDateMid> getEditGroupTitleMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupTitle, dialog.Miscellaneous.ResponseSeqDateMid> getEditGroupTitleMethod;
    if ((getEditGroupTitleMethod = GroupsGrpc.getEditGroupTitleMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getEditGroupTitleMethod = GroupsGrpc.getEditGroupTitleMethod) == null) {
          GroupsGrpc.getEditGroupTitleMethod = getEditGroupTitleMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestEditGroupTitle, dialog.Miscellaneous.ResponseSeqDateMid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "EditGroupTitle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestEditGroupTitle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDateMid.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("EditGroupTitle"))
                  .build();
          }
        }
     }
     return getEditGroupTitleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestSetGroupShortname,
      dialog.Miscellaneous.ResponseSeq> getSetGroupShortnameMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestSetGroupShortname,
      dialog.Miscellaneous.ResponseSeq> getSetGroupShortnameMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestSetGroupShortname, dialog.Miscellaneous.ResponseSeq> getSetGroupShortnameMethod;
    if ((getSetGroupShortnameMethod = GroupsGrpc.getSetGroupShortnameMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getSetGroupShortnameMethod = GroupsGrpc.getSetGroupShortnameMethod) == null) {
          GroupsGrpc.getSetGroupShortnameMethod = getSetGroupShortnameMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestSetGroupShortname, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "SetGroupShortname"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestSetGroupShortname.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("SetGroupShortname"))
                  .build();
          }
        }
     }
     return getSetGroupShortnameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupAvatar,
      dialog.GroupsOuterClass.ResponseEditGroupAvatar> getEditGroupAvatarMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupAvatar,
      dialog.GroupsOuterClass.ResponseEditGroupAvatar> getEditGroupAvatarMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupAvatar, dialog.GroupsOuterClass.ResponseEditGroupAvatar> getEditGroupAvatarMethod;
    if ((getEditGroupAvatarMethod = GroupsGrpc.getEditGroupAvatarMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getEditGroupAvatarMethod = GroupsGrpc.getEditGroupAvatarMethod) == null) {
          GroupsGrpc.getEditGroupAvatarMethod = getEditGroupAvatarMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestEditGroupAvatar, dialog.GroupsOuterClass.ResponseEditGroupAvatar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "EditGroupAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestEditGroupAvatar.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.ResponseEditGroupAvatar.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("EditGroupAvatar"))
                  .build();
          }
        }
     }
     return getEditGroupAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestRemoveGroupAvatar,
      dialog.Miscellaneous.ResponseSeqDateMid> getRemoveGroupAvatarMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestRemoveGroupAvatar,
      dialog.Miscellaneous.ResponseSeqDateMid> getRemoveGroupAvatarMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestRemoveGroupAvatar, dialog.Miscellaneous.ResponseSeqDateMid> getRemoveGroupAvatarMethod;
    if ((getRemoveGroupAvatarMethod = GroupsGrpc.getRemoveGroupAvatarMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getRemoveGroupAvatarMethod = GroupsGrpc.getRemoveGroupAvatarMethod) == null) {
          GroupsGrpc.getRemoveGroupAvatarMethod = getRemoveGroupAvatarMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestRemoveGroupAvatar, dialog.Miscellaneous.ResponseSeqDateMid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "RemoveGroupAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestRemoveGroupAvatar.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDateMid.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("RemoveGroupAvatar"))
                  .build();
          }
        }
     }
     return getRemoveGroupAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupTopic,
      dialog.Miscellaneous.ResponseSeqDate> getEditGroupTopicMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupTopic,
      dialog.Miscellaneous.ResponseSeqDate> getEditGroupTopicMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupTopic, dialog.Miscellaneous.ResponseSeqDate> getEditGroupTopicMethod;
    if ((getEditGroupTopicMethod = GroupsGrpc.getEditGroupTopicMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getEditGroupTopicMethod = GroupsGrpc.getEditGroupTopicMethod) == null) {
          GroupsGrpc.getEditGroupTopicMethod = getEditGroupTopicMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestEditGroupTopic, dialog.Miscellaneous.ResponseSeqDate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "EditGroupTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestEditGroupTopic.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDate.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("EditGroupTopic"))
                  .build();
          }
        }
     }
     return getEditGroupTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupAbout,
      dialog.Miscellaneous.ResponseSeqDate> getEditGroupAboutMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupAbout,
      dialog.Miscellaneous.ResponseSeqDate> getEditGroupAboutMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestEditGroupAbout, dialog.Miscellaneous.ResponseSeqDate> getEditGroupAboutMethod;
    if ((getEditGroupAboutMethod = GroupsGrpc.getEditGroupAboutMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getEditGroupAboutMethod = GroupsGrpc.getEditGroupAboutMethod) == null) {
          GroupsGrpc.getEditGroupAboutMethod = getEditGroupAboutMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestEditGroupAbout, dialog.Miscellaneous.ResponseSeqDate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "EditGroupAbout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestEditGroupAbout.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDate.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("EditGroupAbout"))
                  .build();
          }
        }
     }
     return getEditGroupAboutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestInviteUser,
      dialog.Miscellaneous.ResponseSeqDateMid> getInviteUserMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestInviteUser,
      dialog.Miscellaneous.ResponseSeqDateMid> getInviteUserMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestInviteUser, dialog.Miscellaneous.ResponseSeqDateMid> getInviteUserMethod;
    if ((getInviteUserMethod = GroupsGrpc.getInviteUserMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getInviteUserMethod = GroupsGrpc.getInviteUserMethod) == null) {
          GroupsGrpc.getInviteUserMethod = getInviteUserMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestInviteUser, dialog.Miscellaneous.ResponseSeqDateMid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "InviteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestInviteUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDateMid.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("InviteUser"))
                  .build();
          }
        }
     }
     return getInviteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestLeaveGroup,
      dialog.Miscellaneous.ResponseSeqDateMid> getLeaveGroupMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestLeaveGroup,
      dialog.Miscellaneous.ResponseSeqDateMid> getLeaveGroupMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestLeaveGroup, dialog.Miscellaneous.ResponseSeqDateMid> getLeaveGroupMethod;
    if ((getLeaveGroupMethod = GroupsGrpc.getLeaveGroupMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getLeaveGroupMethod = GroupsGrpc.getLeaveGroupMethod) == null) {
          GroupsGrpc.getLeaveGroupMethod = getLeaveGroupMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestLeaveGroup, dialog.Miscellaneous.ResponseSeqDateMid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "LeaveGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestLeaveGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDateMid.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("LeaveGroup"))
                  .build();
          }
        }
     }
     return getLeaveGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestKickUser,
      dialog.Miscellaneous.ResponseSeqDateMid> getKickUserMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestKickUser,
      dialog.Miscellaneous.ResponseSeqDateMid> getKickUserMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestKickUser, dialog.Miscellaneous.ResponseSeqDateMid> getKickUserMethod;
    if ((getKickUserMethod = GroupsGrpc.getKickUserMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getKickUserMethod = GroupsGrpc.getKickUserMethod) == null) {
          GroupsGrpc.getKickUserMethod = getKickUserMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestKickUser, dialog.Miscellaneous.ResponseSeqDateMid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "KickUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestKickUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDateMid.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("KickUser"))
                  .build();
          }
        }
     }
     return getKickUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestMakeUserAdmin,
      dialog.Miscellaneous.ResponseSeqDate> getMakeUserAdminMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestMakeUserAdmin,
      dialog.Miscellaneous.ResponseSeqDate> getMakeUserAdminMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestMakeUserAdmin, dialog.Miscellaneous.ResponseSeqDate> getMakeUserAdminMethod;
    if ((getMakeUserAdminMethod = GroupsGrpc.getMakeUserAdminMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getMakeUserAdminMethod = GroupsGrpc.getMakeUserAdminMethod) == null) {
          GroupsGrpc.getMakeUserAdminMethod = getMakeUserAdminMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestMakeUserAdmin, dialog.Miscellaneous.ResponseSeqDate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "MakeUserAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestMakeUserAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDate.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("MakeUserAdmin"))
                  .build();
          }
        }
     }
     return getMakeUserAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestGetGroupMemberPermissions,
      dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions> getGetGroupMemberPermissionsMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestGetGroupMemberPermissions,
      dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions> getGetGroupMemberPermissionsMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestGetGroupMemberPermissions, dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions> getGetGroupMemberPermissionsMethod;
    if ((getGetGroupMemberPermissionsMethod = GroupsGrpc.getGetGroupMemberPermissionsMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getGetGroupMemberPermissionsMethod = GroupsGrpc.getGetGroupMemberPermissionsMethod) == null) {
          GroupsGrpc.getGetGroupMemberPermissionsMethod = getGetGroupMemberPermissionsMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestGetGroupMemberPermissions, dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "GetGroupMemberPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestGetGroupMemberPermissions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("GetGroupMemberPermissions"))
                  .build();
          }
        }
     }
     return getGetGroupMemberPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestTransferOwnership,
      dialog.Miscellaneous.ResponseSeqDate> getTransferOwnershipMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestTransferOwnership,
      dialog.Miscellaneous.ResponseSeqDate> getTransferOwnershipMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestTransferOwnership, dialog.Miscellaneous.ResponseSeqDate> getTransferOwnershipMethod;
    if ((getTransferOwnershipMethod = GroupsGrpc.getTransferOwnershipMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getTransferOwnershipMethod = GroupsGrpc.getTransferOwnershipMethod) == null) {
          GroupsGrpc.getTransferOwnershipMethod = getTransferOwnershipMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestTransferOwnership, dialog.Miscellaneous.ResponseSeqDate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "TransferOwnership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestTransferOwnership.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDate.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("TransferOwnership"))
                  .build();
          }
        }
     }
     return getTransferOwnershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestGetGroupInviteUrl,
      dialog.GroupsOuterClass.ResponseInviteUrl> getGetGroupInviteUrlMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestGetGroupInviteUrl,
      dialog.GroupsOuterClass.ResponseInviteUrl> getGetGroupInviteUrlMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestGetGroupInviteUrl, dialog.GroupsOuterClass.ResponseInviteUrl> getGetGroupInviteUrlMethod;
    if ((getGetGroupInviteUrlMethod = GroupsGrpc.getGetGroupInviteUrlMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getGetGroupInviteUrlMethod = GroupsGrpc.getGetGroupInviteUrlMethod) == null) {
          GroupsGrpc.getGetGroupInviteUrlMethod = getGetGroupInviteUrlMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestGetGroupInviteUrl, dialog.GroupsOuterClass.ResponseInviteUrl>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "GetGroupInviteUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestGetGroupInviteUrl.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.ResponseInviteUrl.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("GetGroupInviteUrl"))
                  .build();
          }
        }
     }
     return getGetGroupInviteUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase,
      dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase> getGetGroupInviteUrlBaseMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase,
      dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase> getGetGroupInviteUrlBaseMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase, dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase> getGetGroupInviteUrlBaseMethod;
    if ((getGetGroupInviteUrlBaseMethod = GroupsGrpc.getGetGroupInviteUrlBaseMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getGetGroupInviteUrlBaseMethod = GroupsGrpc.getGetGroupInviteUrlBaseMethod) == null) {
          GroupsGrpc.getGetGroupInviteUrlBaseMethod = getGetGroupInviteUrlBaseMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase, dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "GetGroupInviteUrlBase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("GetGroupInviteUrlBase"))
                  .build();
          }
        }
     }
     return getGetGroupInviteUrlBaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestRevokeInviteUrl,
      dialog.GroupsOuterClass.ResponseInviteUrl> getRevokeInviteUrlMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestRevokeInviteUrl,
      dialog.GroupsOuterClass.ResponseInviteUrl> getRevokeInviteUrlMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestRevokeInviteUrl, dialog.GroupsOuterClass.ResponseInviteUrl> getRevokeInviteUrlMethod;
    if ((getRevokeInviteUrlMethod = GroupsGrpc.getRevokeInviteUrlMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getRevokeInviteUrlMethod = GroupsGrpc.getRevokeInviteUrlMethod) == null) {
          GroupsGrpc.getRevokeInviteUrlMethod = getRevokeInviteUrlMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestRevokeInviteUrl, dialog.GroupsOuterClass.ResponseInviteUrl>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "RevokeInviteUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestRevokeInviteUrl.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.ResponseInviteUrl.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("RevokeInviteUrl"))
                  .build();
          }
        }
     }
     return getRevokeInviteUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestJoinGroup,
      dialog.GroupsOuterClass.ResponseJoinGroup> getJoinGroupMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestJoinGroup,
      dialog.GroupsOuterClass.ResponseJoinGroup> getJoinGroupMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestJoinGroup, dialog.GroupsOuterClass.ResponseJoinGroup> getJoinGroupMethod;
    if ((getJoinGroupMethod = GroupsGrpc.getJoinGroupMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getJoinGroupMethod = GroupsGrpc.getJoinGroupMethod) == null) {
          GroupsGrpc.getJoinGroupMethod = getJoinGroupMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestJoinGroup, dialog.GroupsOuterClass.ResponseJoinGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "JoinGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestJoinGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.ResponseJoinGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("JoinGroup"))
                  .build();
          }
        }
     }
     return getJoinGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestJoinGroupByPeer,
      dialog.Miscellaneous.ResponseVoid> getJoinGroupByPeerMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestJoinGroupByPeer,
      dialog.Miscellaneous.ResponseVoid> getJoinGroupByPeerMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestJoinGroupByPeer, dialog.Miscellaneous.ResponseVoid> getJoinGroupByPeerMethod;
    if ((getJoinGroupByPeerMethod = GroupsGrpc.getJoinGroupByPeerMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getJoinGroupByPeerMethod = GroupsGrpc.getJoinGroupByPeerMethod) == null) {
          GroupsGrpc.getJoinGroupByPeerMethod = getJoinGroupByPeerMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestJoinGroupByPeer, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "JoinGroupByPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestJoinGroupByPeer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("JoinGroupByPeer"))
                  .build();
          }
        }
     }
     return getJoinGroupByPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestMakeUserAdminObsolete,
      dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete> getMakeUserAdminObsoleteMethod;

  public static io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestMakeUserAdminObsolete,
      dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete> getMakeUserAdminObsoleteMethod() {
    io.grpc.MethodDescriptor<dialog.GroupsOuterClass.RequestMakeUserAdminObsolete, dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete> getMakeUserAdminObsoleteMethod;
    if ((getMakeUserAdminObsoleteMethod = GroupsGrpc.getMakeUserAdminObsoleteMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getMakeUserAdminObsoleteMethod = GroupsGrpc.getMakeUserAdminObsoleteMethod) == null) {
          GroupsGrpc.getMakeUserAdminObsoleteMethod = getMakeUserAdminObsoleteMethod = 
              io.grpc.MethodDescriptor.<dialog.GroupsOuterClass.RequestMakeUserAdminObsolete, dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Groups", "MakeUserAdminObsolete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.RequestMakeUserAdminObsolete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("MakeUserAdminObsolete"))
                  .build();
          }
        }
     }
     return getMakeUserAdminObsoleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupsStub newStub(io.grpc.Channel channel) {
    return new GroupsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupsFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupsImplBase implements io.grpc.BindableService {

    /**
     */
    public void loadFullGroups(dialog.GroupsOuterClass.RequestLoadFullGroups request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseLoadFullGroups> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadFullGroupsMethod(), responseObserver);
    }

    /**
     */
    public void loadMembers(dialog.GroupsOuterClass.RequestLoadMembers request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseLoadMembers> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadMembersMethod(), responseObserver);
    }

    /**
     */
    public void createGroup(dialog.GroupsOuterClass.RequestCreateGroup request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseCreateGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     */
    public void editGroupTitle(dialog.GroupsOuterClass.RequestEditGroupTitle request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid> responseObserver) {
      asyncUnimplementedUnaryCall(getEditGroupTitleMethod(), responseObserver);
    }

    /**
     */
    public void setGroupShortname(dialog.GroupsOuterClass.RequestSetGroupShortname request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getSetGroupShortnameMethod(), responseObserver);
    }

    /**
     */
    public void editGroupAvatar(dialog.GroupsOuterClass.RequestEditGroupAvatar request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseEditGroupAvatar> responseObserver) {
      asyncUnimplementedUnaryCall(getEditGroupAvatarMethod(), responseObserver);
    }

    /**
     */
    public void removeGroupAvatar(dialog.GroupsOuterClass.RequestRemoveGroupAvatar request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveGroupAvatarMethod(), responseObserver);
    }

    /**
     */
    public void editGroupTopic(dialog.GroupsOuterClass.RequestEditGroupTopic request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnimplementedUnaryCall(getEditGroupTopicMethod(), responseObserver);
    }

    /**
     */
    public void editGroupAbout(dialog.GroupsOuterClass.RequestEditGroupAbout request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnimplementedUnaryCall(getEditGroupAboutMethod(), responseObserver);
    }

    /**
     */
    public void inviteUser(dialog.GroupsOuterClass.RequestInviteUser request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid> responseObserver) {
      asyncUnimplementedUnaryCall(getInviteUserMethod(), responseObserver);
    }

    /**
     */
    public void leaveGroup(dialog.GroupsOuterClass.RequestLeaveGroup request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid> responseObserver) {
      asyncUnimplementedUnaryCall(getLeaveGroupMethod(), responseObserver);
    }

    /**
     */
    public void kickUser(dialog.GroupsOuterClass.RequestKickUser request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid> responseObserver) {
      asyncUnimplementedUnaryCall(getKickUserMethod(), responseObserver);
    }

    /**
     */
    public void makeUserAdmin(dialog.GroupsOuterClass.RequestMakeUserAdmin request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeUserAdminMethod(), responseObserver);
    }

    /**
     */
    public void getGroupMemberPermissions(dialog.GroupsOuterClass.RequestGetGroupMemberPermissions request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupMemberPermissionsMethod(), responseObserver);
    }

    /**
     */
    public void transferOwnership(dialog.GroupsOuterClass.RequestTransferOwnership request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferOwnershipMethod(), responseObserver);
    }

    /**
     */
    public void getGroupInviteUrl(dialog.GroupsOuterClass.RequestGetGroupInviteUrl request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseInviteUrl> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupInviteUrlMethod(), responseObserver);
    }

    /**
     */
    public void getGroupInviteUrlBase(dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupInviteUrlBaseMethod(), responseObserver);
    }

    /**
     */
    public void revokeInviteUrl(dialog.GroupsOuterClass.RequestRevokeInviteUrl request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseInviteUrl> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokeInviteUrlMethod(), responseObserver);
    }

    /**
     */
    public void joinGroup(dialog.GroupsOuterClass.RequestJoinGroup request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseJoinGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinGroupMethod(), responseObserver);
    }

    /**
     */
    public void joinGroupByPeer(dialog.GroupsOuterClass.RequestJoinGroupByPeer request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinGroupByPeerMethod(), responseObserver);
    }

    /**
     */
    public void makeUserAdminObsolete(dialog.GroupsOuterClass.RequestMakeUserAdminObsolete request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeUserAdminObsoleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoadFullGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestLoadFullGroups,
                dialog.GroupsOuterClass.ResponseLoadFullGroups>(
                  this, METHODID_LOAD_FULL_GROUPS)))
          .addMethod(
            getLoadMembersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestLoadMembers,
                dialog.GroupsOuterClass.ResponseLoadMembers>(
                  this, METHODID_LOAD_MEMBERS)))
          .addMethod(
            getCreateGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestCreateGroup,
                dialog.GroupsOuterClass.ResponseCreateGroup>(
                  this, METHODID_CREATE_GROUP)))
          .addMethod(
            getEditGroupTitleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestEditGroupTitle,
                dialog.Miscellaneous.ResponseSeqDateMid>(
                  this, METHODID_EDIT_GROUP_TITLE)))
          .addMethod(
            getSetGroupShortnameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestSetGroupShortname,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_SET_GROUP_SHORTNAME)))
          .addMethod(
            getEditGroupAvatarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestEditGroupAvatar,
                dialog.GroupsOuterClass.ResponseEditGroupAvatar>(
                  this, METHODID_EDIT_GROUP_AVATAR)))
          .addMethod(
            getRemoveGroupAvatarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestRemoveGroupAvatar,
                dialog.Miscellaneous.ResponseSeqDateMid>(
                  this, METHODID_REMOVE_GROUP_AVATAR)))
          .addMethod(
            getEditGroupTopicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestEditGroupTopic,
                dialog.Miscellaneous.ResponseSeqDate>(
                  this, METHODID_EDIT_GROUP_TOPIC)))
          .addMethod(
            getEditGroupAboutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestEditGroupAbout,
                dialog.Miscellaneous.ResponseSeqDate>(
                  this, METHODID_EDIT_GROUP_ABOUT)))
          .addMethod(
            getInviteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestInviteUser,
                dialog.Miscellaneous.ResponseSeqDateMid>(
                  this, METHODID_INVITE_USER)))
          .addMethod(
            getLeaveGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestLeaveGroup,
                dialog.Miscellaneous.ResponseSeqDateMid>(
                  this, METHODID_LEAVE_GROUP)))
          .addMethod(
            getKickUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestKickUser,
                dialog.Miscellaneous.ResponseSeqDateMid>(
                  this, METHODID_KICK_USER)))
          .addMethod(
            getMakeUserAdminMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestMakeUserAdmin,
                dialog.Miscellaneous.ResponseSeqDate>(
                  this, METHODID_MAKE_USER_ADMIN)))
          .addMethod(
            getGetGroupMemberPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestGetGroupMemberPermissions,
                dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions>(
                  this, METHODID_GET_GROUP_MEMBER_PERMISSIONS)))
          .addMethod(
            getTransferOwnershipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestTransferOwnership,
                dialog.Miscellaneous.ResponseSeqDate>(
                  this, METHODID_TRANSFER_OWNERSHIP)))
          .addMethod(
            getGetGroupInviteUrlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestGetGroupInviteUrl,
                dialog.GroupsOuterClass.ResponseInviteUrl>(
                  this, METHODID_GET_GROUP_INVITE_URL)))
          .addMethod(
            getGetGroupInviteUrlBaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase,
                dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase>(
                  this, METHODID_GET_GROUP_INVITE_URL_BASE)))
          .addMethod(
            getRevokeInviteUrlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestRevokeInviteUrl,
                dialog.GroupsOuterClass.ResponseInviteUrl>(
                  this, METHODID_REVOKE_INVITE_URL)))
          .addMethod(
            getJoinGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestJoinGroup,
                dialog.GroupsOuterClass.ResponseJoinGroup>(
                  this, METHODID_JOIN_GROUP)))
          .addMethod(
            getJoinGroupByPeerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestJoinGroupByPeer,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_JOIN_GROUP_BY_PEER)))
          .addMethod(
            getMakeUserAdminObsoleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.GroupsOuterClass.RequestMakeUserAdminObsolete,
                dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete>(
                  this, METHODID_MAKE_USER_ADMIN_OBSOLETE)))
          .build();
    }
  }

  /**
   */
  public static final class GroupsStub extends io.grpc.stub.AbstractStub<GroupsStub> {
    private GroupsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupsStub(channel, callOptions);
    }

    /**
     */
    public void loadFullGroups(dialog.GroupsOuterClass.RequestLoadFullGroups request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseLoadFullGroups> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadFullGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadMembers(dialog.GroupsOuterClass.RequestLoadMembers request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseLoadMembers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGroup(dialog.GroupsOuterClass.RequestCreateGroup request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseCreateGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editGroupTitle(dialog.GroupsOuterClass.RequestEditGroupTitle request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditGroupTitleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setGroupShortname(dialog.GroupsOuterClass.RequestSetGroupShortname request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetGroupShortnameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editGroupAvatar(dialog.GroupsOuterClass.RequestEditGroupAvatar request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseEditGroupAvatar> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditGroupAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeGroupAvatar(dialog.GroupsOuterClass.RequestRemoveGroupAvatar request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveGroupAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editGroupTopic(dialog.GroupsOuterClass.RequestEditGroupTopic request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditGroupTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editGroupAbout(dialog.GroupsOuterClass.RequestEditGroupAbout request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditGroupAboutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inviteUser(dialog.GroupsOuterClass.RequestInviteUser request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInviteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void leaveGroup(dialog.GroupsOuterClass.RequestLeaveGroup request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLeaveGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kickUser(dialog.GroupsOuterClass.RequestKickUser request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKickUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makeUserAdmin(dialog.GroupsOuterClass.RequestMakeUserAdmin request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakeUserAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGroupMemberPermissions(dialog.GroupsOuterClass.RequestGetGroupMemberPermissions request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupMemberPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferOwnership(dialog.GroupsOuterClass.RequestTransferOwnership request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferOwnershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGroupInviteUrl(dialog.GroupsOuterClass.RequestGetGroupInviteUrl request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseInviteUrl> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupInviteUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGroupInviteUrlBase(dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupInviteUrlBaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeInviteUrl(dialog.GroupsOuterClass.RequestRevokeInviteUrl request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseInviteUrl> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokeInviteUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinGroup(dialog.GroupsOuterClass.RequestJoinGroup request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseJoinGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinGroupByPeer(dialog.GroupsOuterClass.RequestJoinGroupByPeer request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinGroupByPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makeUserAdminObsolete(dialog.GroupsOuterClass.RequestMakeUserAdminObsolete request,
        io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakeUserAdminObsoleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupsBlockingStub extends io.grpc.stub.AbstractStub<GroupsBlockingStub> {
    private GroupsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupsBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.GroupsOuterClass.ResponseLoadFullGroups loadFullGroups(dialog.GroupsOuterClass.RequestLoadFullGroups request) {
      return blockingUnaryCall(
          getChannel(), getLoadFullGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.GroupsOuterClass.ResponseLoadMembers loadMembers(dialog.GroupsOuterClass.RequestLoadMembers request) {
      return blockingUnaryCall(
          getChannel(), getLoadMembersMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.GroupsOuterClass.ResponseCreateGroup createGroup(dialog.GroupsOuterClass.RequestCreateGroup request) {
      return blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDateMid editGroupTitle(dialog.GroupsOuterClass.RequestEditGroupTitle request) {
      return blockingUnaryCall(
          getChannel(), getEditGroupTitleMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq setGroupShortname(dialog.GroupsOuterClass.RequestSetGroupShortname request) {
      return blockingUnaryCall(
          getChannel(), getSetGroupShortnameMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.GroupsOuterClass.ResponseEditGroupAvatar editGroupAvatar(dialog.GroupsOuterClass.RequestEditGroupAvatar request) {
      return blockingUnaryCall(
          getChannel(), getEditGroupAvatarMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDateMid removeGroupAvatar(dialog.GroupsOuterClass.RequestRemoveGroupAvatar request) {
      return blockingUnaryCall(
          getChannel(), getRemoveGroupAvatarMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDate editGroupTopic(dialog.GroupsOuterClass.RequestEditGroupTopic request) {
      return blockingUnaryCall(
          getChannel(), getEditGroupTopicMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDate editGroupAbout(dialog.GroupsOuterClass.RequestEditGroupAbout request) {
      return blockingUnaryCall(
          getChannel(), getEditGroupAboutMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDateMid inviteUser(dialog.GroupsOuterClass.RequestInviteUser request) {
      return blockingUnaryCall(
          getChannel(), getInviteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDateMid leaveGroup(dialog.GroupsOuterClass.RequestLeaveGroup request) {
      return blockingUnaryCall(
          getChannel(), getLeaveGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDateMid kickUser(dialog.GroupsOuterClass.RequestKickUser request) {
      return blockingUnaryCall(
          getChannel(), getKickUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDate makeUserAdmin(dialog.GroupsOuterClass.RequestMakeUserAdmin request) {
      return blockingUnaryCall(
          getChannel(), getMakeUserAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions getGroupMemberPermissions(dialog.GroupsOuterClass.RequestGetGroupMemberPermissions request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupMemberPermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDate transferOwnership(dialog.GroupsOuterClass.RequestTransferOwnership request) {
      return blockingUnaryCall(
          getChannel(), getTransferOwnershipMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.GroupsOuterClass.ResponseInviteUrl getGroupInviteUrl(dialog.GroupsOuterClass.RequestGetGroupInviteUrl request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupInviteUrlMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase getGroupInviteUrlBase(dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupInviteUrlBaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.GroupsOuterClass.ResponseInviteUrl revokeInviteUrl(dialog.GroupsOuterClass.RequestRevokeInviteUrl request) {
      return blockingUnaryCall(
          getChannel(), getRevokeInviteUrlMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.GroupsOuterClass.ResponseJoinGroup joinGroup(dialog.GroupsOuterClass.RequestJoinGroup request) {
      return blockingUnaryCall(
          getChannel(), getJoinGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid joinGroupByPeer(dialog.GroupsOuterClass.RequestJoinGroupByPeer request) {
      return blockingUnaryCall(
          getChannel(), getJoinGroupByPeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete makeUserAdminObsolete(dialog.GroupsOuterClass.RequestMakeUserAdminObsolete request) {
      return blockingUnaryCall(
          getChannel(), getMakeUserAdminObsoleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupsFutureStub extends io.grpc.stub.AbstractStub<GroupsFutureStub> {
    private GroupsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.GroupsOuterClass.ResponseLoadFullGroups> loadFullGroups(
        dialog.GroupsOuterClass.RequestLoadFullGroups request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadFullGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.GroupsOuterClass.ResponseLoadMembers> loadMembers(
        dialog.GroupsOuterClass.RequestLoadMembers request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadMembersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.GroupsOuterClass.ResponseCreateGroup> createGroup(
        dialog.GroupsOuterClass.RequestCreateGroup request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDateMid> editGroupTitle(
        dialog.GroupsOuterClass.RequestEditGroupTitle request) {
      return futureUnaryCall(
          getChannel().newCall(getEditGroupTitleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> setGroupShortname(
        dialog.GroupsOuterClass.RequestSetGroupShortname request) {
      return futureUnaryCall(
          getChannel().newCall(getSetGroupShortnameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.GroupsOuterClass.ResponseEditGroupAvatar> editGroupAvatar(
        dialog.GroupsOuterClass.RequestEditGroupAvatar request) {
      return futureUnaryCall(
          getChannel().newCall(getEditGroupAvatarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDateMid> removeGroupAvatar(
        dialog.GroupsOuterClass.RequestRemoveGroupAvatar request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveGroupAvatarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDate> editGroupTopic(
        dialog.GroupsOuterClass.RequestEditGroupTopic request) {
      return futureUnaryCall(
          getChannel().newCall(getEditGroupTopicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDate> editGroupAbout(
        dialog.GroupsOuterClass.RequestEditGroupAbout request) {
      return futureUnaryCall(
          getChannel().newCall(getEditGroupAboutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDateMid> inviteUser(
        dialog.GroupsOuterClass.RequestInviteUser request) {
      return futureUnaryCall(
          getChannel().newCall(getInviteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDateMid> leaveGroup(
        dialog.GroupsOuterClass.RequestLeaveGroup request) {
      return futureUnaryCall(
          getChannel().newCall(getLeaveGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDateMid> kickUser(
        dialog.GroupsOuterClass.RequestKickUser request) {
      return futureUnaryCall(
          getChannel().newCall(getKickUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDate> makeUserAdmin(
        dialog.GroupsOuterClass.RequestMakeUserAdmin request) {
      return futureUnaryCall(
          getChannel().newCall(getMakeUserAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions> getGroupMemberPermissions(
        dialog.GroupsOuterClass.RequestGetGroupMemberPermissions request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupMemberPermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDate> transferOwnership(
        dialog.GroupsOuterClass.RequestTransferOwnership request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferOwnershipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.GroupsOuterClass.ResponseInviteUrl> getGroupInviteUrl(
        dialog.GroupsOuterClass.RequestGetGroupInviteUrl request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupInviteUrlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase> getGroupInviteUrlBase(
        dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupInviteUrlBaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.GroupsOuterClass.ResponseInviteUrl> revokeInviteUrl(
        dialog.GroupsOuterClass.RequestRevokeInviteUrl request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokeInviteUrlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.GroupsOuterClass.ResponseJoinGroup> joinGroup(
        dialog.GroupsOuterClass.RequestJoinGroup request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> joinGroupByPeer(
        dialog.GroupsOuterClass.RequestJoinGroupByPeer request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinGroupByPeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete> makeUserAdminObsolete(
        dialog.GroupsOuterClass.RequestMakeUserAdminObsolete request) {
      return futureUnaryCall(
          getChannel().newCall(getMakeUserAdminObsoleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOAD_FULL_GROUPS = 0;
  private static final int METHODID_LOAD_MEMBERS = 1;
  private static final int METHODID_CREATE_GROUP = 2;
  private static final int METHODID_EDIT_GROUP_TITLE = 3;
  private static final int METHODID_SET_GROUP_SHORTNAME = 4;
  private static final int METHODID_EDIT_GROUP_AVATAR = 5;
  private static final int METHODID_REMOVE_GROUP_AVATAR = 6;
  private static final int METHODID_EDIT_GROUP_TOPIC = 7;
  private static final int METHODID_EDIT_GROUP_ABOUT = 8;
  private static final int METHODID_INVITE_USER = 9;
  private static final int METHODID_LEAVE_GROUP = 10;
  private static final int METHODID_KICK_USER = 11;
  private static final int METHODID_MAKE_USER_ADMIN = 12;
  private static final int METHODID_GET_GROUP_MEMBER_PERMISSIONS = 13;
  private static final int METHODID_TRANSFER_OWNERSHIP = 14;
  private static final int METHODID_GET_GROUP_INVITE_URL = 15;
  private static final int METHODID_GET_GROUP_INVITE_URL_BASE = 16;
  private static final int METHODID_REVOKE_INVITE_URL = 17;
  private static final int METHODID_JOIN_GROUP = 18;
  private static final int METHODID_JOIN_GROUP_BY_PEER = 19;
  private static final int METHODID_MAKE_USER_ADMIN_OBSOLETE = 20;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOAD_FULL_GROUPS:
          serviceImpl.loadFullGroups((dialog.GroupsOuterClass.RequestLoadFullGroups) request,
              (io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseLoadFullGroups>) responseObserver);
          break;
        case METHODID_LOAD_MEMBERS:
          serviceImpl.loadMembers((dialog.GroupsOuterClass.RequestLoadMembers) request,
              (io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseLoadMembers>) responseObserver);
          break;
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((dialog.GroupsOuterClass.RequestCreateGroup) request,
              (io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseCreateGroup>) responseObserver);
          break;
        case METHODID_EDIT_GROUP_TITLE:
          serviceImpl.editGroupTitle((dialog.GroupsOuterClass.RequestEditGroupTitle) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid>) responseObserver);
          break;
        case METHODID_SET_GROUP_SHORTNAME:
          serviceImpl.setGroupShortname((dialog.GroupsOuterClass.RequestSetGroupShortname) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_EDIT_GROUP_AVATAR:
          serviceImpl.editGroupAvatar((dialog.GroupsOuterClass.RequestEditGroupAvatar) request,
              (io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseEditGroupAvatar>) responseObserver);
          break;
        case METHODID_REMOVE_GROUP_AVATAR:
          serviceImpl.removeGroupAvatar((dialog.GroupsOuterClass.RequestRemoveGroupAvatar) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid>) responseObserver);
          break;
        case METHODID_EDIT_GROUP_TOPIC:
          serviceImpl.editGroupTopic((dialog.GroupsOuterClass.RequestEditGroupTopic) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate>) responseObserver);
          break;
        case METHODID_EDIT_GROUP_ABOUT:
          serviceImpl.editGroupAbout((dialog.GroupsOuterClass.RequestEditGroupAbout) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate>) responseObserver);
          break;
        case METHODID_INVITE_USER:
          serviceImpl.inviteUser((dialog.GroupsOuterClass.RequestInviteUser) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid>) responseObserver);
          break;
        case METHODID_LEAVE_GROUP:
          serviceImpl.leaveGroup((dialog.GroupsOuterClass.RequestLeaveGroup) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid>) responseObserver);
          break;
        case METHODID_KICK_USER:
          serviceImpl.kickUser((dialog.GroupsOuterClass.RequestKickUser) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDateMid>) responseObserver);
          break;
        case METHODID_MAKE_USER_ADMIN:
          serviceImpl.makeUserAdmin((dialog.GroupsOuterClass.RequestMakeUserAdmin) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate>) responseObserver);
          break;
        case METHODID_GET_GROUP_MEMBER_PERMISSIONS:
          serviceImpl.getGroupMemberPermissions((dialog.GroupsOuterClass.RequestGetGroupMemberPermissions) request,
              (io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseGetGroupMemberPermissions>) responseObserver);
          break;
        case METHODID_TRANSFER_OWNERSHIP:
          serviceImpl.transferOwnership((dialog.GroupsOuterClass.RequestTransferOwnership) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate>) responseObserver);
          break;
        case METHODID_GET_GROUP_INVITE_URL:
          serviceImpl.getGroupInviteUrl((dialog.GroupsOuterClass.RequestGetGroupInviteUrl) request,
              (io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseInviteUrl>) responseObserver);
          break;
        case METHODID_GET_GROUP_INVITE_URL_BASE:
          serviceImpl.getGroupInviteUrlBase((dialog.GroupsOuterClass.RequestGetGroupInviteUrlBase) request,
              (io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseGetGroupInviteUrlBase>) responseObserver);
          break;
        case METHODID_REVOKE_INVITE_URL:
          serviceImpl.revokeInviteUrl((dialog.GroupsOuterClass.RequestRevokeInviteUrl) request,
              (io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseInviteUrl>) responseObserver);
          break;
        case METHODID_JOIN_GROUP:
          serviceImpl.joinGroup((dialog.GroupsOuterClass.RequestJoinGroup) request,
              (io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseJoinGroup>) responseObserver);
          break;
        case METHODID_JOIN_GROUP_BY_PEER:
          serviceImpl.joinGroupByPeer((dialog.GroupsOuterClass.RequestJoinGroupByPeer) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_MAKE_USER_ADMIN_OBSOLETE:
          serviceImpl.makeUserAdminObsolete((dialog.GroupsOuterClass.RequestMakeUserAdminObsolete) request,
              (io.grpc.stub.StreamObserver<dialog.GroupsOuterClass.ResponseMakeUserAdminObsolete>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GroupsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.GroupsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Groups");
    }
  }

  private static final class GroupsFileDescriptorSupplier
      extends GroupsBaseDescriptorSupplier {
    GroupsFileDescriptorSupplier() {}
  }

  private static final class GroupsMethodDescriptorSupplier
      extends GroupsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GroupsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupsFileDescriptorSupplier())
              .addMethod(getLoadFullGroupsMethod())
              .addMethod(getLoadMembersMethod())
              .addMethod(getCreateGroupMethod())
              .addMethod(getEditGroupTitleMethod())
              .addMethod(getSetGroupShortnameMethod())
              .addMethod(getEditGroupAvatarMethod())
              .addMethod(getRemoveGroupAvatarMethod())
              .addMethod(getEditGroupTopicMethod())
              .addMethod(getEditGroupAboutMethod())
              .addMethod(getInviteUserMethod())
              .addMethod(getLeaveGroupMethod())
              .addMethod(getKickUserMethod())
              .addMethod(getMakeUserAdminMethod())
              .addMethod(getGetGroupMemberPermissionsMethod())
              .addMethod(getTransferOwnershipMethod())
              .addMethod(getGetGroupInviteUrlMethod())
              .addMethod(getGetGroupInviteUrlBaseMethod())
              .addMethod(getRevokeInviteUrlMethod())
              .addMethod(getJoinGroupMethod())
              .addMethod(getJoinGroupByPeerMethod())
              .addMethod(getMakeUserAdminObsoleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
