package im.dlg.botsdk.model.thread;

import im.dlg.botsdk.model.Peer;
import im.dlg.botsdk.utils.UUIDUtils;
import im.dlg.grpc.services.ThreadsOuterClass;
import lombok.Getter;

import java.util.UUID;

public class ChatConversation {

    @Getter
    private final Peer threadPeer;

    @Getter
    private final Peer groupPeer;

    @Getter
    private final int messageCount;

    @Getter
    private final UUID rootMessageId;

    @Getter
    private final boolean subscribed;

    @Getter
    private final long lastMessageDate;

    @Getter
    private final long lastReadDate;

    public ChatConversation(ThreadsOuterClass.Thread thread){
        threadPeer = new Peer(thread.getThreadPeer());
        groupPeer = new Peer(thread.getGroupPeer());
        messageCount = thread.getMessagesCount();
        rootMessageId = UUIDUtils.convert(thread.getRootMessageId());
        subscribed = thread.getSubscribed();
        lastMessageDate = thread.getLastMessageDate();
        lastReadDate = thread.getLastReadDate();
    }


}
