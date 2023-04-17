package im.dlg.botsdk.model.config;

import im.dlg.botsdk.model.BotCommand;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ApplicationBotConfig {
    @Getter
    @Setter
    private String token;
    @Getter
    @Setter
    private String host;
    @Getter
    @Setter
    private Integer port;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Boolean withSecure;
    @Getter
    @Setter
    private String about;
    @Getter
    @Setter
    private List<BotCommand> commands;
}
