package Recursion.BasicRecursionProblems;

import java.util.Scanner;

public class SumOfFirstNFunctional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = sum(N);
        System.out.println(result);
    }

    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
}
