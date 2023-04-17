package im.dlg.botsdk.model.content;

import im.dlg.grpc.services.MessagingOuterClass;

public abstract class Content {
    public static Content fromMessage(MessagingOuterClass.MessageContent message) {
        MessagingOuterClass.MessageContent.BodyCase key = message.getBodyCase();
        switch (key) {
            case TEXTMESSAGE:
                return new TextContent(message.getTextMessage());
            case SERVICEMESSAGE:
                return new ServiceContent(message.getServiceMessage());
            case DOCUMENTMESSAGE:
                return new DocumentContent(message.getDocumentMessage());
            case JSONMESSAGE:
                return new JsonContent(message.getJsonMessage());
            case STICKERMESSAGE:
                return new StickerContent(message.getStickerMessage());
            case EMPTYMESSAGE:
                return new EmptyContent(message.getEmptyMessage());
            case DELETEDMESSAGE:
            case BINARYMESSAGE:
            case BODY_NOT_SET:
            case UNSUPPORTEDMESSAGE:
            default:
                return new im.dlg.botsdk.model.content.UnsupportedContent();
        }
    }
}
