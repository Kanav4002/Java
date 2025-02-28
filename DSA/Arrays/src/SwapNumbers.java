import java.util.Scanner;

public class SwapNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number : ");
    int n1 = input.nextInt();
    System.out.print("Enter second number : ");
    int n2 = input.nextInt();

    swapNumbers(n1, n2);

  }

  public static void swapNumbers(int n1, int n2) {
    n1 = n1 + n2;
    n2 = n1 - n2;
    n1 = n1 - n2;

    System.out.println("Swapped Numbers are : " + n1 + " and " + n2);
  }
}
