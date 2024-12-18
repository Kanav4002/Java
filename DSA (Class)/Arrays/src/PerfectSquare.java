import java.sql.SQLOutput;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();

        int squareRoot = -1;
        for(int i = 0; i <= n; i++) {
            if(i * i == n) {
                squareRoot = i;
                break;
            }
        }

        if(squareRoot != -1) {
            System.out.println(squareRoot);
        } else {
            System.out.println("-1");
        }

        input.close();
    }
}
