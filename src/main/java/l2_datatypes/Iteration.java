package l2_datatypes;

public class Iteration {
    public static void main(String[] args) {

    }

    public static void simpleWhile() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            //break
            //continue
        }
    }

    public static void simpleDoWhile() {
        int i = 10;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 10);
    }

    public static void simpleFor() {
        //        for (;;) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void simpleForEach() {
        int[] array = {1, 2, 5, 100};
        for (int i : array) {
            System.out.println(i);
        }
    }
}
