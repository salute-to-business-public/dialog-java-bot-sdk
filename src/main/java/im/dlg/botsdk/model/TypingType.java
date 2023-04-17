package im.dlg.botsdk.model;

import im.dlg.grpc.services.PresenceOuterClass;

public enum TypingType {
    UNKNOWN,
    TEXT,
    VOICE;

    public static TypingType fromGrpcType(PresenceOuterClass.TypingType typingType) {
        switch (typingType) {
            case TYPINGTYPE_TEXT:
                return TEXT;
            case TYPINGTYPE_VOICE:
                return VOICE;
            case UNRECOGNIZED:
            case TYPINGTYPE_UNKNOWN:
            default:
                return null;
        }
    }

    public PresenceOuterClass.TypingType toServerType() {
        switch (this) {
            case TEXT:
                return PresenceOuterClass.TypingType.TYPINGTYPE_TEXT;
            case VOICE:
                return PresenceOuterClass.TypingType.TYPINGTYPE_VOICE;
            default:
                return PresenceOuterClass.TypingType.TYPINGTYPE_UNKNOWN;
        }
    }
}
