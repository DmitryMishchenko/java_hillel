package l13_enum.singleton;

public class Provider {
    public String get(Integer integer) {
        System.out.println("Called");
        return "provided on " + integer;
    }
}
