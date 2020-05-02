package l20_21_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Outputer {

    private String filePath;

    public Outputer(String filePath) {
        this.filePath = filePath;
    }

    public void write(String st) throws IOException {
        OutputStream outputStream = new FileOutputStream(filePath);
        outputStream.write(st.getBytes());
        outputStream.close();
    }
}

