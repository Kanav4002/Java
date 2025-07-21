package FileOperation;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
//        System.out.println(f.exists());
        f.createNewFile();
//        System.out.println(f.exists());

        File f1 = new File("kanav.txt");
        f1.createNewFile();
//        System.out.println(f1.getAbsolutePath());
        f1.delete();

        File f2 = new File("Java");
        f2.mkdir();
//        System.out.println(f2.exists());

        File f3 = new File(f2, "java.txt");
        f3.createNewFile();

        File f4 = new File(f2, "cpp.txt");
        f4.createNewFile();
    }
}
