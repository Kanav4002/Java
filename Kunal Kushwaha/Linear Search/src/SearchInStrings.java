import java.util.Arrays;
import java.util.Scanner;

public class SearchInStrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String str = input.nextLine();
    System.out.print("Enter the character to search in string : ");
    char target = input.next().charAt(0);
    System.out.println(searchString(str, target));
    System.out.println(searchString2(str, target));

    System.out.println(Arrays.toString(str.toCharArray()));
  }

  static boolean searchString2(String str, char target) {

    if(str.length() == 0) {
      return false;
    }

    for (char ch : str.toCharArray()) {
      if(ch == target) {
        return true;
      }
    }

    return false;
  }


  static boolean searchString(String str, char target) {

    if(str.length() == 0) {
      return false;
    }

    for(int i = 0; i < str.length(); i++) {
      if(target == str.charAt(i)) {
        return true;
      }
    }

    return false;
  }
}
