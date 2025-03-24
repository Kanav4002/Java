package BasicMaths;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int revNum = 0;
        while(n > 0) {
            int digit = n % 10;
            revNum = (revNum * 10) + digit;
            n = n / 10;
        }

        if(revNum == temp) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }

        input.close();
    }
}
