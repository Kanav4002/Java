import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = input.nextInt();

        System.out.println(n1 & n2);
        input.close();
    }
}
