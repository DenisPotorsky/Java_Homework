import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink latte = new HotDrink("latte", 100, 70);
        HotDrink espresso = new HotDrink("espresso", 50, 80);
        HotDrink cappuccino = new HotDrink("cappuccino", 200, 80);
        Drink cola = new Drink("Coca-Cola", 1000);

        List<Drink> drinkList = new ArrayList<>();
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(drinkList);
        machine.addHotDrink(latte);
        machine.addHotDrink(espresso);
        machine.addHotDrink(cappuccino);
        machine.addDrink(cola);

        System.out.println(machine.getProduct("espresso", 50, 80));
        System.out.println(machine.getProduct("Coca-Cola", 1000));

    }
}
