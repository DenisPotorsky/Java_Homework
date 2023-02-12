import java.util.ArrayList;
import java.util.List;

public class DrinkVendingMachine {

    public List<Drink> drinkList;

    public DrinkVendingMachine(List<Drink> drinkList) {
        this.drinkList = new ArrayList<>();
    }

    public void addDrink(Drink dr) {
        drinkList.add(dr);
    }

    public Drink getProduct(String name, int volume) {
        for (Drink d : drinkList) {
            if (d.getName().equals(name) && d.getVolume() == volume) {
                return d;
            }
        }
        return null;
    }
}
