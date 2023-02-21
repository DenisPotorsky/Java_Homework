package vendingMachine;

import drinks.ColdDrink;

import java.util.ArrayList;
import java.util.List;

public class DrinkVendingMachine implements VendingMachine<ColdDrink> {
    private final int MAX_DRINKS_COUNT = 20;
    private List<ColdDrink> drinkList;

    public DrinkVendingMachine() {
        this.drinkList = new ArrayList<>();
    }

    public void addDrink(ColdDrink dr) {
        if (drinkList.size() + 1 < MAX_DRINKS_COUNT) {
            drinkList.add(dr);
        } else System.out.println("Machine is full");
    }

    public ColdDrink getDrink(String name) {
        int index;
        if (!drinkList.isEmpty()) {
            for (ColdDrink d : drinkList) {
                if (d.getName().equals(name)) {
                    index = drinkList.indexOf(d);
                    ColdDrink dr = drinkList.get(index);
                    drinkList.remove(index);
                    System.out.print("take your ");
                    return dr;
                }
            }
        }
        System.out.println("Machine is empty");
        return null;
    }

    public String toString() {
        return drinkList.toString();
    }
}
