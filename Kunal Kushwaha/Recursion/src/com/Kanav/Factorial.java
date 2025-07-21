package com.Kanav;

import java.util.Scanner;

class Recursion {
    static int factorial(int n) {
        // base condition
        if (n < 2) return 1;

        return n * factorial(n - 1);
    }
}

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            System.out.println(Recursion.factorial(n));
        }

        sc.close();
    }
}
