package l20_21_io.scanner_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
        double sum = 0;
        Scanner scanner = new Scanner(new FileInputStream("src/main/resources/numbers_small.txt"));
//        scanner.useDelimiter("hello");


        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else {
                String next = scanner.next();
                System.out.println(next);
            }
        }
        scanner.close();
        System.out.println(sum);
    }
}
