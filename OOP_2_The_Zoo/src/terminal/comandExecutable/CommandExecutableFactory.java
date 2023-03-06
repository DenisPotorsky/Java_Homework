package terminal.comandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);
}
