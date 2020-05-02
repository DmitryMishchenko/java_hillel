package l12_strategy.strategy.iter_4;

public class Main {
    public static void main(String[] args) {
        String a = "ivan";
        String b = "iv";
        if (true) {
            b = b + "an";
        }
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
