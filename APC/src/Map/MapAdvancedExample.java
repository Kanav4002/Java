package Map;

import java.util.HashMap;
import java.util.Map;

public class MapAdvancedExample {
    public static void main(String[] args) {
        String text = "apple banana apple cherry banana apple";
        Map<String, Integer> freq = new HashMap<>();
        for (String word : text.split(" ")) {
            freq.merge(word, 1, Integer::sum);
        }
        freq.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
