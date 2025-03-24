import java.io.FileNotFoundException;
import java.io.FileReader;

public class throw_throws {
    static void function() throws FileNotFoundException {
        FileReader file = new FileReader("Text.txt");

        int[] arr = new int[3];
        System.out.println(arr[4]);
    }

    public static void main(String[] args) {
        try {
            function();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
