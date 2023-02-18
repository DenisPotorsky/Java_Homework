import animals.Animal;
import animals.Lion;
import cage.LionCage;
import factory.LionsFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createLions(4);
        lions.get(0).setManeVolume(20);
        lions.get(0).setWeight(30);
        lions.get(0).setNumberOfLimbs(4);
        lions.get(0).setYearOfBirth(2000);
        LionCage lionCage = new LionCage(lions);
        System.out.println(lionCage);
        lionCage.deliverFood(30, lions.get(1));
        System.out.println(lions.get(1).getWeight());
        System.out.println(lionCage.getCagePollution());
        Animal leo = lionCage.getAnimal();
        System.out.println(leo);
        System.out.println(lionCage);
    }
}
