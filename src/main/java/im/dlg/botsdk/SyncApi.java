package im.dlg.botsdk;

import java.util.concurrent.CompletableFuture;

public class SyncApi {
    private InternalBotApi privateBot;

    SyncApi(InternalBotApi privateBot) {
        this.privateBot = privateBot;
    }

    /**
     * Current application seq number
     *
     * @return seq
     */
    public int getCurrentSeq() {
        return privateBot.getSeq().get();
    }

    /**
     * Restore state and trigger events to all the callbacks
     *
     * @param seq
     * @return the future when all updates downloaded
     */
    public CompletableFuture<Integer> restoreFromSeq(int seq) {
        return privateBot.getDifference(seq);
    }
}
