package l9_collection;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        long now = System.currentTimeMillis();

        System.out.println(f.naiveRecursive(35));

        System.out.println(f.recursiveWithMemoization(350));
        System.out.println(f.dpArray(3500));
        System.out.println(f.dpOptimized(35000));

//        System.out.println((System.currentTimeMillis() - now));
//        System.out.println((System.currentTimeMillis() - now));
    }
}
