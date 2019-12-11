package im.dlg.botsdk.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.util.Date;
import java.util.concurrent.*;
import java.util.function.Function;

public class RetriableTask<R> {
    private final Logger log = LoggerFactory.getLogger(RetriableTask.class);
    private static int MAX_RETRIES;
    private static int MIN_DELAY;
    private static int MAX_DELAY;
    private static double DELAY_FACTOR;
    private int retries = 0;
    private CompletableFuture<R> future = new CompletableFuture<R>();

    public RetriableTask(@Nullable RetryOptions retryOptions) {
        if (retryOptions == null) {
            MAX_RETRIES = 0;
            MIN_DELAY = 0;
            MAX_DELAY = 0;
            DELAY_FACTOR = 0;
        } else {
            MAX_RETRIES = retryOptions.getMaxRetries();
            MIN_DELAY = retryOptions.getMinDelay();
            MAX_DELAY = retryOptions.getMaxDelay();
            DELAY_FACTOR = retryOptions.getDelayFactor();
        }
    }


    public CompletableFuture<R> executeAsync(CompletableFuture<R> taskFuture) {
        taskFuture.applyToEitherAsync(new CompletableFuture<>(), Function.identity())
                .whenComplete((result, exception) -> {
                    if (exception == null) {
                        future.complete(result);
                    } else {
                        if (retries > MAX_RETRIES) {
                            future.completeExceptionally(exception);
                            log.error("Failed max retries request to server: ", exception);
                        } else {
                            try {
                                TimeUnit.SECONDS.sleep(Math.min(
                                        Math.round(MIN_DELAY * Math.pow(DELAY_FACTOR, retries)),
                                        MAX_DELAY)
                                );
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            retries++;
                            if (retries <= MAX_RETRIES) log.error("Failed request to server: ", exception);
                            executeAsync(taskFuture);
                        }
                    }
                });

        return future;
    }
}
