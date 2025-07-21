package Recursion.BasicRecursionProblems;

import java.util.Scanner;

public class PalindromeString {
//    Recursive
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (checkPalindrome(str, 0)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not Palindrome");
        }
    }

    public static boolean checkPalindrome(String str, int i) {
        int n = str.length();
        if (i >= n / 2) return true;
        if(str.charAt(i) != str.charAt(n - i - 1)) return false;
        return checkPalindrome(str, i + 1);
    }

//    Two Pointer
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        if (checkPalindrome(str)) {
//            System.out.println(str + " is Palindrome");
//        } else {
//            System.out.println(str + " is not Palindrome");
//        }
//    }
//    public static boolean checkPalindrome(String str) {
//        int left = 0, right = str.length() - 1;
//        while(left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
}
