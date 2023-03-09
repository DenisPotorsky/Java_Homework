package terminal.reader;

import iterator.ZooIterator;
import terminal.commandExecutable.Command;
import terminal.commandExecutable.CommandExecutable;
import terminal.commandExecutable.CommandExecutableFactory;
import terminal.parsing.CommandParser;
import terminal.menu.Menu;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader termReader;
    private CommandParser commandParser;
    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }
    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (termReader == null) {
            termReader = new TerminalReader(commandParser);
        }
        return termReader;
    }

    public void runReader(CommandExecutableFactory factory, ZooIterator iterator) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            new Menu().printMenu();
            String input = scanner.nextLine();
            Command command = this.commandParser.parseCommand(input);
            if (command.isStop()) break;
            try {
                if (new InputChecker().check(input)) {
                    iterator.zooIterate();
                    CommandExecutable commandExecutable = factory.create(command);
                    commandExecutable.execute();
                    iterator.zooIterate();

                }
                else System.out.println("Проверьте свой ввод!");
            } catch (Exception e) {
                System.out.println("Вы что-то ввели не так!");
            }
        }
        scanner.close();
    }

}


