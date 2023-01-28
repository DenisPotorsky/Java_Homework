import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*Задан целочисленный список ArrayList.
Найти минимальное, максимальное и
среднее ариф из этого списка.*/
public class MinMaxMid {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillList(list);
        printList(list);
        double mid = average(list);
        System.out.println("Среднее: " + mid);
        System.out.println("Максимальное: " + Collections.max(list));
        System.out.println("Минимальное: " + Collections.min(list));
    }

    public static void fillList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int rnd = random.nextInt(100);
            list.add(rnd);
        }
    }

    static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum / list.size();
    }

    public static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
