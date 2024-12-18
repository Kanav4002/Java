import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);

        input.close();
    }
}
