import java.util.Scanner;

class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        boolean isPrime = true;

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not Prime");
        }

        input.close();
    }
}
