package iterator;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import java.util.ArrayList;
import java.util.Iterator;

public class ZooIterator {
    ArrayList<Lion> l;
    ArrayList<Wolf> w;
    ArrayList<Snake> s;

    public ZooIterator(ArrayList<Lion> lion, ArrayList<Wolf> wolf, ArrayList<Snake> snake) {
        this.l = lion;
        this.w = wolf;
        this.s = snake;

    }

    public void zooIterate() {
        Iterator<Lion> lionIterator = l.iterator();
        Iterator<Wolf> wolfIterator = w.iterator();
        Iterator<Snake> snakeIterator = s.iterator();
        while (lionIterator.hasNext()) System.out.println(lionIterator.next());
        while (wolfIterator.hasNext()) System.out.println(wolfIterator.next());
        while (snakeIterator.hasNext()) System.out.println(snakeIterator.next());
    }
}
