package l5_basics_oop;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    ArrList<Integer> list = new ArrList(new Integer[]{1, 2, 3, 4, 5 });
    ArrList<Integer> list2 = new ArrList(new Integer[]{90});
    ArrayList<Integer> arrList = new ArrayList();

    arrList.add(1);
    arrList.add(13);
    arrList.add(12);

    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    list.add(11);
    list.add(12);
    list.add(13);

    list.add(1, 0);

    list.remove(5);

    System.out.println(Arrays.toString(list.toArray()));
    System.out.println(list.containsAll(arrList));
    System.out.println(list.contains(5));
    System.out.println(list.contains(50));
    System.out.println(list.indexOf(1));
    System.out.println(list.indexOf(13));
  }
}
