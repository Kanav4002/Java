package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        /*
            Type: Utility class with many static methods for manipulating collections
            Common Methods:
                'sort(List<T>)': Sorts a list
                'reverse(List<T>)': Reverses a list
                'shuffle(List<T>)': Randomizes list order
                'addAll(Collection<T>, T...)': Adds multiple elements
                'copy(List<T> dest, List<T> src)': Copies from src to dest
         */

        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "A", "B", "C");
        Collections.addAll(list, "C", "A", "B");
        System.out.println("Unsorted list: " + list);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        Collections.reverse(list);
        System.out.println("Reverse list: " + list);
    }
}
