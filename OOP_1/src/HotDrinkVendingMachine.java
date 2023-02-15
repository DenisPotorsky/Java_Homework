import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine extends DrinkVendingMachine {
    private List<Drink> drinks = new ArrayList<>();

    public HotDrinkVendingMachine(List<Drink> drinks) {
        super(drinks);
    }

    public void addHotDrink(HotDrink hd) {
        drinks.add(hd);
    }

    protected HotDrink getProduct(String name, int volume, int temperature) {
        for (Drink d : drinks) {
            if (d instanceof HotDrink hd) {
                if (hd.getName().equals(name) && hd.getVolume() == volume && hd.getTemperature() == temperature) {
                    return hd;
                }
            } else return null;
        }
        return null;
    }
}
