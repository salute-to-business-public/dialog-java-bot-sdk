package im.dlg.botsdk;

import im.dlg.botsdk.utils.NetUtils;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.SslContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.security.Security;
import java.util.concurrent.TimeUnit;

public class ChannelWrapper {

    private final Logger log = LoggerFactory.getLogger(ChannelWrapper.class);

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
                    .forAddress(botConfig.getHost(), botConfig.getPort())
                    .idleTimeout(15, TimeUnit.SECONDS)
                    .keepAliveTime(30, TimeUnit.SECONDS);

            if (botConfig.getCertPath() != null && botConfig.getCertPassword() != null) {

                SslContext sslContext =
                        GrpcSslContexts.forClient()
                                .keyManager(NetUtils.createKeyFactory(new File(botConfig.getCertPath()),
                                        botConfig.getCertPassword()))
                                .build();

                nettyChannelBuilder = nettyChannelBuilder.sslContext(sslContext);
            }

            if (!botConfig.isSecure()) {
                nettyChannelBuilder.usePlaintext();
            }

            this.channel = nettyChannelBuilder.build();

        } catch (Exception ex) {
            log.error("failed to connect", ex);
        }
    }

    public synchronized ManagedChannel getChannel() {
        return channel;
    }
}
