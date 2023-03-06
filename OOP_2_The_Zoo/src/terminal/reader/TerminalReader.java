package terminal.reader;

import terminal.comandExecutable.Command;
import terminal.comandExecutable.CommandExecutable;
import terminal.comandExecutable.CommandExecutableFactory;
import terminal.menu.Menu;
import terminal.parsing.CommandParser;

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

    public void runReader(CommandExecutableFactory factory) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            new Menu().printMenu();
            String input = scanner.nextLine();
            Command command = this.commandParser.parseCommand(input);
            if (command.isStop()) break;
            try {
                if (new InputChecker().check(input)) {
                    CommandExecutable comExe = factory.create(command);
                    comExe.execute();
                }
            } catch (Exception e) {
                System.out.println("Введите правильные параметры");
            }
        }
    }
}


