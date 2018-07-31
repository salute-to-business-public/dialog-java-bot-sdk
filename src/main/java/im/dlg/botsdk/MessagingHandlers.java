package im.dlg.botsdk;

import dialog.MessagingGrpc;
import dialog.MessagingOuterClass;
import dialog.MessagingOuterClass.*;
import dialog.Peers;
import im.dlg.botsdk.domain.Message;
import io.grpc.ManagedChannel;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

//TODO: remove
public class MessagingHandlers {
    private ActiveBot bot;
    private ManagedChannel channel;
    private Executor executor;

    public MessagingHandlers(ActiveBot bot, ManagedChannel channel, Executor executor) {
        this.bot = bot;
        this.channel = channel;
        this.executor = executor;
    }

    public CompletableFuture<UUID> send(Peers.OutPeer outPeer, String text) {
        MessageContent msg = MessageContent.newBuilder()
                .setTextMessage(TextMessage.newBuilder().setText(text).build())
                .build();

        return bot.withToken(
                MessagingGrpc.newFutureStub(channel),
                stub -> stub.sendMessage(RequestSendMessage.newBuilder().setPeer(outPeer).setMessage(msg).build())
        ).thenApplyAsync(resp -> UUIDUtils.convert(resp.getMid()), executor);
    }

    public CompletableFuture<List<Message>> load(Peers.OutPeer peer, long from, Integer limit) {
        return bot.withToken(
                MessagingGrpc.newFutureStub(channel),
                stub -> stub.loadHistory(MessagingOuterClass.RequestLoadHistory.newBuilder()
                        .setDate(from)
                        .setLimit(limit)
                        .setLoadMode(ListLoadMode.LISTLOADMODE_FORWARD)
                        .addAllOptimizations(RequestsDefaults.optimizations)
                        .setPeer(peer)
                        .build()
                )
        ).thenApplyAsync(res -> {
            res.getGroupPeersList().forEach(bot::putOutPeer);
            res.getUserPeersList().forEach(bot::putOutPeer);

            List<HistoryMessage> historyList = res.getHistoryList();
            List<Message> messages = new ArrayList<>();
            for (HistoryMessage hm : historyList) {
                bot.putOutPeer(hm.getSenderPeer());
                messages.add(new Message(
                        peer,
                        hm.getSenderPeer(),
                        UUIDUtils.convert(hm.getMid()),
                        hm.getMessage().getTextMessage().getText()
                ));
            }

            return messages;
        }, executor);
    }

    CompletableFuture<Void> read(Peers.OutPeer peer, long date) {
        return bot.withToken(
                MessagingGrpc.newFutureStub(channel),
                stub -> stub.messageRead(RequestMessageRead.newBuilder()
                        .setPeer(peer)
                        .setDate(date)
                        .build()
                )
        ).thenAcceptAsync(resp -> {}, executor);
    }

//    CompletableFuture<Void> receive(Peers.OutPeer peer, UUID messageId) {
//        Long date = UUIDUtils.unixTimestamp(messageId);
//
//        return sdk.withToken(
//                MessagingGrpc.newFutureStub(sdk.channel),
//                stub -> stub.messageReceived(RequestMessageReceived.newBuilder().setPeer(peer).setDate(date).build())
//        ).thenAcceptAsync(resp -> {
//            return;
//        });
//    }

    CompletableFuture<List<Dialog>> loadDialogs(Set<Peers.Peer> peers) {
        RequestLoadDialogs request = RequestLoadDialogs.newBuilder()
                .setLimit(1)
                .addAllPeersToLoad(peers)
                .addAllOptimizations(RequestsDefaults.optimizations)
                .build();

        return bot.withToken(
          MessagingGrpc.newFutureStub(channel),
          stub -> stub.loadDialogs(request)
        ).thenApplyAsync(res -> {
            res.getGroupPeersList().forEach(bot::putOutPeer);
            res.getUserPeersList().forEach(bot::putOutPeer);

            return res.getDialogsList();
        }, executor);
    }
}
