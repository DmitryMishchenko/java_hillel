package l19_exceptions;

public class ZloException extends RuntimeException {

    private String status;

    public ZloException() {
       super("This is ZLO");
    }
}
