
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Asus", "Windows", 4, 256, 15.5, 5555);
        Computer comp2 = new Computer("Acer", "Windows", 8, 512, 14, 6666);
        Computer comp3 = new Computer("HP", "Windows", 4, 512, 15.5, 7777);
        Computer comp4 = new Computer("Asus", "Windows", 8, 512, 15.5, 8888);
        Computer comp5 = new Computer("Macbook", "MacOS", 16, 256, 13, 9999);
        Set<Computer> computers = new HashSet<>();
        computers.add(comp1);
        computers.add(comp2);
        computers.add(comp3);
        computers.add(comp4);
        computers.add(comp5);
        Computer.filtering(computers);
    }
}
