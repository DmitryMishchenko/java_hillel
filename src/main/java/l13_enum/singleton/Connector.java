package l13_enum.singleton;

public enum Connector {
    INSTANCE;

    public static Connector getInstance() {
        return INSTANCE;
    }

    private Connector() {
        System.out.println("Connector created");
    }

    @Override
    public String toString() {
        return "This is Connector";
    }

    public static void hello() {
        System.out.println("Hello");
    }
}
