
package main.java.homework_2.task4;
import java.util.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Office> {

    @Override
    public int compare(Office o1, Office o2) {
        // Для строк и некоторых других классов можно использовать метод compareTo.
        return o1.getName().compareTo(o2.getName());
    }
}