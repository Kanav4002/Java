package FileOperation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Kanav", "buffer.txt");
        f1.createNewFile();
        FileWriter fw = new FileWriter(f1, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello, my name is Kanav");
        bw.write("Goodbye");
        bw.newLine(); // This method is only in BufferWriter
        bw.flush();
    }
}
