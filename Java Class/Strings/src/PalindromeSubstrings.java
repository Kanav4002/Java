import java.util.Scanner;

public class PalindromeSubstrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j < str.length(); j++) {
        if(isPalindrome(str.substring(i, j))) {
          count++;
        }
      }
    }


    // For odd length substrings
    
    // // For even length substrings
    // for(int start = 0; start < str.length() - 1; start++) {
    //   for(int end = start + 1; end < str.length(); end++) {
    //     if((end - start) % 2 != 0) { // Check for even length substrings
    //       String substring = str.substring(start, end + 1);
    //       if(isPalindrome(substring)) {
    //         count++;
    //       }
    //     }
    //   }
    // }
    System.out.println("Number of palindrome substrings: " + count);
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
