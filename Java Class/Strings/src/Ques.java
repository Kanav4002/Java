import java.util.Scanner;

public class Ques {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    int n = str.length();

    // all substrings from any particular index
    // for (int i = 0; i < n; i++) {
    //     for (int j = i + 1; j <= n; j++) {
    //         System.out.println(str.substring(i, j));
    //     }
    //     System.out.println();
    // }

    // all substrings ending at any particular indesx
    for (int end = 1; end <= n; end++) {
      for(int start = 0; start < end; start++) {
          System.out.println(str.substring(start, end));
      }
    }

    input.close();
  }
}
