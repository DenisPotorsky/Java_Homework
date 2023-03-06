package terminal.parsing;

import terminal.comandExecutable.Command;

public interface CommandParser {
    Command parseCommand(String input);
}

