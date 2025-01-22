import java.util.Scanner;

public class PalindromeSubstrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    int count = 0;
    for(int start = 0; start < str.length(); start++) {
      for(int end = start; end < str.length(); end++) {
        String substring = str.substring(start, end + 1);
        if(isPalindrome(substring)) {
          count++;
        }
      }
    }
    System.out.println("Number of palindrome substrings: " + count);
    input.close();
  }

  static boolean isPalindrome(String str) {
    int i = 0, e = str.length() - 1;

    while (i < e) {
      if (str.charAt(i) != str.charAt(e)) {
        return false;
      }
      i++;
      e--;
    }
    return true;
  }
}
