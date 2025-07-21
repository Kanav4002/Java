package com.Kanav;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(evenDigits(n));
        sc.close();
    }

    public static int evenDigits(int n) {
        if(n == 0) return 0;
        int lastDigit = n % 10;
        int rest = evenDigits(n / 10);

        if (lastDigit % 2 == 0) {
            return rest * 10 + lastDigit;
        } else {
            return rest;
        }
    }
}
