package im.dlg.botsdk.utils;

import javax.annotation.Nullable;
import java.util.concurrent.*;

public class RetriableTask<R> {
    private CompletableFuture<R> taskFuture;
    private static int MAX_RETRIES;
    private static int MIN_DELAY;
    private static int MAX_DELAY;
    private static double DELAY_FACTOR;

    public RetriableTask(CompletableFuture<R> taskFuture, @Nullable RetryOptions retryOptions) {
        this.taskFuture = taskFuture;
        if (retryOptions == null) {
            MAX_RETRIES = 3;
            MIN_DELAY = 1;
            MAX_DELAY = 50;
            DELAY_FACTOR = Math.exp(1);
        } else {
            MAX_RETRIES = retryOptions.getMaxRetries();
            MIN_DELAY = retryOptions.getMinDelay();
            MAX_DELAY = retryOptions.getMaxDelay();
            DELAY_FACTOR = retryOptions.getDelayFactor();
        }
    }

    public int getMaxRetries() { return MAX_RETRIES; }

    public int getMinDelay() { return MIN_DELAY; }

    public int getMaxDelay() { return MAX_DELAY; }

    public double getDelayFactor() { return DELAY_FACTOR; }

    public CompletableFuture<R> getTaskFuture() { return taskFuture; }
}
