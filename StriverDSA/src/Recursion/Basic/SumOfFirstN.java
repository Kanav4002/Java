package Recursion.Basic;

import java.util.Scanner;

public class SumOfFirstN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sum(N, 0); // i and sum
        sc.close();
    }

    static void sum(int i, int sum)
    {
        if (i < 1)
        {
            System.out.println(sum);
            return;
        }
        sum(i - 1, sum + i);
    }
}
