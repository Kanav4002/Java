import java.util.Scanner;

class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int rem, temp = 0, original = n;
    while(n > 0) {
      rem = n % 10;
      temp = temp + rem * rem * rem;
      n = n / 10;
    }
    
    if(temp == original) {
      System.out.println(original + " is an Armstrong Number.");
    } else {
      System.out.println(original + " is not an Armstrong Number.");
    }

    input.close();
  }
}
