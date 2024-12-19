import java.util.Scanner;

class LoopPatterns {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = input.nextInt();
    
    // pattern1(n);
    // pattern2(n);
    pattern3(n);
    input.close();
  }

  public static void pattern1(int n) {
    for(int i = 0; i < n; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void pattern2(int n) {
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n - i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void pattern3(int n) {
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for(int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
