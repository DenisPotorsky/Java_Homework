import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        fillList(list);
        System.out.println(list);
        System.out.println(reversList(list));
    }

    public static void fillList(LinkedList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int rnd = random.nextInt(100);
            list.add(rnd);
        }
    }

    public static LinkedList<Integer> reversList(LinkedList<Integer> l) {
        int temp = 0;
        int len = l.size() - 1;
        for (int i = 0; i < l.size() / 2; i++) {
            temp = (int) l.get(i);
            l.set(i, (int) l.get(len - i));
            l.set(len - i, temp);
        }
        return l;
    }
}

