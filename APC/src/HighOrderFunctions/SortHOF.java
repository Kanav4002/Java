package HighOrderFunctions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortHOF {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "apple", "cherry");

        // HOF: Pass a comparator lambda for alphabetical sort
        Collections.sort(fruits, (a, b) -> a.compareTo(b));
        System.out.println("Sorted: " + fruits); // Sorted: [apple, banana, cherry]

        // Pass another lambda for reverse sort
        Collections.sort(fruits, (a, b) -> b.compareTo(a));
        System.out.println("Reverse Sorted: " + fruits); // [cherry, banana, apple]
    }
}
