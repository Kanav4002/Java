package BasicMaths;

import java.awt.*;
import java.util.Scanner;

import static java.lang.Math.min;

public class GCD {
//    Bruteforce method
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int gcd = 1;
//        for (int i = min(num1, num2); i >= 0; i--) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                gcd = i;
//                break;
//            }
//        }
//        System.out.println(gcd);
//        sc.close();
//    }

//    Euclidean Formula
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        while (num1 > 0 && num2 > 0) {
//            if (num1 > num2) {
//                num1 = num1 % num2;
//            } else {
//                num2 = num2 % num1;
//            }
//        }
//
//        if (num1 == 0) {
//            System.out.println(num2);
//        } else {
//            System.out.println(num1);
//        }
//
//        sc.close();
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = gcd(num1, num2);
        System.out.println(result);
        sc.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
