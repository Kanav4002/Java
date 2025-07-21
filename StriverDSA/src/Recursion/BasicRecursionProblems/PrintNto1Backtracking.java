package Recursion.BasicRecursionProblems;

import java.util.Scanner;

public class PrintNto1Backtracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        f(1, N);
        sc.close();
    }

    static void f(int i, int N) {
        if (i > N) return;
        f(i + 1, N);
        System.out.println(i);
    }
}
