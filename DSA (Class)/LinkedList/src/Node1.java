import java.util.Scanner;
public class Node1 {
  int data;
  Node1 next;

  Node1(int data) {
    this.data = data;
    this.next = null;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Node1 n1 = new Node1(5);
    Node1 n2 = new Node1(2);
    Node1 n3 = new Node1(15);
    Node1 n4 = new Node1(12);
    Node1 n5 = new Node1(14);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    int target = input.nextInt();
    for (Node1 current = n1; current != null; current = current.next) {
      if (current.data == target) {
          if (current.next != null) {
              System.out.println(current.next.data);
          } else {
              System.out.println("-1");
          }
          input.close();
          return;
      }
    }
    System.out.println(-2);
    input.close();
  }
}
