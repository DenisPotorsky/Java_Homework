package vendingMachine;

public interface VendingMachine<T> {
    void addDrink(T drink);

    T getDrink(String name);
    
}
