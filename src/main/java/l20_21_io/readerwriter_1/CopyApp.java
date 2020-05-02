package l20_21_io.readerwriter_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopyApp {
    public static void main(String[] args) throws IOException {
        Reader fileReader = null;
        Writer fileWriter = null;
        try {
            fileReader = new FileReader("src/main/resources/io_test.txt");
            fileWriter = new FileWriter("src/main/resources/io_out_test.txt");
//            InputStreamReader reader = new InputStreamReader(new FileInputStream("resourses/io_test.txt"));
            int character;
            while((character = fileReader.read())!=-1){
                System.out.println((char)character + " : " + character);
                fileWriter.write(character);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileReader!=null){
                fileReader.close();
            }
            if(fileWriter!=null){
                fileWriter.close();
            }
        }
    }
}
