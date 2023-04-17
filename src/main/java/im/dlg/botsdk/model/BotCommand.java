package im.dlg.botsdk.model;

import com.google.protobuf.StringValue;
import im.dlg.grpc.services.UsersOuterClass;
import lombok.Getter;
import lombok.Setter;

public class BotCommand {
    @Getter
    @Setter
    private String slashCommand;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private String locKey;

    public BotCommand(){

    }

    public BotCommand(String slashCommand, String description) {
        this.slashCommand = slashCommand;
        this.description = description;
        this.locKey = slashCommand;
    }

    public BotCommand(String slashCommand, String description, String locKey) {
        this.slashCommand = slashCommand;
        this.description = description;
        this.locKey = locKey;
    }

    public BotCommand(UsersOuterClass.BotCommand command) {
        slashCommand = command.getSlashCommand();
        description = command.getDescription();
        locKey = command.getLocKey().getValue();
    }

    public UsersOuterClass.BotCommand toServer() {
        return UsersOuterClass.BotCommand.newBuilder()
                .setSlashCommand(slashCommand)
                .setDescription(description)
                .setLocKey(StringValue.of(locKey))
                .build();
    }
}
