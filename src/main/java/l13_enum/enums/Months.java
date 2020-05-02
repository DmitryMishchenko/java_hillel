package l13_enum.enums;

public enum Months {
    JANUARY,
    FEBRUARY,
    MARCH;

    public String sayGreet() {
        return toString() + " Hello";
    }
}
