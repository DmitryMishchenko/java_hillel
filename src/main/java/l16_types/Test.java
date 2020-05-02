package l16_types;

import l14_l15_listener.animals.Animal;

public class Test {
    public static void main(String[] args) {

        String o1 = "1";
        String o2 = "2";
//        Integer o2 = 1;
//        Integer o2 = 2;
        Interval<String> interval = new Interval<>(o1, o2);
//        System.out.println(interval);
    }
}
