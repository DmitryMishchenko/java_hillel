package l13_enum.enums;

public enum Singleton {
    INSTANCE;

    Singleton() {
        System.out.println("Created");
    }

    public void doSmth() {
        System.out.println("test");
    }

    public static void test() {
        System.out.println("test called");
    }

}
