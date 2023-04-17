package im.dlg.botsdk.model.thread;

import im.dlg.botsdk.model.Message;
import im.dlg.grpc.services.ThreadsOuterClass;
import lombok.Getter;

public class SubscribedThread {

    @Getter
    private final ChatConversation thread;

    @Getter
    private final long date;

    @Getter
    private final Message rootHistoryMessage;

    @Getter
    private final int unreadCount;


    public SubscribedThread(ThreadsOuterClass.SubscribedThread subscribedThread) {
        thread = new ChatConversation(subscribedThread.getThread());
        date = subscribedThread.getDate();
        rootHistoryMessage = new Message(subscribedThread.getRootHistoryMessage());
        unreadCount = subscribedThread.getUnreadCount();

    }
}
