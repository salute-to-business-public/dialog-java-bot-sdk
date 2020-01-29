package im.dlg.botsdk;

/**
 * Main configuration file
 */
public class BotConfig {

    private final String botName;
    private final String token;

    private BotConfig(String botName, String token) {
        this.botName = botName;
        this.token = token;
    }

    /**
     * @return Token for bot auth
     */
    public String getToken() {
        return token;
    }

    /**
     * @return Used as application name
     */
    public String getBotName() {
        return botName;
    }

    public static final class Builder {

        private String botName = "JavaBot";
        private String token;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withBotName(String botName) {
            this.botName = botName;
            return this;
        }

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }

        public BotConfig build() {
            return new BotConfig(botName, token);
        }

    }
}
