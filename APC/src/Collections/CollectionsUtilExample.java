package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilExample {
    public static void main(String[] args) {
        List<String> base = new ArrayList<>(List.of("a", "b", "c", "a", "b"));
        System.out.println("Freq of 'a': " + Collections.frequency(base, "a"));

        List<String> readOnly = Collections.unmodifiableList(base);
        System.out.println(readOnly);
        // readOnly.add("d"); // throws UnsupportedOperationException
    }
}
