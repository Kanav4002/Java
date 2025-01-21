import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Syntax
    ArrayList<Integer> list = new ArrayList<>(2);
    // list.add(10);
    // list.add(20);
    // list.add(30);
    // list.add(40);
    // list.add(50);
    // System.out.println(list.contains(30));
    // System.out.println(list.contains(60));
    // System.out.println(list.set(0, 99));
    // list.remove(2);
    // System.out.println(list);

    //input
    for(int i = 0; i < 5; i++) {
      list.add(input.nextInt());
    }

    // get item at any index
    for(int i = 0; i < 5; i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();

    // System.out.println(list);
  }
}
