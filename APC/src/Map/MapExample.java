package Map;

import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        /*
            Feature: Store key-value pairs, each key maps to one value.
            Common Implementation: 'HashMap', 'TreeMap', 'LinkedHashMap'
         */
        Map<String, Integer> age = new HashMap<>();
//        key, value
        age.put("Kanav" ,21);
        age.put("Kannan" ,20);
        age.put("Kunal" ,20);
        System.out.println(age.get("Kanav"));
//        System.out.println(age);

//        Iterating over map enteries
        for (Map.Entry<String, Integer> entry : age.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
