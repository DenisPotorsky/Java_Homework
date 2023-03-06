package terminal.comandExecutable;

import zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    public LogingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }

    public CommandExecutable create(Command command) {
        if (command.isCreateLion()) {
            System.out.println(String.format("Вы ввели команду 'Создать льва' с параметрами: " +
                            "\nВозраст - %d" +
                            "\nВес - %d" +
                            "\nколичество лап - %d" +
                            "\nОбъем гривы - %d", command.setFirstParam(), command.setSecondParam(),
                    command.setThirdParam(), command.setFourthParam()));
        } else if (command.isCreateWolf()) {
            System.out.println(String.format("Вы ввели команду 'Создать волка' с параметрами: " +
                            "\nВозраст - %d" +
                            "\nВес - %d" +
                            "\nколичество лап - %d" +
                            "\nвысотра в холке - %d", command.setFirstParam(), command.setSecondParam(),
                    command.setThirdParam(), command.setFourthParam()));
        } else if (command.isCreateSnake()) {
            System.out.println(String.format("Вы ввели команду 'Создать змею' с параметрами: " +
                            "\nВозраст - %d" +
                            "\nВес - %d" +
                            "\nколичество лап - %d" +
                            "\nдлина тела - %d", command.setFirstParam(), command.setSecondParam(),
                    command.setThirdParam(), command.setFourthParam()));
        } else if (command.isDeleteLion()) {
            System.out.println(String.format("Вы ввели команду 'Удалить льва'"));
        } else if (command.isDeleteWolf()) {
            System.out.println(String.format("Вы ввели команду 'Удалть волка'"));
        } else if (command.isDeleteSnake()) {
            System.out.println(String.format("Вы ввели команду 'Удалить змею'"));
        }
        if (command.isCreateLion()) System.out.println("Лев успешно создан и добавлен в клетку");
        else if (command.isCreateWolf()) System.out.println("Волк успешно создан и добавлен в клетку");
        else if (command.isCreateSnake()) System.out.println("Змея успешно создан и добавлен в клетку");
        else if (command.isDeleteLion()) System.out.println("Случайный лев удален из клетки");
        else if (command.isDeleteWolf()) System.out.println("Случайный волк удален из клетки");
        else if (command.isDeleteSnake()) System.out.println("Случайня змея удалена из клетки");
        return super.create(command);
    }
}
