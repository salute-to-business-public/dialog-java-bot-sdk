package im.dlg.botsdk;

public class BotConfig {
    final private String host;
    final private int port;
    final private boolean isSecure;

    final private String token;
    final private String certPath;
    final private String certPassword;
    final private String botName;

    private BotConfig(String host, int port, boolean isSecure, String token, String certPath, String certPassword, String botName) {
        this.host = host;
        this.port = port;
        this.isSecure = isSecure;
        this.token = token;
        this.certPath = certPath;
        this.certPassword = certPassword;
        this.botName = botName;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public boolean isSecure() {
        return isSecure;
    }

    public String getToken() {
        return token;
    }

    public String getCertPath() {
        return certPath;
    }

    public String getCertPassword() {
        return certPassword;
    }

    public String getBotName() {
        return botName;
    }

    public static final class Builder {
        String host;
        int port;
        boolean isSecure = true;
        String token;
        String certPath;
        String certPassword;
        String botName = "JavaBot";

        public Builder() {
        }

        public static Builder aBotConfig() {
            return new Builder();
        }

        public Builder withHost(String host) {
            this.host = host;
            return this;
        }

        public Builder withPort(int port) {
            this.port = port;
            return this;
        }

        public Builder withIsSecure(boolean isSecure) {
            this.isSecure = isSecure;
            return this;
        }

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }

        public Builder withCertPath(String certPath) {
            this.certPath = certPath;
            return this;
        }

        public Builder withCertPassword(String certPassword) {
            this.certPassword = certPassword;
            return this;
        }

        public Builder withBotName(String botName) {
            this.botName = botName;
            return this;
        }

        public BotConfig build() {
            return new BotConfig(host, port, isSecure, token, certPath, certPassword, botName);
        }
    }
}
