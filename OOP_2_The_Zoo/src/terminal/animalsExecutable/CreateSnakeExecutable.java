package terminal.animalsExecutable;

import animals.Snake;
import terminal.comandExecutable.CommandExecutable;
import zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable {
    private Zoo zoo;
    private Snake snake;

    public CreateSnakeExecutable(Zoo zoo, Snake snake) {
        this.zoo = zoo;
        this.snake = snake;
    }

    public void execute() {
        zoo.createSnake(snake);
    }
}
