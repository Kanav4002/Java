package Hashing;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        hashing(str, sc);
    }
/*
    If all lowercase then 'a'
 */
//    static void hashing(String s, Scanner sc) {
//        int[] hash = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            hash[s.charAt(i) - 'a']++;
//        }
//
//        int q = sc.nextInt();
//        while(q-- > 0) {
//            char c = sc.next().charAt(0);
//            // fetch
//            System.out.println(hash[c - 'a']);
//        }
//    }

/*
    If all uppercase then 'A'
 */
//    static void hashing(String s, Scanner sc) {
//        int[] hash = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            hash[s.charAt(i) - 'A']++;
//        }
//
//        int q = sc.nextInt();
//        while(q-- > 0) {
//            char c = sc.next().charAt(0);
//            // fetch
//            System.out.println(hash[c - 'A']);
//        }
//    }

/*
    If there is no constraint, all from 256 characters will be selected
 */
    static void hashing(String s, Scanner sc) {
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            char c = sc.next().charAt(0);
            // fetch
            System.out.println(hash[c]);
        }
    }
}
