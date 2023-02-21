package cage;

import animals.Animal;

import java.util.ArrayList;

public interface AnimalCage {
    int getCagePollution();

    ArrayList addAnimal(Animal animal);

    int deliverFood(int foodWeight);

    int cleanCage();

    Animal getAnimal();
}