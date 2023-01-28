import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Пусть дан произвольный список целых чисел,
удалить из него четные числа*/
public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillList(list);
        printList(list);
        printList(evenDell(list));
    }

    public static void fillList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int rnd = random.nextInt(100);
            list.add(rnd);
        }
    }

    public static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static List<Integer> evenDell(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i -= 1;
            }
        }
        return list;
    }
}



