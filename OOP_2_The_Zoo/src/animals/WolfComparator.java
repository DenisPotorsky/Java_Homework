package animals;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getWeight() > o2.getWeight()) {
            if (o1.getAge() > o2.getAge()) return 1;
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            if (o1.getAge() < o2.getAge()) return -1;
            return -1;
        }
        return 0;
    }
}
