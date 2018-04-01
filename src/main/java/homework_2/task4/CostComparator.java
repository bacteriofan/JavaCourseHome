
package main.java.homework_2.task4;

import java.util.Comparator;

public class CostComparator implements Comparator<Office> {

    @Override
    public int compare(Office o1, Office o2) {

        if (o1.getCost() > o2.getCost()) {
            return 1;
        } else if (o1.getCost() < o2.getCost()) {
            return -1;
        }
        return 0;
    }
}
