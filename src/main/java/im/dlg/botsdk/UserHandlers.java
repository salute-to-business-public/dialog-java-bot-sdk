package im.dlg.botsdk;

import com.google.common.collect.Sets;
import dialog.*;
import im.dlg.botsdk.domain.User;
import io.grpc.ManagedChannel;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class UserHandlers {
    private ActiveBot bot;
    private ManagedChannel channel;
    private Executor executor;

    public UserHandlers(ActiveBot bot, ManagedChannel channel, Executor executor) {
        this.bot = bot;
        this.channel = channel;
        this.executor = executor;
    }

    public CompletableFuture<Optional<User>> load(Peers.OutPeer outPeer) {
        return load(Sets.newHashSet(outPeer)).thenApplyAsync(users ->
                users.stream().filter(u -> u.getOutPeer().getId() == outPeer.getId()).findFirst()
        );
    }

    public CompletableFuture<List<User>> load(Set<Peers.OutPeer> outPeers) {
        Set<Peers.UserOutPeer> userOutPeers = new HashSet<>();
        Map<Integer, Peers.OutPeer> peerMap = new HashMap<>();

        for (Peers.OutPeer outPeer : outPeers) {
            userOutPeers.add(PeerUtils.toUserOutPeer(outPeer));
            peerMap.put(outPeer.getId(), outPeer);
        }

        return bot.withToken(
                SequenceAndUpdatesGrpc.newFutureStub(channel),
                stub -> stub.getReferencedEntitites(
                        SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites.newBuilder()
                            .addAllUsers(userOutPeers)
                            .build()
                )
        ).thenComposeAsync(res -> {
            Map<Integer, UsersOuterClass.User> users = new HashMap<>();
            res.getUsersList().stream().forEach(u -> users.put(u.getId(), u));

            return bot.withToken(
                    UsersGrpc.newFutureStub(channel),
                    stub -> stub.loadFullUsers(UsersOuterClass.RequestLoadFullUsers.newBuilder()
                            .addAllUserPeers(userOutPeers)
                            .build()
                    )
            ).thenApplyAsync(r -> r.getFullUsersList().stream().map(fu -> {
                UsersOuterClass.User u = users.get(fu.getId());
                return new User(peerMap.get(fu.getId()), u.getName(), u.getNick().getValue(),
                        User.Sex.fromServerModel(u.getSex()), fu.getAbout().getValue(),
                        fu.getPreferredLanguages(0), fu.getTimeZone().getValue()
                );
            }).collect(Collectors.toList()), executor);
        }, executor);
    }
}
