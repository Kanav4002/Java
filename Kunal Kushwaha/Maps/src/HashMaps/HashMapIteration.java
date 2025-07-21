package HashMaps;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Japan", "Tokyo");

//        System.out.println("Capitals are : " + countryCapitalMap);

//        1. Iterating through keys using keySet()
        System.out.print("\nKeys (Countries) : ");
        Set<String> keys = countryCapitalMap.keySet();
        for (String key : keys) {
            System.out.print(key + " ");
        }

//        2. Iterating through values using values()
        System.out.print("\nValues (Capitals) : ");
        for (String capital : countryCapitalMap.values()) {
            System.out.print(capital + " ");
        }
        System.out.println();

//        3. Iterating through entries (key-value pairs) using entrySet()
        System.out.print("\nEnteries : ");
        Set<Map.Entry<String, String>> entries = countryCapitalMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

//        4. Using forEach
        System.out.println("\nUsing forEach : ");
        countryCapitalMap.forEach((country, capital) -> System.out.println("Country: " + country + ", Capital: " + capital));

    }
}
