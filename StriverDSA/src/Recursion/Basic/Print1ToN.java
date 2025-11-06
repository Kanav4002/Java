package Recursion.Basic;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n, 1);
    }

    static void print(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print(n, i + 1);
    }
}
