public class StringSubstring {
    public static void main(String[] args) {
        String s = "abbacbcba";

        String longest = ""; // to store the longest unique-character substring

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (allCharactersUnique(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        System.out.println("Longest substring with all distinct characters: " + longest);
    }

    // Helper method to check if all characters in a string are unique
    static boolean allCharactersUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (current == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}