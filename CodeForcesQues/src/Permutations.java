import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuilder oddStr = new StringBuilder(n);
        StringBuilder evenStr = new StringBuilder(n);

        if(n == 1 ) {
            System.out.println(1);
        } else if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            for(int i = 2; i <= n; i += 2) {
                evenStr.append(i).append(" ");
            }
            for(int i = 1; i <= n; i += 2) {
                oddStr.append(i).append(" ");
            }
        }
        System.out.print(evenStr.toString());
        System.out.print(oddStr.toString());

        input.close();
    }
}
