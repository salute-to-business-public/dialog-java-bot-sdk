package im.dlg.botsdk.model.content;

import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

public class ServiceContent extends Content {

    @Getter
    private final String text;
    @Getter
    private final MessagingOuterClass.ServiceEx serviceEx;

    public ServiceContent(MessagingOuterClass.ServiceMessage message) {
        this.text = message.getText();
        this.serviceEx = message.getExt();
    }

    public MessagingOuterClass.ServiceMessage toServer(){
        return MessagingOuterClass.ServiceMessage.newBuilder()
                .setText(text)
                .setExt(serviceEx)
                .build();
    }
}
