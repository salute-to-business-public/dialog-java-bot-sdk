package im.dlg.botsdk.model;

import lombok.Getter;

public class ServerFile {
    @Getter
    private final String fileName;
    @Getter
    private byte[] bytes;

    public ServerFile(String fileName) {
        this.fileName = fileName;
    }

    public ServerFile(String fileName, byte[] bytes) {
        this.fileName = fileName;
        this.bytes = bytes;
    }
}
