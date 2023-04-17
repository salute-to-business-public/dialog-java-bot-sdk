package im.dlg.botsdk.api;

import com.google.protobuf.Timestamp;
import im.dlg.botsdk.listeners.MessageReadListener;
import im.dlg.botsdk.listeners.online.UserOnlineStatusListener;
import im.dlg.botsdk.listeners.typing.UserTypingStatusListener;
import im.dlg.botsdk.model.MessageRead;
import im.dlg.grpc.services.*;
import im.dlg.grpc.services.PresenceOuterClass.*;
import im.dlg.grpc.services.SequenceAndUpdatesOuterClass.WeakUpdateCommand;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;
import im.dlg.botsdk.internal.InternalBot;
import im.dlg.botsdk.model.DeviceType;
import im.dlg.botsdk.model.Peer;
import im.dlg.botsdk.model.TypingType;
import im.dlg.botsdk.status.StatusStream;
import im.dlg.botsdk.status.StatusStreamListenerRegistry;
import im.dlg.botsdk.status.StatusStreamObserver;
import lombok.Setter;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import static im.dlg.grpc.services.PresenceOuterClass.RequestStopTyping;

public class StatusApi {

    private final ManagedChannel channel;
    private final InternalBot internalBot;
    private StatusStream statusStream;
    private UserOnlineStatusListener userOnlineStatusListener = null;
    private UserTypingStatusListener userTypingStatusListener = null;
    private MessageReadListener messageReadListener = null;


    public StatusApi(ManagedChannel channel, InternalBot internalBot) {
        this.channel = channel;
        this.internalBot = internalBot;
         internalBot.subscribeOn(MessagingOuterClass.UpdateMessageRead.class, messageRead -> {
             if (messageReadListener != null)
                 messageReadListener.onMessageRead(new MessageRead(messageRead));
         });
    }

    /**
     * Setter on message read listener
     * @param messageReadListener listener
     */
    public void onMessageRead(MessageReadListener messageReadListener){
        this.messageReadListener = messageReadListener;
    }

    /**
     * Set user online
     * @param status Online status
     * @param deviceType Device type enum
     * @param timeout    Timeout
     * @return future
     */
    public CompletableFuture<Void> setOnlineStatus(boolean status, DeviceType deviceType, Duration timeout) {
        RequestSetOnline request = RequestSetOnline.newBuilder()
                .setIsOnline(status)
                .setDeviceType(deviceType.toGrpcType())
                .setTimeout(timeout.toMillis())
                .build();

        return internalBot.withToken(
                PresenceGrpc.newFutureStub(channel),
                stub -> stub.setOnline(request)).thenApply(t -> null);
    }

    /**
     * Set user typing
     *
     * @param peer       User peer
     * @param typingType Typing type enum
     * @return future
     */
    public CompletableFuture<Void> startTyping(Peer peer, TypingType typingType) {
        RequestStartTyping request = RequestStartTyping.newBuilder()
                .setTypingType(typingType.toServerType())
                .setPeer(peer.toServerOutPeer())
                .build();

        return internalBot.withToken(PresenceGrpc.newFutureStub(channel),
                stub -> stub.startTyping(request)).thenApply(t -> null);
    }

    /**
     * Stop typing
     *
     * @param peer Peer
     * @return future
     */
    public CompletableFuture<Void> stopTyping(Peer peer, TypingType typingType) {
        RequestStopTyping request = RequestStopTyping.newBuilder()
                .setPeer(peer.toServerOutPeer())
                .setTypingType(typingType.toServerType())
                .build();

        return internalBot.withToken(PresenceGrpc.newFutureStub(channel),
                stub -> stub.stopTyping(request)).thenApply(t -> null);
    }

    public CompletableFuture<Timestamp> getUserLastPresence(Peer peer){
        RequestGetUserLastPresence request = RequestGetUserLastPresence.newBuilder()
                .setUserOutPeer(peer.toServerUserOutPeer())
                .build();

        return internalBot.withToken(PresenceGrpc.newFutureStub(channel),
                stub -> stub.getUserLastPresence(request)).thenApply(t -> t.getLastOnlineAt());
    }

    public void onUserOnline(UserOnlineStatusListener listener){
        userOnlineStatusListener = listener;
    }

    public void setUserTypingStatusListener(UserTypingStatusListener listener){
        userTypingStatusListener = listener;
    }

    public StatusStream openStream() {
        if (statusStream != null) {
            return statusStream;
        }

        StatusStreamListenerRegistry listenerRegistry = new StatusStreamListenerRegistry();
        StatusStreamObserver statusStreamObserver = new StatusStreamObserver(internalBot, listenerRegistry);

        StreamObserver<WeakUpdateCommand> outgoingCommandsObserver =
                internalBot.withObserverToken(SequenceAndUpdatesGrpc.newStub(channel),
                        stub -> stub.weakUpdates(statusStreamObserver));

        return statusStream = new StatusStream(listenerRegistry, outgoingCommandsObserver);
    }

}
