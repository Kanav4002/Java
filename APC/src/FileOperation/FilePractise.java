package FileOperation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePractise {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Kanav");
        f1.mkdir();

        File f2 = new File(f1, "kanav.txt");
        f2.createNewFile();

        FileWriter fw = new FileWriter(f2, true);
        fw.write("APC Lecture\n");

        fw.flush();
        fw.close();

//        Reads an integer value
        FileReader fr = new FileReader(f2);
//        System.out.println(fr.read()); // prints the ascii value of the integer
//        System.out.println((char)fr.read()); // prints the first value in character type

//        To print the whole file
        int i = fr.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }
        fr.close();
    }
}
