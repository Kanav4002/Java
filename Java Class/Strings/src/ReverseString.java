import java.util.Scanner;
public class ReverseString {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    int n = str.length();
    String rev = "";
    
    for(int i = 0; i < n; i++) {
      rev = str.charAt(i) + rev;
    }
    System.out.println("Reverse string is : " + rev);
  }
}
