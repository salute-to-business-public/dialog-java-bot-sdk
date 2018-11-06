package im.dlg.botsdk.domain.content;

import dialog.MessagingOuterClass;

public class JsonContent extends Content {
    private String rawJson;

    public JsonContent(MessagingOuterClass.JsonMessage message) {
        this.rawJson = message.getRawJson();
    }

    public String getRawJson() {
        return rawJson;
    }
}
