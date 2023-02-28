package terminal;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import zoo.Zoo;

public class CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    CommandExecutable create(String[] input) {
        if (input.length == 1) {
            if (input[0].equals("1")) {
                return new DeleteLionExecutable(zoo);
            } else if (input[0].equals("2")) {
                return new DeleteWolfExecutable(zoo);
            } else if (input[0].equals("3")) {
                return new DeleteSnakeExecutable(zoo);
            }
        } else if (input.length == 5) {
            if (input[0].equals("1")) {
                return new CreateLionExecutable(zoo, new Lion(Integer.parseInt(input[1]),
                        Integer.parseInt(input[2]), Integer.parseInt(input[3]),
                        Integer.parseInt(input[4])));
            } else if (input[0].equals("2")) {
                return new CreateWolfExecutable(zoo, new Wolf(Integer.parseInt(input[1]),
                        Integer.parseInt(input[2]), Integer.parseInt(input[3]),
                        Integer.parseInt(input[4])));
            } else if (input[0].equals("3")) {
                return new CreateSnakeExecutable(zoo, new Snake(Integer.parseInt(input[1]),
                        Integer.parseInt(input[2]), Integer.parseInt(input[3]),
                        Integer.parseInt(input[4])));
            }
        } else System.out.println("Вы что-то ввели не так :(");
        return null;
    }
}
