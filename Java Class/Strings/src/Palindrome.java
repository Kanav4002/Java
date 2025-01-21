import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    // String reversedStr = new StringBuilder(str).reverse().toString();
    // if (str.equals(reversedStr)) {
    //   System.out.println("The string is a palindrome.");
    // } else {
    //   System.out.println("The string is not a palindrome.");
    // }

    // boolean isPalindrome1 = true;
    // int i = 0, e = str.length() - 1;
    // for(; i < e; i++, e--) {
    //   if(str.charAt(i) != str.charAt(e)) {
    //     isPalindrome1 = false;
    //     break;
    //   }
    // }

    // if hypothesis is false
    boolean isPalindrome = false;
    int i = 0, e = str.length() - 1;
    for(; i < e; i++, e--) {
      if(str.charAt(i) != str.charAt(e)) {
        isPalindrome = false;
        break;
      }
    }

    if(i >= e) {
      isPalindrome = true;
    }

    if(isPalindrome) {
      System.out.println("String is palindrome");
    }
  }
}
 