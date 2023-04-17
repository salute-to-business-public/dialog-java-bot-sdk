package im.dlg.botsdk.model.content;

import im.dlg.grpc.services.Miscellaneous;
import lombok.Getter;

import java.util.List;
import java.util.stream.IntStream;

import static im.dlg.grpc.services.MessagingOuterClass.*;

public class TextContent extends Content {

    @Getter
    private final String text;
    @Getter
    private final TextMessageEx textMessageEx;
    @Getter
    private final List<Mention> mentions;
    @Getter
    private final List<MessageMedia> medias;
    @Getter
    private final List<Miscellaneous.Any> extensions;

    TextContent(TextMessage content) {
        this.text = content.getText();
        this.textMessageEx = content.getExt();
        this.mentions = content.getMentionsList();
        this.medias = content.getMediaList();
        this.extensions = content.getExtensionsList();
    }

    public TextMessage toServer() {
        TextContent content = this;
        TextMessage.Builder textMessage = TextMessage
                .newBuilder();
        List<MessageMedia> medias = content.medias;
        if (medias != null) {
            IntStream.range(0, medias.size())
                    .forEach(index ->
                            textMessage.setMedia(index, medias.get(index)));
        }

        List<Miscellaneous.Any> extensions = content.extensions;
        if (extensions != null) {
            IntStream.range(0, extensions.size())
                    .forEach(index ->
                            textMessage.setExtensions(index, extensions.get(index)));
        }
        textMessage.setExt(content.textMessageEx);
        return textMessage.build();
    }
}
