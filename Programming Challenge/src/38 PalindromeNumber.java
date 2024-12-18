import java.util.Scanner;

class PalindromeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int temp = n, rem, sum = 0;

    while(temp > 0) {
      rem = temp % 10;
      sum = sum * 10 + rem;
      temp = temp / 10;
    }

    if(sum == n) {
      System.out.println(n + " is a Palindrome Number.");
    } else {
      System.out.println(n + " is not a Palindrome Number.");
    }

    input.close();
  }
}
