package im.dlg.botsdk;

import dialog.MessagingOuterClass;

import java.util.function.Function;

public class MessageUtils {
    static <R> void ifTextMessage(MessagingOuterClass.MessageContent content, Function<String, R> f) {
        if (content.getBodyCase() == MessagingOuterClass.MessageContent.BodyCase.TEXTMESSAGE) {
            f.apply(content.getTextMessage().getText());
        }
    }
}
