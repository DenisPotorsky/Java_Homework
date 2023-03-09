import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;
import factory.LionsFactory;
import iterator.ZooIterator;
import terminal.commandExecutable.LoggingCommandExecutableFactory;
import terminal.parsing.MyParser;
import terminal.reader.TerminalReader;
import zoo.Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = new ArrayList<>();
        wolfs.add(new Wolf(3, 5, 4, 4));
        wolfs.add(new Wolf(1, 2, 4, 5));
        wolfs.add(new Wolf(2, 3, 4, 3));
        WolfCage wolfCage = new WolfCage(wolfs);

        ArrayList<Lion> lions = LionsFactory.createLions(2);
        AnimalCage<Lion> lionCage = new LionCage(lions);

        ArrayList<Snake> snakes = new ArrayList<>();
        snakes.add(new Snake(1, 2, 3, 4));
        SnakeCage snakeCage = new SnakeCage(snakes);

        Zoo zoo1 = new Zoo(lionCage, wolfCage, snakeCage);
        ZooIterator iterator = new ZooIterator(lions, wolfs, snakes);

        MyParser parser = new MyParser();
        TerminalReader terminal = TerminalReader.newTerminalReader(parser);
        LoggingCommandExecutableFactory fac = new LoggingCommandExecutableFactory(zoo1);
        //CommandExecutableFactoryImpl factory = new CommandExecutableFactoryImpl(zoo1);
        terminal.runReader(fac, iterator);


    }
}
