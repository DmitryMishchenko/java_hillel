package l12_strategy.strategy.iter_4;

import java.util.Comparator;

public class DuckComparatorReverse implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Duck duck1 = (Duck) o1;
        Duck duck2 = (Duck) o2;
        if (duck1.id < duck2.id) {
            return 1;
        } else if (duck1.id > duck2.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
