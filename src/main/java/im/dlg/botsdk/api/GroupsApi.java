package im.dlg.botsdk.api;

import com.google.protobuf.StringValue;
import im.dlg.botsdk.model.Peer;
import im.dlg.botsdk.model.media.FileLocation;
import im.dlg.grpc.services.*;
import io.grpc.ManagedChannel;
import im.dlg.botsdk.internal.InternalBot;
import im.dlg.botsdk.model.Group;
import im.dlg.botsdk.model.GroupPermission;
import im.dlg.botsdk.model.GroupMember;
import im.dlg.botsdk.model.User;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.File;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static im.dlg.grpc.services.GroupsOuterClass.*;
import static im.dlg.grpc.services.Peers.GroupOutPeer;
import static im.dlg.grpc.services.SearchOuterClass.*;

/**
 * Groups api handler
 */
public class GroupsApi {

    private final ManagedChannel channel;
    private final InternalBot internalBot;
    private final MediaAndFilesApi mediaAndFilesApi;

    /**
     * Constructor
     *
     * @param channel          Managed channel
     * @param internalBot      Internal bot
     * @param mediaAndFilesApi
     */
    public GroupsApi(ManagedChannel channel, InternalBot internalBot, MediaAndFilesApi mediaAndFilesApi) {
        this.channel = channel;
        this.internalBot = internalBot;
        this.mediaAndFilesApi = mediaAndFilesApi;
    }

