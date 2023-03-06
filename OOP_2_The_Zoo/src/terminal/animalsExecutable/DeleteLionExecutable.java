package terminal.animalsExecutable;

import terminal.comandExecutable.CommandExecutable;
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
