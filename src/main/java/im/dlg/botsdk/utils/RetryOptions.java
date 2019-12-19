package im.dlg.botsdk.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetryOptions {
    private final Logger log = LoggerFactory.getLogger(RetriableTask.class);
    private int maxRetries = 5;
    private int minDelay = 1;
    private int maxDelay = 50;
    private double delayFactor = Math.exp(1);

    private RetryOptions(int maxRetries, int minDelay, int maxDelay, double delayFactor) {
        this.maxRetries = maxRetries;
        this.minDelay = minDelay;
        this.maxDelay = maxDelay;
        this.delayFactor = delayFactor;
    }

    public int getMaxRetries() {return this.maxRetries;}

    public int getMinDelay() {return this.minDelay;}

    public int getMaxDelay() {return this.maxDelay;}

    public double getDelayFactor() {return this.delayFactor;}

    public static final class Builder {
        int maxRetries = 5;
        int minDelay  = 1;
        int maxDelay = 50;
        double delayFactor = Math.exp(1);

        public Builder() {
        }

        public static Builder aRetryOptions() {
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
