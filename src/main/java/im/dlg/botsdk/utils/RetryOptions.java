package im.dlg.botsdk.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetryOptions {

    private final int maxRetries;
    private final int minDelay;
    private final int maxDelay;
    private final double delayFactor;

    private RetryOptions(int maxRetries, int minDelay, int maxDelay, double delayFactor) {
        this.maxRetries = maxRetries;
        this.minDelay = minDelay;
        this.maxDelay = maxDelay;
        this.delayFactor = delayFactor;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public int getMinDelay() {
        return minDelay;
    }

    public int getMaxDelay() {
        return maxDelay;
    }

    public double getDelayFactor() {
        return delayFactor;
    }

    public static final class Builder {
        int maxRetries = 5;
        int minDelay  = 1;
        int maxDelay = 50;
        double delayFactor = Math.exp(1);

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withMaxRetries(int maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }
        public Builder withMinDelay(int minDelay) {
            this.minDelay = minDelay;
            return this;
        }

        public Builder withMaxDelay(int maxDelay) {
            this.maxDelay = maxDelay;
            return this;
        }

        public Builder withDelayFactor(int delayFactor) {
            this.delayFactor = delayFactor;
            return this;
        }

        public RetryOptions build() {
            return new RetryOptions(maxRetries, minDelay, maxDelay, delayFactor);
        }

    }
}
