package l2_datatypes;

public class Condition {

    public static void main(String[] args) {
        int i = 100;

        if (i == 100) {
            System.out.println("This is true");
        }

        if (i == 101) {
            System.out.println("This is true");
        } else {
            System.out.println("This is not true");
        }

        if (i == 101) {
            System.out.println("This is true");
        } else {
            System.out.println("This is not true");
        }
//        if (i == 101 && i ==500) {
//            System.out.println("This is true");
//        } else {
//            System.out.println("This is not true");
//        }

//        if (101) {
//            System.out.println("This is true");
//        } else {
//            System.out.println("This is not true");
//        }

        int result = i == 100 ? 1 : 0;
    }


}
