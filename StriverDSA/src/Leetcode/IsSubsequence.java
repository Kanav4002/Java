package Leetcode;
/*
    392
    https://leetcode.com/problems/is-subsequence/description/
 */
public class IsSubsequence {
    public static void main(String[] args) {
        String sub = "abc";
        String main = "ahbgdc";
        boolean result = isSubsequence(sub, main);
        System.out.println(result);
    }
    static boolean isSubsequence(String sub, String main) {
        int i = 0, j = 0;
        while (i < sub.length() && j < main.length()) {
            if (sub.charAt(i) == main.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == sub.length();
    }
}
