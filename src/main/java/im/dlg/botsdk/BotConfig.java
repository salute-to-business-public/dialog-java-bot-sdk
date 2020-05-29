package im.dlg.botsdk;

import im.dlg.botsdk.retry.RetryOptions;

import static im.dlg.botsdk.retry.RetryOptions.*;

/**
 * Main configuration file
 */
public class BotConfig {

    private final String name;
    private final BotCredentials credentials;
    private final RetryOptions retryOptions;

    private BotConfig(String name, BotCredentials credentials, RetryOptions retryOptions) {
        this.name = name;
        this.credentials = credentials;
        this.retryOptions = retryOptions;
    }

    public String getName() {
        return name;
    }

    public BotCredentials getCredentials() {
        return credentials;
    }

    public RetryOptions getRetryOptions() {
        return retryOptions;
    }

    public static final class Builder {

        private String botName = "JavaBot";
        private BotCredentials credentials;
        private RetryOptions retryOptions = DEFAULT_RETRY_OPTIONS;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withName(String botName) {
            this.botName = botName;
            return this;
        }

        public Builder withCredentials(BotCredentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = retryOptions;
            return this;
        }

        public BotConfig build() {
            return new BotConfig(botName, credentials, retryOptions);
        }

    }
}
