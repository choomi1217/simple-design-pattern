package command;

import command.action.Light;
import command.commands.GarageDoorUpCommand;
import command.commands.LightOnCommand;
import org.junit.jupiter.api.Test;

class RemoteControllerTest {

        @Test
        void main() {
            SimpleRemoteController remoteController = new SimpleRemoteController();
            Light light = new Light();
            GarageDoor garageDoor = new GarageDoor();
            LightOnCommand lightOnCommand = new LightOnCommand(light);
            GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);

            remoteController.setCommand(lightOnCommand);
            remoteController.pressButton();

            remoteController.setCommand(garageDoorUpCommand);
            remoteController.pressButton();
        }

}