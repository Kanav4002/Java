package String;

import java.util.*;

class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if (isIsomorphic(s, t)) {
            System.out.println("Isomorphic");
        } else {
            System.out.println("Non - Isomorphic");
        }
    }

    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!map.containsKey(original)) {
                if (!map.containsValue(replacement)) {
                    map.put(original, replacement);
                } else {
                    return false;
                }
            } else {
                char mappedCharacter = map.get(original);
                if (mappedCharacter != replacement) {
                    return false;
                }
            }
        }

        return true;
    }
}