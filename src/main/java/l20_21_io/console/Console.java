package l20_21_io.console;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Console {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello");


        PrintStream printStream = new PrintStream("src/main/resources/log.txt");
        System.setOut(printStream);





        System.out.println("Hello");
    }
}
