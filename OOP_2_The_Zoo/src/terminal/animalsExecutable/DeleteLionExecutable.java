package terminal.animalsExecutable;

import terminal.commandExecutable.CommandExecutable;
import zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable {
    private Zoo zoo;

    public DeleteLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public void execute() {
        zoo.deleteLion();
    }
}
