package HighOrderFunctions;

import java.util.*;

interface InterfaceX {
    void m1(int n);
}

class SquareList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        System.out.print("Original List : ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        SquareList obj = new SquareList();

        System.out.print("Squared List : ");
        InterfaceX j = (int n) -> System.out.print(n * n + " ");

        for (int num : list) {
            obj.squares(j, num);
        }
    }

    public void squares(InterfaceX j, int num) {
        j.m1(num);
    }
}