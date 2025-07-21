package HashMaps;

import java.util.*;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character, Integer> result = countOccuerence(str);
        System.out.println(result);
    }

    public static Map<Character, Integer> countOccuerence(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charCounts.containsKey(currentChar)) {
                int currentCount = charCounts.get(currentChar);
                charCounts.put(currentChar, currentCount + 1);
            } else {
                charCounts.put(currentChar, 1);
            }
        }
        return charCounts;
    }
}
