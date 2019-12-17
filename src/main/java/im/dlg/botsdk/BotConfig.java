package im.dlg.botsdk;

/**
 * Main configuration file
 */
public class BotConfig {
    final private String host;
    final private int port;
    final private boolean isSecure;

    final private String token;
    final private String certPath;
    final private String certPassword;
    final private String botName;
    final private int parallelism;

    private BotConfig(String host, int port, boolean isSecure, String token, String certPath, String certPassword, String botName, int parallelism) {
        this.host = host;
        this.port = port;
        this.isSecure = isSecure;
        this.token = token;
        this.certPath = certPath;
        this.certPassword = certPassword;
        this.botName = botName;
        this.parallelism = parallelism;
    }

    /**
     * @return Server host for connection without scheme, ex: server.amazon.com
     */
    public String getHost() {
        return host;
    }

    /**
     * @return Port for connection
     */
    public int getPort() {
        return port;
    }

    /**
     * @return Use TLS or not
     */
    public boolean isSecure() {
        return isSecure;
    }

    /**
     * @return Token for bot auth
     */
    public String getToken() {
        return token;
    }

    /**
     * @return Absolute location of client cert for Mutual auth in .p12 or pfx format
     */
    public String getCertPath() {
        return certPath;
    }

    /**
     * @return A password for certificate container
     */
    public String getCertPassword() {
        return certPassword;
    }

    /**
     * @return Used as application name
     */
    public String getBotName() {
        return botName;
    }

    /**
     *
     * @return Uses for parallism in DialogExecutor
     */
    public int getParallelism() {
        return parallelism;
    }

    public static final class Builder {
        String host;
        int port = 443;
        boolean isSecure = true;
        String token;
        String certPath;
        String certPassword;
        String botName = "JavaBot";
        int parallelism = 4;

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

        public Builder withParallelism(int parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        public BotConfig build() {
            return new BotConfig(host, port, isSecure, token, certPath, certPassword, botName, parallelism);
        }
    }
}
