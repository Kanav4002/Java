package Recursion.BasicRecursionProblems;

import java.util.Scanner;
/*
    TC : O(n)
    SC : O(n)
*/
public class PrintName5Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printName(1, n);
    }

    static void printName(int i , int n) {
        if (i > n) {
            return;
        }
        System.out.println("Kanav");
        printName(i + 1, n);
    }
}
