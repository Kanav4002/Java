package ExceptionHandling;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        File f1 = new File("file.txt");
        f1.createNewFile();

        FileWriter fw = new FileWriter(f1);
        fw.write("Hello World");

        fw.flush();

        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("IO Error: " + e);
        }
    }
}
