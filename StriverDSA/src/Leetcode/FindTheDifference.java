package Leetcode;
/*
    389
    https://leetcode.com/problems/find-the-difference/description/
 */
public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char result = findTheDifference(s, t);
        System.out.println(result);
    }
    static char findTheDifference(String s, String t) {
        int xor = 0;
        for (char c : s.toCharArray()) {
            xor ^= c;
        }
        for (char c : t.toCharArray()) {
            xor ^= c;
        }
        return (char)xor;
    }
}
