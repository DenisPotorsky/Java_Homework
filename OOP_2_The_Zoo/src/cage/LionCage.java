package cage;

import animals.Animal;
import animals.Lion;

import java.util.ArrayList;

public class LionCage implements AnimalCage {
    private int pollution = 0;
    private static final int MAX_POLLUTION = 100;
    private ArrayList<Lion> lions;

    public LionCage(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    public String toString() {
        return "LionCage{" +
                "pollution =" + pollution +
                ", lions=" + lions +
                '}';
    }

    @Override
    public int getCagePollution() {
        return pollution;
    }

    public ArrayList<Lion> addAnimal(Animal animal) {
        lions.add((Lion) animal);
        return lions;
    }

    @Override
    public int deliverFood(int foodWeight, Animal animal) {
        animal.feed(foodWeight);
        if (pollution + 10 < MAX_POLLUTION) {
            pollution += 10;
        }
        else System.out.println("Cage is too polluted. You need to clean it");;
        return pollution;
    }

    @Override
    public int cleanCage(int pollution) {
        return pollution = 0;
    }


    @Override
    public Animal getAnimal() {
        if (!lions.isEmpty()) {
            Animal lion = lions.get(0);
            lions.remove(0);
        return lion;
        }
        else {
            System.out.println("Cage is empty");
        }
        return null;
    }
}
