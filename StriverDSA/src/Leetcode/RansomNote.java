package Leetcode;
/*
    383
    https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
    static boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) return false;
            freq[c - 'a']--;
        }
        return true;
    }
}
