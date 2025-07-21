package com.Kanav;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0) {
            int N = sc.nextInt();
            primeFactors(N, 2); // Call the function to print factors
        }

        sc.close();
    }

    static void primeFactors(int n, int i) {
        if (n < 2) return; // Base case: Stop when n is reduced to 1

        if (n % i == 0) { // If i is a factor, print it
            System.out.println(i);
            primeFactors(n / i, i); // Continue with the same factor
        } else {
            primeFactors(n, i + 1); // Move to the next number
        }
    }
}