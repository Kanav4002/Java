import java.util.Scanner;
public class Node1 {
  int data;
  Node next;

  Node1(int data) {
    this.data = data;
    this.next = null;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Node n1 = new Node(5);
    Node n2 = new Node(2);
    Node n3 = new Node(15);
    Node n4 = new Node(12);
    Node n5 = new Node(14);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    int target = input.nextInt();
    for (Node current = n1; current != null; current = current.next) {
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
