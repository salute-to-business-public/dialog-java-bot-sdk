package im.dlg.botsdk.model.interactive;

import com.google.protobuf.StringValue;
import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

public class InteractiveMediaLink implements InteractiveWidget {
    @Getter
    private final String url;
    @Getter
    private final String label;

    public InteractiveMediaLink(String url, String label) {
        this.url = url;
        this.label = label;
    }

    public MessagingOuterClass.InteractiveMediaWidget toServer() {
        InteractiveMediaLink link = this;
        return MessagingOuterClass.InteractiveMediaWidget.newBuilder().setInteractiveMediaLink(MessagingOuterClass.InteractiveMediaLink.newBuilder()
                .setUrl(link.getUrl())
                .setLabel(StringValue.of(link.getLabel()))
                .build()).build();
    }
}
