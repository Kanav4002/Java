import java.util.Scanner;

class Fibonacci {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int a = 0, b = 1, c;
    System.out.print(a + " " + b + " ");
    for(int i = 2; i < n; i++) {
      c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
    }
    System.out.println();

    input.close();
  }
}
