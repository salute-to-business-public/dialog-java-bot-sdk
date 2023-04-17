package im.dlg.botsdk.model.interactive;

import lombok.Getter;

/**
 * Option item for selection menu
 */
public class InteractiveSelectOption {
    @Getter
    private final String value;
    @Getter
    private final String label;

    public InteractiveSelectOption(String value, String label) {
        this.value = value;
        this.label = label;
    }
}
