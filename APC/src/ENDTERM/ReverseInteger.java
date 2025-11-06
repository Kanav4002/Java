package ENDTERM;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = -324902;
        int result = reverse(num);
        System.out.println(result);
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Here we divide by 10 so it doesn't go beyond the 2147483647 and -214748364
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) return 0;

            rev = rev * 10 + digit;
        }

        return rev;
    }
}
