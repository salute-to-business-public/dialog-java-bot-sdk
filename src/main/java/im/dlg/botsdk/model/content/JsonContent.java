package im.dlg.botsdk.model.content;

import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

public class JsonContent extends Content {
    @Getter
    private final String rawJson;

    public JsonContent(MessagingOuterClass.JsonMessage message) {
        this.rawJson = message.getRawJson();
    }

    public MessagingOuterClass.JsonMessage toServer(){
        return MessagingOuterClass.JsonMessage.newBuilder()
                .setRawJson(rawJson)
                .build();
    }
}
