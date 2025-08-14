package HighOrderFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

interface Interface {
    void m2(int n);
}

public class ListOfSquares {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        System.out.print("Original List : ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        Function<Integer, Integer> f = (n) -> n * n;
        ListOfSquares obj = new ListOfSquares();
        System.out.print("Squared List : ");
        System.out.println(obj.square(f, list));
    }

    public ArrayList<Integer> square(Function<Integer, Integer> f, List<Integer> list) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i : list) {
            ar.add(f.apply(i));
        }
        return ar;
    }
}
