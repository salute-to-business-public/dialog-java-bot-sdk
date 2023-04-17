package im.dlg.botsdk.model.interactive;

import com.google.protobuf.StringValue;
import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

public class InteractiveConfirm {

    @Getter
    private final String text;
    @Getter
    private final String title;
    @Getter
    private final String ok;
    @Getter
    private final String dismiss;

    public InteractiveConfirm(String text, String title, String ok, String dismiss) {
        this.text = text;
        this.title = title;
        this.ok = ok;
        this.dismiss = dismiss;
    }

    public MessagingOuterClass.InteractiveMediaConfirm toServer() {
        MessagingOuterClass.InteractiveMediaConfirm.Builder confirm = MessagingOuterClass.InteractiveMediaConfirm.newBuilder();

        if (text != null) {
            confirm.setText(StringValue.of(text));
        }

        if (title != null) {
            confirm.setTitle(StringValue.of(title));
        }

        if (ok != null) {
            confirm.setOk(StringValue.of(ok));
        }

        if (dismiss != null) {
            confirm.setDismiss(StringValue.of(dismiss));
        }
        return confirm.build();
    }
}