    private CompletableFuture<Group> createGroup(String title, @Nullable String shortName, GroupType groupType) {
        //Build request model
        RequestCreateGroup.Builder requestBuilder = RequestCreateGroup.newBuilder();

        requestBuilder.setGroupType(groupType)
                .setTitle(title);
        if (shortName != null) {
            requestBuilder.setUsername(StringValue.of(shortName));
        } else {
            requestBuilder.setRid(new Random().nextInt());
        }

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel), stub -> stub.createGroup(requestBuilder.build()
        )).thenApply(g -> new Group(g.getGroup()));
    }

    private CompletableFuture<Group> findExistedGroup(int id) {
        GroupOutPeer groupOutPeer = GroupOutPeer.newBuilder()
                .setGroupId(id)
                .setAccessHash(new Random().nextLong())
                .build();

        SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites request = SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites.newBuilder()
                .addGroups(groupOutPeer)
                .build();

        return internalBot.withToken(SequenceAndUpdatesGrpc.newFutureStub(channel),
                        stub -> stub.getReferencedEntitites(request))
                .thenApply(result -> new Group(result.getGroups(0)));
    }

    /**
     * Create public group
     *
     * @param title     Group title
     * @param shortName Group short link
     * @param users     Users peer
     * @return Created group
     * @see #createPublicGroup(String, String)
     */
    @Deprecated
    public CompletableFuture<Group> createPublicGroup(String title, String shortName, @Nonnull List<Peer> users) {
        return createGroup(title, shortName, GroupType.GROUPTYPE_GROUP);
    }

    /**
     * Create public group
     *
     * @param title     Group title
     * @param shortName Group short link
     * @return Created group
     */
    public CompletableFuture<Group> createPublicGroup(String title, String shortName) {
        return createPublicGroup(title, shortName, new ArrayList<>());
    }

    /**
     * Create private group
     *
     * @param title Group title
     * @return Created group
     */
    public CompletableFuture<Group> createPrivateGroup(String title) {
        return createGroup(title, null, GroupType.GROUPTYPE_GROUP);
    }

    /**
     * Create public channel
     *
     * @param title     Group title
     * @param shortName Group short link
     * @return Created channel
     */
    public CompletableFuture<Group> createPublicChannel(String title, String shortName) {
        return createGroup(title, shortName, GroupType.GROUPTYPE_CHANNEL);
    }


    /**
     * Create private channel
     *
     * @param title Group title
     * @return Created channel
     */
    public CompletableFuture<Group> createPrivateChannel(String title) {
        return createGroup(title, null, GroupType.GROUPTYPE_CHANNEL);
    }


    /**
     * Join to group
     *
     * @param group Group
     * @return CompletableFuture
     */
    public CompletableFuture<Void> joinGroupByPeer(Group group) {
        return joinGroupByPeer(group.getPeer());
    }

    /**
     * Join to group
     *
     * @param peer Group
     */
    public CompletableFuture<Void> joinGroupByPeer(Peer peer) {
        GroupOutPeer groupOutPeer = peer.toServerGroupOutPeer();

        RequestJoinGroupByPeer request = RequestJoinGroupByPeer.newBuilder()
                .setPeer(groupOutPeer)
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.joinGroupByPeer(request))
                .thenApply(t -> null);
    }

    /**
     * Find group by group id
     *
     * @param id Group id
     * @return Optional of group
     */
    public CompletableFuture<Optional<Group>> findGroupById(int id) {

        GroupOutPeer groupOutPeer = GroupOutPeer.newBuilder()
                .setGroupId(id)
                .setAccessHash(new Random().nextLong())
                .build();

        SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites request = SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites.newBuilder()
                .addGroups(groupOutPeer)
                .build();

        return internalBot.withToken(SequenceAndUpdatesGrpc.newFutureStub(channel),
                        stub -> stub.getReferencedEntitites(request))
                .thenApply(result -> {
                    if (result.getGroupsList().isEmpty()) return Optional.empty();
                    return Optional.of(new Group(result.getGroups(0)));
                });
    }

    /**
     * Find group by shortname
     *
     * @param shortname Group shortname
     * @return Optional of group
     */
    public CompletableFuture<Optional<Group>> findGroupByShortname(String shortname) {
        return searchGroupByShortname(shortname).thenApply(result -> {
            List<Group> filteredGroups = result.stream().filter(g -> g.getShortname().equals(shortname)).collect(Collectors.toList());
            if (result.isEmpty()) return Optional.empty();
            return Optional.of(filteredGroups.get(0));

        });
    }

    /**
     * Create public group
     *
     * @param title    Group title
     * @param username Group shortname
     * @return Group entity
     * @deprecated <p>Use {@link #createPublicGroup(String, String)} instead</p>
     */
    @Deprecated
    public CompletableFuture<Group> createGroup(String title, String username) {
        return createGroup(title, username, Collections.emptyList());
    }

    /**
     * Create public group with users
     *
     * @param title    Group title
     * @param username Group shortname
     * @param users    Users entity
     * @return Group entity
     * @deprecated <p>Use {@link #createPublicGroup(String, String, List)} instead</p>
     */
    @Deprecated
    public CompletableFuture<Group> createGroup(String title, String username, List<User> users) {
        RequestCreateGroup.Builder request = RequestCreateGroup.newBuilder();

        for (User user : users) {
            request.addUsers(user.getPeer().toServerUserOutPeer());
        }

        request.setGroupType(GroupType.GROUPTYPE_GROUP)
                .setTitle(title)
                .setUsername(StringValue.of(username))
                .setRid(LocalDateTime.now().getSecond());

        return internalBot.withToken(
                GroupsGrpc.newFutureStub(channel),
                stub -> stub.createGroup(request.build())
        ).thenApply(g -> new Group(g.getGroup()));
    }

    /**
     * Search public group by shortname
     *
     * @param query Group shortname
     * @return List with founded group
     * @deprecated <p>Use {@link #findGroupByShortname(String)} instead</p>
     */
    @Deprecated
    public CompletableFuture<List<Group>> searchGroupByShortname(String query) {
        RequestPeerSearch request = RequestPeerSearch.newBuilder()
                .addQuery(SearchCondition.newBuilder()
                        .setSearchPeerTypeCondition(SearchPeerTypeCondition.newBuilder()
                                .setPeerType(SearchPeerType.SEARCHPEERTYPE_GROUPS)
                                .build()))
                .addQuery(SearchCondition.newBuilder()
                        .setSearchPieceText(SearchPieceText.newBuilder()
                                .setQuery(query)
                                .build()))
                .build();

        return internalBot.withToken(
                        SearchGrpc.newFutureStub(channel),
                        stub -> stub.peerSearch(request))
                .thenCompose(searchResults -> internalBot.getRefEntities(null, new HashSet<>(searchResults.getGroupPeersList())))
                .thenApply(res -> res.getGroupsList().stream().map(g -> new Group(g)).collect(Collectors.toList()));
    }

    /**
     * Get group invite URL
     *
     * @param peer Group peer
     * @return Group invite URL
     */
    public CompletableFuture<String> getGroupInviteUrl(Peer peer) {
        RequestGetGroupInviteUrl request = RequestGetGroupInviteUrl.newBuilder()
                .setGroupPeer(peer.toServerGroupOutPeer())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                stub -> stub.getGroupInviteUrl(request)).thenApply(t -> t.getUrl());
    }

    /**
     * Get base invite URL
     *
     * @return Base group invite URL
     */
    public CompletableFuture<String> getGroupInviteUrlBase() {
        RequestGetGroupInviteUrlBase request = RequestGetGroupInviteUrlBase.newBuilder()
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                stub -> stub.getGroupInviteUrlBase(request)).thenApply(t -> t.getUrl());
    }

    /**
     * Revoke invite URL and generate new invite group URL
     *
     * @param peer Group peer
     * @return New invite group URL
     */
    public CompletableFuture<String> revokeInviteUrl(Peer peer) {
        RequestRevokeInviteUrl request = RequestRevokeInviteUrl.newBuilder()
                .setGroupPeer(peer.toServerGroupOutPeer())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                stub -> stub.revokeInviteUrl(request)).thenApply(t -> t.getUrl());
    }

    /**
     * Invite user into group
     *
     * @param groupPeer Group peer
     * @param userPeer  User peer
     * @return future
     */
    public CompletableFuture<Void> inviteUser(Peer groupPeer, Peer userPeer) {
        RequestInviteUser request = RequestInviteUser.newBuilder()
                .setUser(userPeer.toServerUserOutPeer())
                .setGroupPeer(groupPeer.toServerGroupOutPeer())
                .setRid(new Random().nextLong())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.inviteUser(request))
                .thenApply(t -> null);
    }

    /**
     * Kick user from group
     *
     * @param groupPeer Group peer
     * @param userPeer  User peer
     * @return future
     */
    public CompletableFuture<Void> kickUser(Peer groupPeer, Peer userPeer) {
        RequestKickUser request = RequestKickUser.newBuilder()
                .setGroupPeer(groupPeer.toServerGroupOutPeer())
                .setUser(userPeer.toServerUserOutPeer())
                .setRid(new Random().nextLong())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.kickUser(request))
                .thenApply(t -> null);
    }

    /**
     * Edit group title
     *
     * @param peer  Group peer
     * @param title New group title
     * @return future
     */
    public CompletableFuture<Void> editGroupTitle(Peer peer, String title) {
        RequestEditGroupTitle request = RequestEditGroupTitle.newBuilder()
                .setGroupPeer(peer.toServerGroupOutPeer())
                .setTitle(title)
                .setRid(new Random().nextLong())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.editGroupTitle(request))
                .thenApply(t -> null);
    }

    /**
     * Edit group about
     *
     * @param peer  Group peer
     * @param about New group about
     * @return future
     */
    public CompletableFuture<Void> editGroupAbout(Peer peer, String about) {
        RequestEditGroupAbout request = RequestEditGroupAbout.newBuilder()
                .setGroupPeer(peer.toServerGroupOutPeer())
                .setAbout(StringValue.of(about))
                .setRid(new Random().nextLong())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.editGroupAbout(request))
                .thenApply(t -> null);
    }

    public CompletableFuture<Void> editGroupAvatar(Peer peer, FileLocation fileLocation) {

        RequestEditGroupAvatar request = RequestEditGroupAvatar.newBuilder()
                .setGroupPeer(peer.toServerGroupOutPeer())
                .setFileLocation(fileLocation.toServer())
                .setRid(new Random().nextLong())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.editGroupAvatar(request))
                .thenApply(t -> null);
    }

    public CompletableFuture<Void> editGroupAvatar(Peer peer, File file) {
        return mediaAndFilesApi.uploadFile(file).thenCompose(location -> editGroupAvatar(peer, location));
    }

    /**
     * Remove avatar from group
     *
     * @param peer Group peer
     * @return future
     */
    public CompletableFuture<Void> removeGroupAvatar(Peer peer) {
        RequestRemoveGroupAvatar request = RequestRemoveGroupAvatar.newBuilder()
                .setGroupPeer(peer.toServerGroupOutPeer())
                .setRid(new Random().nextLong())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.removeGroupAvatar(request))
                .thenApply(t -> null);
    }

    /**
     * Leave from group
     *
     * @param peer Group peer
     * @return future
     */
    public CompletableFuture<Void> leaveGroup(Peer peer) {
        RequestLeaveGroup request = RequestLeaveGroup.newBuilder()
                .setGroupPeer(peer.toServerGroupOutPeer())
                .setRid(new Random().nextLong())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.leaveGroup(request))
                .thenApply(t -> null);
    }

    /**
     * Make user admin
     *
     * @param groupPeer Group peer
     * @param userPeer  User peer
     * @return future
     */
    public CompletableFuture<Void> makeUserAdmin(Peer groupPeer, Peer userPeer) {

        RequestMakeUserAdmin request = RequestMakeUserAdmin.newBuilder()
                .setGroupPeer(groupPeer.toServerGroupOutPeer())
                .setUserPeer(userPeer.toServerUserOutPeer())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.makeUserAdmin(request))
                .thenApply(t -> null);
    }

    /**
     * Transfer ownership to user. Must be called before leave from owned group
     *
     * @param groupPeer Group peer
     * @param userPeer  User peer
     * @return future
     */
    public CompletableFuture<Void> transferOwnership(Peer groupPeer, Peer userPeer) {
        RequestTransferOwnership request = RequestTransferOwnership.newBuilder()
                .setGroupPeer(groupPeer.toServerGroupOutPeer())
                .setNewOwner(userPeer.getId())
                .build();
        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.transferOwnership(request))
                .thenApply(t -> null);
    }

    /**
     * Join into group by tokenURL
     *
     * @param tokenUrl Invite token
     * @return Group entity
     * @see #joinGroup(Peer)
     */
    public CompletableFuture<Group> joinGroup(String tokenUrl) {
        RequestJoinGroup request = RequestJoinGroup.newBuilder()
                .setToken(tokenUrl)
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.joinGroup(request))
                .thenApply(t -> new Group(t.getGroup()));
    }

    /**
     * Join group by peer
     *
     * @param peer Group peer
     * @return Group entity
     * @see #joinGroup(String)
     */
    public CompletableFuture<Group> joinGroup(Peer peer) {
        RequestJoinGroupByPeer request = RequestJoinGroupByPeer.newBuilder()
                .setPeer(peer.toServerGroupOutPeer())
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.joinGroupByPeer(request))
                .thenCompose(t -> findExistedGroup(peer.getId()));
    }


    public CompletableFuture<List<GroupMember>> loadMembers(Peer peer) {
        RequestLoadMembers request = RequestLoadMembers.newBuilder()
                .setGroup(peer.toServerGroupOutPeer())
                .setLimit(Integer.MAX_VALUE)
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.loadMembers(request))
                .thenApply(t -> t.getMembersList()
                        .stream().map(g -> new GroupMember(g))
                        .collect(Collectors.toList()));
    }


    /**
     * Set default group permissions
     *
     * @param peer               Group peer
     * @param grantedPermissions Granted permissions
     * @param revokedPermissions Revoked permissions
     * @return future
     */
    public CompletableFuture<Void> setDefaultGroupPermissions(Peer peer, List<GroupPermission> grantedPermissions, List<GroupPermission> revokedPermissions) {
        RequestEditGroupBasePermissions.Builder requestBuilder = RequestEditGroupBasePermissions.newBuilder()
                .setGroupPeer(peer.toServerGroupOutPeer());
        for (GroupPermission permission : grantedPermissions) {
            requestBuilder.addGrantedPermissions(GroupPermission.toServer(permission));
        }
        for (GroupPermission permission : revokedPermissions) {
            requestBuilder.addRevokedPermissions(GroupPermission.toServer(permission));
        }

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.editGroupBasePermissions(requestBuilder.build()))
                .thenApply(t -> null);
    }

    public CompletableFuture<Void> setHideSystemMessages(Peer peer, boolean hide) {
        RequestSetHideSystemMessages request = RequestSetHideSystemMessages.newBuilder()
                .setGroupPeer(peer.toServerGroupOutPeer())
                .setHide(hide)
                .build();
        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                stub -> stub.setHideSystemMessages(request))
                .thenApply(t -> null);
    }

    /**
     * Get group member permissions by ids
     *
     * @param groupId Group id
     * @param userIds User ids
     * @return future with list of group member permissions
     * @see #getGroupMemberPermissions(Peer, List)
     */
    public CompletableFuture<List<GroupMember>> getGroupMemberPermissions(int groupId, List<Integer> userIds) {
        RequestGetGroupMemberPermissions request = RequestGetGroupMemberPermissions.newBuilder()
                .setGroupId(groupId)
                .addAllUserIds(userIds)
                .build();
        GroupMemberPermission permission = GroupMemberPermission.newBuilder().build();
        List<GroupPermission> result = permission.getPermissionsList().stream().map(GroupPermission::fromServer).collect(Collectors.toList());
        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.getGroupMemberPermissions(request))
                .thenApply(t -> t.getPermissionsList().stream().map(GroupMember::new).collect(Collectors.toList()));
    }

    /**
     * Get group member permissions by peers
     *
     * @param groupPeer Group peer
     * @param userPeers User peers
     * @return future with list of group member permissions
     * @see #getGroupMemberPermissions(int, List)
     */
    public CompletableFuture<List<GroupMember>> getGroupMemberPermissions(Peer groupPeer, List<Peer> userPeers) {
        return getGroupMemberPermissions(groupPeer.getId(), userPeers.stream().map(p -> p.getId()).collect(Collectors.toList()));
    }

    /**
     * Set member permissions
     *
     * @param groupPeer          Group peer
     * @param userPeer           User peer
     * @param grantedPermissions Granted permissions
     * @param revokedPermissions Revoked permissions
     * @return future
     */
    public CompletableFuture<Void> setMemberPermissions(Peer groupPeer, Peer userPeer, List<GroupPermission> grantedPermissions, List<GroupPermission> revokedPermissions) {
        RequestEditMemberPermissions request = RequestEditMemberPermissions.newBuilder()
                .setUserPeer(userPeer.toServerUserOutPeer())
                .setGroupPeer(groupPeer.toServerGroupOutPeer())
                .addAllGrantedPermissions(grantedPermissions.stream().map(p -> GroupPermission.toServer(p)).collect(Collectors.toList()))
                .addAllRevokedPermissions(revokedPermissions.stream().map(p -> GroupPermission.toServer(p)).collect(Collectors.toList()))
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.editMemberPermissions(request))
                .thenApply(t -> null);
    }

    public CompletableFuture<Void> removeGroup(Integer groupId) {
        RequestDeleteGroup request = RequestDeleteGroup.newBuilder()
                .setGroupId(groupId)
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.deleteGroup(request))
                .thenApply(t -> null);
    }

    public CompletableFuture<Void> setThreadsEnabled(Peer groupPeer, boolean enabled) {
        RequestSetThreadsEnabled request = RequestSetThreadsEnabled.newBuilder()
                .setGroupPeer(groupPeer.toServerGroupOutPeer())
                .setThreadsEnabled(enabled)
                .build();

        return internalBot.withToken(GroupsGrpc.newFutureStub(channel),
                        stub -> stub.setThreadsEnabled(request))
                .thenApply(t -> null);

    }

}