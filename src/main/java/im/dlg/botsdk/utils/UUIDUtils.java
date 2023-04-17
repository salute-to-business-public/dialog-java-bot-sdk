package im.dlg.botsdk.utils;

import im.dlg.grpc.services.Definitions;

import java.util.UUID;

public class UUIDUtils {

    public static UUID convert(Definitions.UUIDValue value) {
        return new UUID(value.getMsb(), value.getLsb());
    }

    public static Definitions.UUIDValue convertToApi(UUID uuid) {
        return Definitions.UUIDValue.newBuilder()
                .setMsb(uuid.getMostSignificantBits())
                .setLsb(uuid.getLeastSignificantBits()).build();
    }

}
