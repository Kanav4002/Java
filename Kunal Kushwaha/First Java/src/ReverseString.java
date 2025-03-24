import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = str.length();
        String rev = "";

        for(int i = n - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        input.close();
    }
}
