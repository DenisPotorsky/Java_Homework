package cage;

import animals.Animal;
import animals.Lion;
import animals.Wolf;
import iterator.WolfIterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class WolfCage implements AnimalCage, Iterable<Wolf> {
    private int pollution = 0;
    private static final int MAX_POLLUTION = 90;
    private ArrayList<Wolf> wolfs;

    public WolfCage(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    public String toString() {
        return "WolfCage{" +
                "wolfs=" + wolfs +
                '}';
    }

    @Override
    public int getCagePollution() {
        return pollution;
    }

    public ArrayList<Lion> addAnimal(Animal animal) {
        ArrayList<Lion> lions = new ArrayList<>();
        if (animal instanceof Lion) {
            lions.add((Lion) animal);
        }
        return lions;
    }

    @Override
    public int deliverFood(int foodWeight) {
        int portion = foodWeight / wolfs.size();
        for (var wolf : wolfs) {
            wolf.feed(portion);
        }
        if (pollution + 10 < MAX_POLLUTION) {
            pollution += 10;
        } else System.out.println("Cage is too polluted. You need to clean it");
        return pollution;
    }


    public int cleanCage() {
        return 0;
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

    public void wolfSort() {
        //Collections.sort(wolfs, new WolfComparator());
        wolfs.sort(Comparator.comparing(Wolf::getAge)
                .thenComparing(Wolf::getWeight));
    }

    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolfs);
    }
}
