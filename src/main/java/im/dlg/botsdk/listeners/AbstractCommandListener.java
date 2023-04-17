package im.dlg.botsdk.listeners;

import im.dlg.botsdk.listeners.typing.CommandListener;
import im.dlg.botsdk.model.CommandMessage;

import java.util.HashMap;

public abstract class AbstractCommandListener {
    protected HashMap<String, CommandListener> commands = new HashMap<>();

    private void killCommand(){
        System.exit(0);
    }

    public void beforeCommand(CommandMessage message){

    }

    public void afterCommand(CommandMessage message){

    }

    public void onCommand(CommandMessage message){
        beforeCommand(message);
        //Инструмент для перезагрузки бота
        if (message.getCommand().equals("bot_kill")) {
            killCommand();
            return;
        }
        if (commands.containsKey(message.getCommand())){
            commands.get(message.getCommand()).invoke(message);
        }
        afterCommand(message);
    }
}
