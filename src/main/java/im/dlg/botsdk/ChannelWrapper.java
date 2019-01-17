package im.dlg.botsdk;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.SslContext;

import javax.net.ssl.KeyManagerFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.Security;
import java.util.concurrent.TimeUnit;

public class ChannelWrapper {

    private ManagedChannel channel;
    private BotConfig botConfig;

    public ChannelWrapper(BotConfig botConfig) {
        this.botConfig = botConfig;
    }

    public synchronized void connect() {
        try {
            Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

            if (channel != null) {
                channel.shutdownNow();
            }

            NettyChannelBuilder nettyChannelBuilder = (NettyChannelBuilder) ManagedChannelBuilder
                    .forAddress(botConfig.getHost(), botConfig.getPort());

            if (botConfig.getCertPath() != null && botConfig.getCertPassword() != null) {

                SslContext sslContext =
                        GrpcSslContexts.forClient()
                                .keyManager(createKeyFactory(new File(botConfig.getCertPath()), botConfig.getCertPassword()))
                                .build();

                nettyChannelBuilder = nettyChannelBuilder.sslContext(sslContext)
                        .idleTimeout(10, TimeUnit.SECONDS);
            }

            if (!botConfig.isSecure()) {
                nettyChannelBuilder.usePlaintext();
            }

            this.channel = nettyChannelBuilder.build();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public synchronized ManagedChannel getChannel() {
        return channel;
    }

    private KeyManagerFactory createKeyFactory(File pKeyFile, String pKeyPassword) throws Exception {

        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
        KeyStore keyStore = KeyStore.getInstance("PKCS12");

        InputStream keyInput = new FileInputStream(pKeyFile);
        keyStore.load(keyInput, pKeyPassword.toCharArray());
        keyInput.close();

        keyManagerFactory.init(keyStore, pKeyPassword.toCharArray());

        return keyManagerFactory;
    }
}
