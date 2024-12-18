import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = input.nextInt();
        int m = (n + 1) / 2;
        int starts = 1;

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = m - 1; i > 0; i--) {
            for(int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}