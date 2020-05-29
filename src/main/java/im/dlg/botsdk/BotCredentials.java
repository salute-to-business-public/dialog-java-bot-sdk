package im.dlg.botsdk;

public class BotCredentials {

    public enum Method {
        TOKEN, PASSWORD
    }

    private final Method method;
    private final String value;

    public BotCredentials(Method method, String value) {
        this.method = method;
        this.value = value;
    }

    public Method getMethod() {
        return method;
    }

    public String getValue() {
        return value;
    }

}
