package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add(1, "date");
        System.out.println(list); // insert at index 1
        list.set(2, "blueberry"); // replaces "banana"
        System.out.println(list.get(2)); // blueberry
        list.remove("date"); // remove by object
        System.out.println(list.size()); // 3
        List<String> sub = list.subList(1, 3); // view of range
        System.out.println(sub);
        String[] arr = list.toArray(new String[0]);
        for (String f : arr) System.out.print(f + " ");
    }
}
