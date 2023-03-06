package terminal.comandExecutable;

public class Command {
    private String command;

    public String getCommand() {
        return command;
    }

    public Command(String command) {
        this.command = command;
    }

    public boolean isCreateLion() {
        return command.split("\s+")[0].equals("1");
    }

    public boolean isCreateWolf() {
        return command.split("\s+")[0].equals("2");
    }

    public boolean isCreateSnake() {
        return command.split("\s+")[0].equals("3");
    }

    public boolean isDeleteLion() {
        return command.split("\s+")[0].equals("4");
    }

    public boolean isDeleteWolf() {
        return command.split("\s+")[0].equals("5");
    }

    public boolean isDeleteSnake() {
        return command.split("\s+")[0].equals("6");
    }

    public boolean isStop() {
        return command.toLowerCase().split(" ")[0].equals("stop");
    }

    public int setFirstParam() {
        String[] params = command.split(" ");
        return Integer.parseInt(params[1]);
    }

    public int setSecondParam() {
        String[] params = command.split(" ");
        return Integer.parseInt(params[2]);
    }

    public int setThirdParam() {
        String[] params = command.split(" ");
        return Integer.parseInt(params[3]);
    }

    public int setFourthParam() {
        String[] params = command.split(" ");
        return Integer.parseInt(params[4]);
    }
}
