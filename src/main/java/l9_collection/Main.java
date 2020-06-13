package l9_collection;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        long now = System.currentTimeMillis();

        System.out.println(f.naiveRecursive(35));

        System.out.println(f.recursiveWithMemoization(350));
        System.out.println(f.dpArray(3500));
        System.out.println(f.dpOptimized(35000));

        System.out.println();

//        System.out.println((System.currentTimeMillis() - now));
//        System.out.println((System.currentTimeMillis() - now));

        Collection<Integer> collection = new MyCollection();
        Collection<Integer> collection2 = new MyCollection();

        collection.add(10);
        collection.add(20);
        collection.add(30);

        collection2.add(20);
        collection2.add(30);

        collection.retainAll(collection2);

//        collection.remove(10);

        for (Integer n : collection) {
            System.out.println(n);
        }

        System.out.println(Arrays.toString(collection.toArray()));
        System.out.println(collection.contains(10));
        System.out.println(collection.containsAll(collection2));
    }
}
