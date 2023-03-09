package terminal.commandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);

}
