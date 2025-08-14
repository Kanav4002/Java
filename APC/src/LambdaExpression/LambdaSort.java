package LambdaExpression;

import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Alice", "Charlie");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);
    }
}
