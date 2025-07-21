package Recursion.BasicRecursionProblems;

import java.util.Scanner;

public class Print1ToNBackTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        f(N, N);
        sc.close();
    }

    static void f(int i, int N) {
        if (i < 1) return;
        f(i - 1, N);
        System.out.println(i);
    }
}
