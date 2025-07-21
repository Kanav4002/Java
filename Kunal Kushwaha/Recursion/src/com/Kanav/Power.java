package com.Kanav;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter exponent : ");
        int exp = sc.nextInt();
        int ans = power(base, exp);
        System.out.println(ans);
        sc.close();
    }

    public static int power(int base, int exp) {
        if(exp < 0) return -1;
        if(exp == 0) return 1;

        int halfpower = power(base, exp / 2);

        // to check if the exponent is even or odd
        if(exp % 2 == 0) {
            return halfpower * halfpower;
        } else {
            return base * halfpower * halfpower;
        }
    }
}
