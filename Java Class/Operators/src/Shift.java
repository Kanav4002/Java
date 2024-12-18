public class Shift {
    public static void main(String[] args) {
        int a = 6;

        // Left shift by 1
        System.out.println("6 << 1 = " + (a << 1)); // Expected: 12

        // Left shift by 2
        System.out.println("6 << 2 = " + (a << 2)); // Expected: 24

        // Left shift by 3
        System.out.println("6 << 3 = " + (a << 3)); // Expected: 48

        // Right shift by 1
        System.out.println("6 >> 1 = " + (a >> 1)); // Expected: 3

        // Right shift by 2
        System.out.println("6 >> 2 = " + (a >> 2)); // Expected: 1

        // Right shift by 3
        System.out.println("6 >> 3 = " + (a >> 3)); // Expected: 0
    }
}