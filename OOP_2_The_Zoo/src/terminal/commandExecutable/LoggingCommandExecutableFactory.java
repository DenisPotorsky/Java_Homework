package terminal.commandExecutable;
import zoo.Zoo;


public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    public LoggingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }
    @Override
    public CommandExecutable create(Command command) {
        if(command.isCreateLion()){
            System.out.println(String.format("Вы ввели команду 'Создать льва' с параметрами: \nВозраст - %d\nВес - %d\n" +
                    "количество лап - %d\nОбъем гривы - %d", command.setFirstParam(), command.setSecondParam(),
                    command.setThirdParam(), command.setFourthParam()));}
        else if(command.isCreateWolf()){
            System.out.println(String.format("Вы ввели команду 'Создать волка' с параметрами: \nВозраст - %d\nВес - %d\n" +
                                "количество лап - %d\nВвсота в холке - %d", command.setFirstParam(), command.setSecondParam(),
                        command.setThirdParam(), command.setFourthParam())); }
        else if(command.isCreateSnake()){
            System.out.println(String.format("Вы ввели команду 'Создать змею' с параметрами: \nВозраст - %d\nВес - %d\n" +
                            "количество лап - %d\nДлина тела - %d", command.setFirstParam(), command.setSecondParam(),
                    command.setThirdParam(), command.setFourthParam())); }
        else if(command.isDeleteLion()) System.out.println("Вы ввели команду 'Удалить льва'");
        else if(command.isDeleteWolf()) System.out.println("Вы ввели команду 'Удалить волка'");
        else if(command.isDeleteSnake()) System.out.println("Вы ввели команду 'Удалить змею'");

        if(command.isCreateLion()) System.out.println("\nЛев успешно создан и добавлен в клетку\n");
        else if(command.isCreateWolf()) System.out.println("\nВолк успешно создан и добавлен в клетку\n");
        else if(command.isCreateSnake()) System.out.println("\nЗмея успешно создана и добавлена в клетку\n");

        else if(command.isDeleteLion()) {System.out.println("\nСлучайный лев удален из клетки\n");
        }
        else if(command.isDeleteWolf()) {System.out.println("\nСлучайный волк удален из клетки\n");
        }
        else if(command.isDeleteSnake()) {System.out.println("\nСлучайная змея удалена из клетки\n");
        }
        return super.create(command);
    }
}
