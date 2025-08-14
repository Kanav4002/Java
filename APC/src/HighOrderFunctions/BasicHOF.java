package HighOrderFunctions;

@FunctionalInterface
interface MathOperation {
    int apply(int a, int b);
}

public class BasicHOF {
    // HOF: Takes two ints and a function (MathOperation)
    static int operate(int x, int y, MathOperation op) {
        return op.apply(x, y); // Applies the passed function
    }

    public static void main(String[] args) {
        // Pass addition as a lambda
        int sum = operate(5, 3, (a, b) -> a + b);
        System.out.println("Sum: " + sum); // Sum: 8

        // Pass multiplication as a lambda
        int product = operate(5, 3, (a, b) -> a * b);
        System.out.println("Product: " + product); // Product: 15
    }
}
