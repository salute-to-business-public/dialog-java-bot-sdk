package im.dlg.botsdk.model.interactive;

import com.google.protobuf.StringValue;
import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

/**
 * Button element
 */
public class InteractiveButton implements InteractiveWidget {
    @Getter
    private final String value;
    @Getter
    private final String label;

    public InteractiveButton(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public MessagingOuterClass.InteractiveMediaWidget toServer() {
        InteractiveButton button = this;
        MessagingOuterClass.InteractiveMediaButton.Builder btn = MessagingOuterClass.InteractiveMediaButton.newBuilder()
                .setValue(button.getValue());

        if (button.getLabel() != null && !button.getLabel().isEmpty()) {
            btn.setLabel(StringValue.of(button.getLabel()));
        }

        return MessagingOuterClass.InteractiveMediaWidget.newBuilder().setInteractiveMediaButton(btn).build();
    }
}
