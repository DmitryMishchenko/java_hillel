package l20_21_io;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("src/main/resources/io_test.txt"));
        String s = scanner.nextLine();
        System.out.println(s);

    }
}
