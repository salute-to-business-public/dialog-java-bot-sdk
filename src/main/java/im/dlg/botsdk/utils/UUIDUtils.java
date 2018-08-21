package im.dlg.botsdk.utils;

import com.google.protobuf.ByteString;
import dialog.Definitions;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;

public class UUIDUtils {
    public static class BotSdkInvalidArgumentException extends RuntimeException {
        public BotSdkInvalidArgumentException(String message) {
            super(message);
        }
    }

    public static UUID convert(Definitions.UUIDValue value) {
        byte[] bytes = value.getValue().toByteArray();
        if (bytes.length == 16) {
            return new UUID(
                    longFromBytes(Arrays.copyOfRange(bytes, 0, 8)),
                    longFromBytes(Arrays.copyOfRange(bytes, 8, 16))
            );
        } else {
            throw new BotSdkInvalidArgumentException("Can't convert value to UUID");
        }
    }

    public static Definitions.UUIDValue convertToApi(UUID uuid) {
        return Definitions.UUIDValue.newBuilder().
                setValue(ByteString.copyFrom(longsToBytes(uuid.getMostSignificantBits(),
                        uuid.getLeastSignificantBits()))).build();
    }

    private static long longFromBytes(byte[] bytes) {
        long value = 0L;
        int i = 0;

        while (i < 8) {
            value = (value << 8) + (bytes[i] & 0xff);
            i++;
        }

        return value;
    }

    private static byte[] longsToBytes(long v1, long v2) {
        byte[] bytes = new byte[16];
        int i = 15;
        int j = 1;
        long v = v2;

        while (j > -1) {
            if (j == 0) v = v1;

            while (i >= j * 8) {
                bytes[i] = Long.valueOf(v & 0xFF).byteValue();
                v >>= 8;
                i--;
            }

            j--;
        }

        return bytes;
    }

    private static final long START_EPOCH = makeEpoch();

    private static long makeEpoch() {
        // UUID v1 timestamp must be in 100-nanoseconds interval since 00:00:00.000 15 Oct 1582.
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT-0"));
        c.set(Calendar.YEAR, 1582);
        c.set(Calendar.MONTH, Calendar.OCTOBER);
        c.set(Calendar.DAY_OF_MONTH, 15);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTimeInMillis();
    }

    public static long unixTimestamp(UUID uuid) {
        if (uuid.version() != 1)
            throw new IllegalArgumentException(String.format("Can only retrieve the unix timestamp for version 1 uuid (provided version %d)", uuid.version()));

        long timestamp = uuid.timestamp();
        return (timestamp / 10000) + START_EPOCH;
    }
}
