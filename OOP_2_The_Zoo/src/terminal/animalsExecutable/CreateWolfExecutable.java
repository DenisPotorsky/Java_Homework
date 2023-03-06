package terminal.animalsExecutable;

import animals.Wolf;
import terminal.comandExecutable.CommandExecutable;
import zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {
    private Zoo zoo;
    private Wolf wolf;

    public CreateWolfExecutable(Zoo zoo, Wolf wolf) {
        this.zoo = zoo;
        this.wolf = wolf;
    }

    public void execute() {
        zoo.createWolf(wolf);
    }
}
