import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculating Perimeter of Rectangle...");
        System.out.print("Enter first side : ");
        int A = input.nextInt();
        System.out.print("Enter second side : ");
        int B = input.nextInt();
        System.out.print("Enter third side : ");
        int C = input.nextInt();
        System.out.print("Enter fourth side : ");
        int D = input.nextInt();

        int Perimeter = A + B + C + D;
        System.out.println("Perimeter of the rectangle is : " + Perimeter);
    }
}
