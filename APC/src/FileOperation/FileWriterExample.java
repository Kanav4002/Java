package FileOperation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
//        File f = new File("abc.txt");
//        System.out.println(f.exists());
//
//        FileWriter fw = new FileWriter(f);
//        fw.write("Hello World\n");
//        fw.write(97);
//        fw.write("97");
//        char[] ch = {'a', 'b', 'c'};
//        fw.write(ch);
//
//        fw.flush();

        File f = new File("output.txt");
        f.createNewFile();

        FileWriter fw = new FileWriter("output.txt");
        fw.write("Java");
        fw.close();

        FileReader fr = new FileReader("output.txt");
        System.out.println((char) fr.read());
        fr.close();
    }
}
