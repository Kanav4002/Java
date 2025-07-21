package com.Kanav;
import java.util.Scanner;

class SumOfAllDigits {
    public static void main(String[] args){
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0) {
            int N = sc.nextInt();
            System.out.println(sumOfDigits(N));
        }
        sc.close();
    }

    static int sumOfDigits(int n) {
        if(n < 0) return -sumOfDigits(-n);
        if(n == 0) return 0;
        if(n < 10) return n;

        return (n % 10) + sumOfDigits(n / 10);
    }
}