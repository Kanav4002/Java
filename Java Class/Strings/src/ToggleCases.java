import java.util.Scanner;

public class ToggleCases {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    StringBuffer sb = new StringBuffer();

    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if(ch >= 'a' && ch <= 'z') {
        sb.append((char) (ch - 32));
      } else if(ch >= 'A' && ch <= 'Z') {
        sb.append((char) (ch + 32));
      } else {
        sb.append(ch);
      }
    }
    System.out.println(sb.toString());

    input.close();
  }
}
