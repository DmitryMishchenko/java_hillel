package l20_21_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        //first example
        //        byteInputStreamTest();

        //second example
        //        copyTest();

        //third example
        countNumberOfBytes();
    }

    public static void byteInputStreamTest() {
        InputStream is = null;
        try {
            is = new FileInputStream("src/main/resources/io_test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        try {
            int readData;
            while ((readData = is.read()) != -1) {
                System.out.print(readData);
                System.out.println(" " + (char) readData);//no cyrillic symbols
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void copyTest() {
        File inputFile = new File("src/main/resources/io_test.txt");
        File outputFile = new File("src/main/resources/io_test_out.txt");

        System.out.println(outputFile.isDirectory());

        try (InputStream is = new FileInputStream(inputFile);
             OutputStream os = new FileOutputStream(outputFile)
        ) {
            int readData;
            while ((readData = is.read()) != -1) {
                os.write(readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void countNumberOfBytes() throws IOException {

        Inputer inputer = new Inputer("src/main/resources/wap.txt");
        System.out.print("\n");
        System.out.println("Number of symbols: " + inputer.countNumOfBytes());
    }
}
