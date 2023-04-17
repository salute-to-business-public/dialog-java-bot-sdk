package im.dlg.botsdk.model.interactive;

import com.google.protobuf.StringValue;
import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

import java.util.List;

public class InteractiveGroup {
    @Getter
    private final String title;
    @Getter
    private final String description;
    @Getter
    private final List<InteractiveAction> actions;

    public InteractiveGroup(String title, String description, List<InteractiveAction> actions) {
        this.title = title;
        this.description = description;
        this.actions = actions;
    }

    public InteractiveGroup(List<InteractiveAction> actions) {
        this(null, null, actions);
    }

    public MessagingOuterClass.InteractiveMediaGroup toServer() {
        InteractiveGroup group = this;
        MessagingOuterClass.InteractiveMediaGroup.Builder apiMediaGroup = MessagingOuterClass.InteractiveMediaGroup.newBuilder();

        if (group.getTitle() != null && !group.getTitle().isEmpty()) {
            apiMediaGroup.setTitle(StringValue.of(group.getTitle()));
        }

        if (group.getDescription() != null && !group.getDescription().isEmpty()) {
            apiMediaGroup.setDescription(StringValue.of(group.getDescription()));
        }

        for (InteractiveAction action : group.getActions()) {
            MessagingOuterClass.InteractiveMedia.Builder apiMedia = MessagingOuterClass.InteractiveMedia.newBuilder()
                    .setId(action.getId())
                    .setStyle(action.getStyle().toServer());

            InteractiveWidget widget = action.getWidget();
            apiMedia.setWidget(widget.toServer());
            if (action.getConfirm() != null) {
                apiMedia.setConfirm(action.getConfirm().toServer());
            }

            apiMediaGroup.addActions(apiMedia);
        }
        return apiMediaGroup.build();
    }
}
