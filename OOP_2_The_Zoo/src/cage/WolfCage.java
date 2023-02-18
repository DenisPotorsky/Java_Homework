package cage;

import animals.Animal;
import animals.Wolf;

import java.util.ArrayList;

public class WolfCage implements AnimalCage {
    private int pollution = 0;
    private static final int MAX_POLLUTION = 90;
    private ArrayList<Wolf> wolfs;

    public WolfCage(ArrayList<Wolf> wolfs) {

        this.wolfs = wolfs;
    }

    public String toString() {
        return "WolfCage{" +
                "pollution =" + pollution +
                ", wolfs=" + wolfs +
                '}';
    }

    @Override
    public int getCagePollution() {
        return pollution;
    }

    public ArrayList<Wolf> addAnimal(Animal animal) {
        wolfs.add((Wolf) animal);
        return wolfs;
    }

    @Override
    public int deliverFood(int foodWeight, Animal animal) {
        animal.feed(foodWeight);
        pollution += 10;
        return pollution;
    }

    @Override
    public int cleanCage(int pollution) {
        return pollution = 0;
    }

    @Override
    public Animal getAnimal() {
        if (!wolfs.isEmpty()) {
            Animal wolf = wolfs.get(0);
            wolfs.remove(0);
            return wolf;
        } else {
            System.out.println("Cage is empty");
        }
        return null;
    }
}
