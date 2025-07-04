import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap where keys are Strings and values are Integers
        Map<String, Integer> ageMap = new HashMap<>();

        // 1. put(key, value): Adds a key-value pair to the HashMap
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);
        ageMap.put("Alice", 31); // Overwrites the previous value for "Alice"
        ageMap.put(null, 0);     // Allows one null key
        ageMap.put("David", null); // Allows null values

        System.out.println("Age Map: " + ageMap);
        // Output (order may vary): {null=0, Alice=31, Bob=25, Charlie=35, David=null}

        // 2. get(key): Retrieves the value associated with the key
        Integer aliceAge = ageMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge); // Output: 31

        Integer eveAge = ageMap.get("Eve");
        System.out.println("Eve's age: " + eveAge);   // Output: null (key not found)

        Integer nullKeyValue = ageMap.get(null);
        System.out.println("Value for null key: " + nullKeyValue); // Output: 0

        // 3. containsKey(key): Checks if the HashMap contains the specified key
        boolean hasBob = ageMap.containsKey("Bob");
        System.out.println("Contains Bob? " + hasBob); // Output: true

        boolean hasEve = ageMap.containsKey("Eve");
        System.out.println("Contains Eve? " + hasEve); // Output: false

        // 4. containsValue(value): Checks if the HashMap contains the specified value
        boolean hasAge30 = ageMap.containsValue(30);
        System.out.println("Contains age 30? " + hasAge30); // Output: false

        boolean hasAge25 = ageMap.containsValue(25);
        System.out.println("Contains age 25? " + hasAge25); // Output: true

        boolean hasNullValue = ageMap.containsValue(null);
        System.out.println("Contains null value? " + hasNullValue); // Output: true

        // 5. size(): Returns the number of key-value pairs in the HashMap
        int size = ageMap.size();
        System.out.println("Size of the map: " + size); // Output: 5

        // 6. isEmpty(): Checks if the HashMap is empty
        boolean isEmpty = ageMap.isEmpty();
        System.out.println("Is map empty? " + isEmpty); // Output: false

        // 7. remove(key): Removes the entry with the specified key
        Integer removedAge = ageMap.remove("Bob");
        System.out.println("Removed Bob's age: " + removedAge); // Output: 25
        System.out.println("Age Map after removal: " + ageMap);
        // Output (order may vary): {null=0, Alice=31, Charlie=35, David=null}

        boolean removedNullKey = ageMap.remove(null, 0); // remove(key, value): Removes only if key is present and mapped to the specified value
        System.out.println("Removed null key successfully? " + removedNullKey); // Output: true
        System.out.println("Age Map after removing null key: " + ageMap);
        // Output (order may vary): {Alice=31, Charlie=35, David=null}

        // 8. clear(): Removes all entries from the HashMap
        ageMap.clear();
        System.out.println("Age Map after clear(): " + ageMap); // Output: {}
        System.out.println("Is map empty now? " + ageMap.isEmpty()); // Output: true
    }
}