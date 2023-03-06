package terminal.parsing;

import terminal.comandExecutable.Command;

public class MyParser implements CommandParser {
    @Override
    public Command parseCommand(String input) {

        return new Command(input);
    }
}
