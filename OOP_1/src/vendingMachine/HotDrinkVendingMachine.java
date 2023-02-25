package vendingMachine;

import drinks.HotDrink;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine<HotDrink> {
    private List<HotDrink> drinks;
    private final int MAX_HOT_DRINKS_COUNT = 15;

    public HotDrinkVendingMachine() {
        this.drinks = new ArrayList<>();
    }

    public void addDrink(HotDrink drink) {
        if (drinks.size() + 1 < MAX_HOT_DRINKS_COUNT) {
            drinks.add(drink);
        } else System.out.println("Machine is full");
    }

    public HotDrink getDrink(String name) {
        int index;
        if (!drinks.isEmpty()) {
            for (HotDrink d : drinks) {
                if (d.getName().equals(name)) {
                    index = drinks.indexOf(d);
                    HotDrink dr = drinks.get(index);
                    drinks.remove(index);
                    return dr;
                }
            }
        } else System.out.println("Machine is empty");
        return null;
    }

    public HotDrink getDrink(String name, int temperature) {
        int index;
        if (!drinks.isEmpty()) {
            for (HotDrink d : drinks) {
                if (d.getName().equals(name) && d.getTemperature() == temperature) {
                    index = drinks.indexOf(d);
                    HotDrink dr = drinks.get(index);
                    drinks.remove(index);
                    System.out.print("take your ");
                    return dr;
                }
            }
        } else System.out.println("Machine is empty");
        return null;
    }

    public String toString() {
        return drinks.toString();
    }
}
