package im.dlg.botsdk.model.interactive;

import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

public class InteractiveAction {

    public enum Style {
        PRIMARY,
        DANGER,
        DEFAULT;

        public MessagingOuterClass.InteractiveMediaStyle toServer() {
            if (this == InteractiveAction.Style.DANGER) {
                return MessagingOuterClass.InteractiveMediaStyle.INTERACTIVEMEDIASTYLE_DANGER;
            } else if (this == InteractiveAction.Style.PRIMARY) {
                return MessagingOuterClass.InteractiveMediaStyle.INTERACTIVEMEDIASTYLE_PRIMARY;
            } else {
                return MessagingOuterClass.InteractiveMediaStyle.INTERACTIVEMEDIASTYLE_DEFAULT;
            }
        }
    }

    @Getter
    private final String id;
    @Getter
    private final Style style;
    @Getter
    private final InteractiveWidget widget;
    @Getter
    private final InteractiveConfirm confirm;

    public InteractiveAction(String id, Style style, InteractiveWidget widget, InteractiveConfirm confirm) {
        this.id = id;
        this.style = style;
        this.widget = widget;
        this.confirm = confirm;
    }

    public InteractiveAction(String id, InteractiveWidget widget, InteractiveConfirm confirm) {
        this(id, Style.PRIMARY, widget, confirm);
    }

    public InteractiveAction(String id, InteractiveWidget widget) {
        this(id, Style.PRIMARY, widget, null);
    }
}
