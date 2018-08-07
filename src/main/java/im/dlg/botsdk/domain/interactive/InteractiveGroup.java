package im.dlg.botsdk.domain.interactive;

import java.util.List;

public class InteractiveGroup {
    private String title;
    private String description;
    private List<InteractiveAction> actions;

    public InteractiveGroup(String title, String description, List<InteractiveAction> actions) {
        this.title = title;
        this.description = description;
        this.actions = actions;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<InteractiveAction> getActions() {
        return actions;
    }
}
