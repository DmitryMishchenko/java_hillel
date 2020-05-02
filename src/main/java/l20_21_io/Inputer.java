package l20_21_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Inputer {

    private String filePath;

    public Inputer(String filePath) {
        this.filePath = filePath;
    }

    public void read() throws IOException {
        InputStream inputstream = new FileInputStream(filePath);

        int data = inputstream.read();
        char content;
        while (data != -1) {
            content = (char) data;
            System.out.print(content);
            data = inputstream.read();
        }
        inputstream.close();
    }

    public int countNumOfBytes() throws IOException {
        int numOfSymbols = 0;

        InputStream inputstream = new FileInputStream(filePath);
        inputstream  = new BufferedInputStream(inputstream);


        while (inputstream.read() != -1) {
            numOfSymbols++;
        }
        inputstream.close();
        return numOfSymbols;
    }
}
