package terminal.reader;

public class InputChecker {
    public InputChecker() {
    }
    public boolean check(String input) {
        String[] inp = input.split(" ");
            if (inp.length < 1) return false;
            else if (inp.length > 1 && inp.length < 5) return false;
            else if (inp.length > 5) return false;
        return true;
    }
}
