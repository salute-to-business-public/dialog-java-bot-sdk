package im.dlg.botsdk.utils;

import im.dlg.grpc.services.MessagingOuterClass;
import im.dlg.botsdk.model.Message;

import java.util.concurrent.atomic.AtomicLong;

public class MsgUtils {
    private static final AtomicLong LAST_TIME_MS = new AtomicLong();

    public static long uniqueCurrentTimeMS() {
        long now = System.currentTimeMillis();
        while (true) {
            long lastTime = LAST_TIME_MS.get();
            if (lastTime >= now)
                now = lastTime + 1;
            if (LAST_TIME_MS.compareAndSet(lastTime, now))
                return now;
        }
    }

    /**
     * Convert server history message to message
     *
     * @param hm Server history message
     * @return Message
     * @deprecated Use constructor {@link Message#Message(MessagingOuterClass.HistoryMessage)} instead
     */
    @Deprecated
    public static Message toMessage(MessagingOuterClass.HistoryMessage hm) {
        return new Message(hm);
    }
}
