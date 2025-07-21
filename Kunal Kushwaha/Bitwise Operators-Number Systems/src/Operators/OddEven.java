package Operators;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        /*
            If 2^0 place == 1: Odd
            else Even

            eg: 01101101 -> Odd

             if n & 1 == 1 => Odd
             else Even
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isOdd(n)) {
            System.out.println(n + " is odd");
        } else {
            System.out.println(n + " is even");
        }
    }

    public static boolean isOdd(int n) {
        return ((n & 1) == 1);
    }
}
