package im.dlg.botsdk.light;

import com.google.protobuf.ByteString;

@FunctionalInterface
public interface UpdateListener {
    void onUpdate(ByteString update);
}
