package HighOrderFunctions;

import java.util.function.Function;

public class ReturnFunctionHOF {
    // HOF: Returns a function that adds a fixed value
    static Function<Integer, Integer> createAdder(int fixed) {
        return (x) -> x + fixed; // Returns a lambda
    }

    public static void main(String[] args) {
        // Get a function that adds 5
        Function<Integer, Integer> addFive = createAdder(5);
        System.out.println((addFive.apply(10))); // 15

        // Get a function that adds 10
        Function<Integer, Integer> addTen = createAdder(10);
        System.out.println(addTen.apply(10)); // 20
    }
}
