package Lecture1;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 5;
        int result = fib(n);
        System.out.println(result);
    }
    static int fib (int n) {
        if (n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
