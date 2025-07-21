import java.util.Locale;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(isPalindrome(sb));
        sc.close();
    }

    static boolean isPalindrome (StringBuilder sb) {
        String str = sb.toString().toLowerCase();
        int left = 0, right = sb.length() - 1;

        while (left <= right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
