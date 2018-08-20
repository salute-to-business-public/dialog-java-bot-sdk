package im.dlg.botsdk;

import com.google.protobuf.StringValue;
import dialog.MessagingGrpc;
import dialog.MessagingOuterClass;
import dialog.MessagingOuterClass.*;
import dialog.Peers;
import im.dlg.botsdk.domain.InteractiveEvent;
import im.dlg.botsdk.domain.Peer;
import im.dlg.botsdk.domain.interactive.*;
import im.dlg.botsdk.light.InteractiveEventListener;
import im.dlg.botsdk.utils.MsgUtils;
import im.dlg.botsdk.utils.PeerUtils;
import im.dlg.botsdk.utils.UUIDUtils;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class InteractiveApi {

    private InternalBotApi privateBot;
    private InteractiveEventListener listener = null;

    public InteractiveApi(InternalBotApi privateBot) {

        this.privateBot = privateBot;

        privateBot.subscribeOn(UpdateInteractiveMediaEvent.class, evt -> {
            try {
                privateBot.findUserOutPeer(evt.getUid()).thenAccept(opt -> opt.ifPresent(outPeer -> {
                    onEventInternal(new InteractiveEvent(UUIDUtils.convert(evt.getMid()), evt.getId(),
                            evt.getValue(), PeerUtils.toDomainPeer(outPeer)));
                }));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }

    public void onEvent(InteractiveEventListener listener) {
        this.listener = listener;
    }

    private void onEventInternal(InteractiveEvent event) {
        if (listener != null) {
            listener.onEvent(event);
            return;
        }

        System.out.println("Got an event");
    }

    public CompletableFuture<UUID> send(Peer peer, InteractiveGroup group) {
        Peers.OutPeer outPeer = PeerUtils.toServerOutPeer(peer);

        InteractiveMediaGroup.Builder apiMediaGroup =
                InteractiveMediaGroup.newBuilder();

        if (group.getTitle() != null && !group.getTitle().isEmpty()) {
            apiMediaGroup.setTitle(StringValue.of(group.getTitle()));
        }

        if (group.getDescription() != null && !group.getDescription().isEmpty()) {
            apiMediaGroup.setDescription(StringValue.of(group.getDescription()));
        }

        for (InteractiveAction action : group.getActions()) {

            InteractiveMedia.Builder apiMedia = InteractiveMedia.newBuilder()
                    .setId(action.getId())
                    .setStyle(buildStyle(action.getStyle()));

            InteractiveWidget widget = action.getWidget();

            if (widget instanceof InteractiveButton) {
                apiMedia.setWidget(buildButton((InteractiveButton) widget));
            } else if (widget instanceof InteractiveSelect) {
                apiMedia.setWidget(buildSelectMenu((InteractiveSelect) widget));
            }

            if (action.getConfirm() != null) {
                apiMedia.setConfirm(buildConfirm(action));
            }

            apiMediaGroup.addActions(apiMedia);
        }

        MessageMedia messageMedia = MessageMedia.newBuilder().addActions(apiMediaGroup).build();

        MessageContent msg = MessageContent.newBuilder()
                .setTextMessage(TextMessage.newBuilder()
                        .addMedia(messageMedia)).build();

        return privateBot.withToken(
                MessagingGrpc.newFutureStub(privateBot.channel.getChannel()),
                stub -> stub.sendMessage(RequestSendMessage.newBuilder().setRid(MsgUtils.uniqueCurrentTimeMS())

                        .setPeer(outPeer).setMessage(msg).build())
        ).thenApplyAsync(resp -> UUIDUtils.convert(resp.getMid()), privateBot.executor.getExecutor());
    }

    private InteractiveMediaWidget buildButton(InteractiveButton button) {
        InteractiveMediaButton.Builder btn =
                InteractiveMediaButton.newBuilder().setValue(button.getValue());

        if (button.getLabel() != null && !button.getLabel().isEmpty()) {
            btn.setLabel(StringValue.of(button.getLabel()));
        }

        return InteractiveMediaWidget.newBuilder().setInteractiveMediaButton(btn).build();
    }

    private InteractiveMediaWidget buildSelectMenu(InteractiveSelect select) {
        InteractiveMediaSelect.Builder apiSelect = InteractiveMediaSelect.newBuilder();

        for (InteractiveSelectOption selectOption : select.getOptions()) {
            InteractiveMediaSelectOption.Builder apiSelectOption = InteractiveMediaSelectOption.newBuilder();
            apiSelectOption.setValue(selectOption.getValue()).setLabel(selectOption.getLabel());
            apiSelect.addOptions(apiSelectOption);
        }

        if (select.getLabel() != null && !select.getLabel().isEmpty()) {
            apiSelect.setLabel(StringValue.of(select.getLabel()));
        }

        if (select.getDefaultValue() != null && !select.getDefaultValue().isEmpty()) {
            apiSelect.setDefaultValue(StringValue.of(select.getDefaultValue()));
        }

        return InteractiveMediaWidget.newBuilder().setInteractiveMediaSelect(apiSelect).build();
    }

    private InteractiveMediaConfirm.Builder buildConfirm(InteractiveAction action) {
        InteractiveMediaConfirm.Builder confirm = InteractiveMediaConfirm.newBuilder();

        if (action.getConfirm().getText() != null) {
            confirm.setText(StringValue.of(action.getConfirm().getText()));
        }

        if (action.getConfirm().getTitle() != null) {
            confirm.setTitle(StringValue.of(action.getConfirm().getTitle()));
        }

        if (action.getConfirm().getOk() != null) {
            confirm.setOk(StringValue.of(action.getConfirm().getOk()));
        }

        if (action.getConfirm().getDismiss() != null) {
            confirm.setDismiss(StringValue.of(action.getConfirm().getDismiss()));
        }
        return confirm;
    }

    private InteractiveMediaStyle buildStyle(InteractiveAction.Style style) {
        if (style == InteractiveAction.Style.DANGER) {
            return InteractiveMediaStyle.INTERACTIVEMEDIASTYLE_DANGER;
        } else if (style == InteractiveAction.Style.PRIMARY) {
            return InteractiveMediaStyle.INTERACTIVEMEDIASTYLE_PRIMARY;
        } else {
            return InteractiveMediaStyle.INTERACTIVEMEDIASTYLE_DEFAULT;
        }
    }
}
