package Lecture1;

public class FibonacciSeries {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println();
    }

    static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
