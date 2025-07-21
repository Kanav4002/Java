package com.kanav.exceptionHandling;

import java.util.*;

public class while_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;

        while (true) {
            try {
                b = sc.nextInt();
                System.out.println(a / b);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.print("Enter value again : ");
                b = sc.nextInt();
                System.out.println(a / b);
                break;
            }
        }
    }
}
