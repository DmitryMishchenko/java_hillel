package l5_basics_oop;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrList(new Integer[]{18, -2, 3, 4, 5, -100 });
    List<Integer> list2 = new ArrList(new Integer[]{1, 2, 3});
    List<Integer> ar = new ArrayList();

    ar.add(Integer.valueOf(100));
    ar.add(Integer.valueOf(90));
    ar.add(Integer.valueOf(1));
    ar.add(Integer.valueOf(10));

    list.sort((a, b) -> a - b);

//    list.add(6);
//    list.add(7);
//    list.add(8);
//    list.add(9);
//    list.add(10);
//    list.add(11);
//    list.add(12);
//    list.add(13);

    // remove 6
//    list.remove(5);
//
//    // prepend zero
//    list.add(0, 0);

    for (int n : list) {
      System.out.println(n);
    }

//    ListIterator<Integer> iterator = list.listIterator();
//
//    System.out.println(iterator.next());
//    System.out.println(iterator.next());
//    System.out.println(iterator.next());
//    System.out.println(iterator.previous());
//    System.out.println(iterator.hasPrevious());
//    iterator.add(20);
//    System.out.println(iterator.next());
//    System.out.println(iterator.next());
//
//    list.retainAll(list2);
//
//    System.out.println("after retain");
//
//    for (int n : list) {
//      System.out.println(n);
//    }
  }
}
