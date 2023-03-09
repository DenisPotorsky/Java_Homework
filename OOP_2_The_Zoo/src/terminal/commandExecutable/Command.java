package terminal.commandExecutable;

public class Command {
    private String command;
    public Command(String command) {
        this.command = command;
    }
    public boolean isCreateLion() {
        return command.split("\s+")[0].equals("1");
    };
    public boolean isCreateWolf() {
        return command.split(" ")[0].equals("2");
    }
    public boolean isCreateSnake() {
        return command.split("\s+")[0].equals("3");
    }
    public boolean isDeleteLion() {
        return command.equals("4");
    };
    public boolean isDeleteWolf() {
        return command.equals("5");
    };
    public boolean isDeleteSnake() {
        return command.equals("6");
    };
    public boolean isStop() {
        return command.toLowerCase().equals("stop"); }
    public int setFirstParam(){
        String[] params = command.split("\s+");
        return Integer.parseInt(params[1]);
    }
    public int setSecondParam(){
        String[] params = command.split("\s+");
        return Integer.parseInt(params[2]);
    }
    public int setThirdParam(){
        String[] params = command.split("\s+");
        return Integer.parseInt(params[3]);
    }
    public int setFourthParam(){
        String[] params = command.split("\s+");
        return Integer.parseInt(params[4]);
    }
}
