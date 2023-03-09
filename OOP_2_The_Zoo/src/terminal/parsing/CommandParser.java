package terminal.parsing;

import terminal.commandExecutable.Command;

public interface CommandParser {

    Command parseCommand(String input);
}

