package terminal.commandExecutable;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import terminal.animalsExecutable.*;
import zoo.Zoo;

import java.util.Iterator;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    protected Zoo zoo;
    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command command) {
        if (command.isDeleteLion()) return new DeleteLionExecutable(zoo);
        else if (command.isDeleteWolf()) {
            return new DeleteWolfExecutable(zoo);
        }
        else if (command.isDeleteSnake()) return new DeleteSnakeExecutable(zoo);
        else if (command.isCreateLion()) { return new CreateLionExecutable(zoo, new Lion(command.setFirstParam(), command.setSecondParam(),
                command.setThirdParam(), command.setFourthParam()));
        } else if (command.isCreateWolf()) { return new CreateWolfExecutable(zoo, new Wolf(command.setFirstParam(),
                command.setSecondParam(), command.setThirdParam(), command.setFourthParam()));
        } else if (command.isCreateSnake()) { return new CreateSnakeExecutable(zoo, new Snake(command.setFirstParam(),
                command.setSecondParam(), command.setThirdParam(), command.setFourthParam()));
            }
        return null;
        }

}
