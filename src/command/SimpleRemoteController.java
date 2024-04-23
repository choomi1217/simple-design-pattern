package command;

import command.commands.LightOnCommand;

public class SimpleRemoteController {

    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void pressButton() {
        slot.execute();
    }
}
