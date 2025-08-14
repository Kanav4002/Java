package FileOperation;

import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Kanav", "printer.txt");
        f1.createNewFile();
        FileWriter fw = new FileWriter(f1, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("Hello");
        pw.printf("My name is %s", "Kanav");
        bw.newLine();
        pw.printf("My age is %d", 20);
        bw.newLine();
        pw.flush();
    }
}
