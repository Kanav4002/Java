import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = str.length();
        String rev = "";

        for(int i = 0; i < n; i++) {
            rev = str.charAt(i) + rev;
        }

        if(rev.equals(str)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
        input.close();
    }
}
