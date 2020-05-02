package l2_datatypes;

public class ShortCircuitCondition {
    public static boolean getFalse() {
        System.out.println("Method");
        return false;
    }

    public static void main(String[] args) {
        if(getFalse() && getFalse()) { }
        System.out.println("=============================");
        if(getFalse() & getFalse()) { }
    }

}
