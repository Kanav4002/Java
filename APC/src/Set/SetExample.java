package Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        /*
            Stores unique elements (no duplicates), order may or may not be preserved.
            Common implementation: 'HashSet', 'TreeSet', 'LinkedHashSet'.
        */

        Set<String> names = new HashSet<>();
        names.add("Kanav");
        names.add("Kannan");
        names.add("Kunal");
//        names.add("Kannan");
        System.out.println(names);
    }
}
