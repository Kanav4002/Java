import java.util.Scanner;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Hello");

    // length
    // System.out.println(str.length());

    // append
    // System.out.println(str.append(" Kanav"));
    // System.out.println(str);

    // char at index
    // str.charAt(2);
    System.out.println(str.deleteCharAt(2));

    // insert
    str.insert(2, 'a');
    str.insert(2, "abc");

    // set char
    str.setCharAt(2, 'a');

    // substring
    str.substring(2);
    str.substring(3, 7);

    // reverse
    System.out.println(str.reverse());

    // delete char
    System.out.println(str.delete(1, 3));

    // converts string builder to string
    str.toString();

    // convert string to string builder
    String s = "abc";
    StringBuilder sb = new StringBuilder(s);

    // input a string-builder

    Scanner input = new Scanner(System.in);
    String st = input.nextLine();
    StringBuilder sb1 = new StringBuilder(st);
  }
}
