package Operators;

public class Main {
    public static void main(String[] args) {
        /*
            Left Shift (<<): doubles the output
           [a << b = a * 2^b]
           [a << 1 = 2a]

           Right Shift (>>) :
           [a >> b = a / 2^b]
         */
        long n = 5;
        System.out.println(n << 1);
        System.out.println(2 << 4);

        System.out.println(n >> 1);
        System.out.println(10 >> 2);
        System.out.println(15 >> 3);


    }
}
