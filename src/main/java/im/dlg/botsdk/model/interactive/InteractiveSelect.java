package im.dlg.botsdk.model.interactive;

import com.google.protobuf.StringValue;
import im.dlg.grpc.services.MessagingOuterClass;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Selection dropdown
 */
public class InteractiveSelect implements InteractiveWidget {

    @Getter
    private String label;
    @Getter
    private String defaultValue;
    @Getter
    private List<InteractiveSelectOption> options;

    public InteractiveSelect(String label, String defaultValue, List<InteractiveSelectOption> options) {
        this.label = label;
        this.defaultValue = defaultValue;
        this.options = options;
    }

    public InteractiveSelect(List<InteractiveSelectOption> options) {
        this.options = options;
    }

    public MessagingOuterClass.InteractiveMediaWidget toServer() {
        InteractiveSelect select = this;
        MessagingOuterClass.InteractiveMediaSelect.Builder apiSelect = MessagingOuterClass.InteractiveMediaSelect.newBuilder();

        for (InteractiveSelectOption selectOption : select.getOptions()) {
            MessagingOuterClass.InteractiveMediaSelectOption.Builder apiSelectOption = MessagingOuterClass.InteractiveMediaSelectOption.newBuilder();
            apiSelectOption.setValue(selectOption.getValue()).setLabel(selectOption.getLabel());
            apiSelect.addOptions(apiSelectOption);
        }

        if (select.getLabel() != null && !select.getLabel().isEmpty()) {
            apiSelect.setLabel(StringValue.of(select.getLabel()));
        }

        if (select.getDefaultValue() != null && !select.getDefaultValue().isEmpty()) {
            apiSelect.setDefaultValue(StringValue.of(select.getDefaultValue()));
        }

        return MessagingOuterClass.InteractiveMediaWidget.newBuilder().setInteractiveMediaSelect(apiSelect).build();
    }
}
