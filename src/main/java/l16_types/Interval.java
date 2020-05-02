package l16_types;

public class Interval<T extends Comparable<T>> {
    private T lower;
    private T upper;

    public Interval(T lower, T upper) {
        if (lower.compareTo(upper) < 0) {
            this.lower = lower;
            this.upper = upper;
        }else {
            throw new RuntimeException();
        }
    }

    public T getLower() {
        return lower;
    }

    public void setLower(T lower) {
        this.lower = lower;
    }

    @Override
    public String toString() {
        return "Interval{" +
               "lower=" + lower +
               ", upper=" + upper +
               '}';
    }
}
