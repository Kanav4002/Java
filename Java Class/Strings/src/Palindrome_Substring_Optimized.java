import java.util.Scanner;

public class Palindrome_Substring_Optimized {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    int count = 0;
    // For odd substrings
    for(int start = 0; start < str.length() - 1; start++) {
      for(int end = start; end < str.length(); end++) {
        if((end - start) % 2 == 0) {
          String substring = str.substring(start, end + 1);
          if(isPalindrome(substring)) {
            count++;
          }
        }
      }
    }


    // For even substrings
    for(int i = 0; i < str.length() - 1; i++) {
      for(int j = i + 1; j < str.length(); j++) {
        String substring = str.substring(i, j + 1);
        if(isPalindrome(substring)) {
          count++;
        }
      }
    }


    System.out.println("Number of palindrome substring in str are : " + count);
    input.close();
  }

  static boolean isPalindrome(String str) {
    int left = 0, right = str.length() - 1;
    while(left < right) {
      if(str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }
}
