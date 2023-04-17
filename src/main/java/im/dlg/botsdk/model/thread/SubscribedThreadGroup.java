package im.dlg.botsdk.model.thread;

import im.dlg.botsdk.model.Peer;
import im.dlg.grpc.services.ThreadsOuterClass;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

public class SubscribedThreadGroup {
    @Getter
    private final Peer groupPeer;
    @Getter
    private final int threadCount;
    @Getter
    private final List<SubscribedThread> threads;


    public SubscribedThreadGroup(ThreadsOuterClass.SubscribedThreadGroup group){
        groupPeer = new Peer(group.getGroupPeer());
        threadCount = group.getThreads3Count();
        threads = group.getThreads3List().stream().map(SubscribedThread::new).collect(Collectors.toList());
    }



}
