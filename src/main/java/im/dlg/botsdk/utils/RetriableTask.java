package im.dlg.botsdk.utils;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.util.concurrent.*;
import java.util.function.Function;

public class RetriableTask<R> {
    private final Logger log = LoggerFactory.getLogger(RetriableTask.class);
    private static int MAX_RETRIES;
    private static int MIN_DELAY;
    private static int MAX_DELAY;
    private static double DELAY_FACTOR;
    private static final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(
                    1,
                    new ThreadFactoryBuilder()
                            .setDaemon(true)
                            .setNameFormat("failAfter-%d")
                            .build());
    private CompletableFuture<R> future = new CompletableFuture<R>();

    public RetriableTask(@Nullable RetryOptions retryOptions) {
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

    public CompletableFuture<R> executeAsync(CompletableFuture<R> taskFuture, final int retries) {
        long duration = 0;
        if (retries > 0) {
            duration = Math.min(Math.round(MIN_DELAY * Math.pow(DELAY_FACTOR, retries - 1)), MAX_DELAY);
        }
        scheduler.schedule(() -> {
            taskFuture.applyToEither(new CompletableFuture<>(), Function.identity())
                    .thenAccept(response -> future.complete(response))
                    .exceptionally(error -> {
                        if (retries > MAX_RETRIES) {
                            future.completeExceptionally(error);
                            log.error("Failed max retries request to server: ", error);
                        } else {
                            if (retries < MAX_RETRIES) log.error("Failed request to server: ", error);
                            executeAsync(taskFuture, retries + 1);
                        }
                        return null;
                    });
        }, duration, TimeUnit.SECONDS);

        return future;
    }
}
