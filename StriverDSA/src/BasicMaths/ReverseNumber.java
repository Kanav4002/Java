package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int revNum = 0, digit;
        while(n > 0) {
            digit = n % 10;
            revNum = (revNum * 10) + digit;
            n = n / 10;
        }

        System.out.println(revNum);

        input.close();
    }
}
