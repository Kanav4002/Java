class Node{
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class MiddleElement {
  public static void main(String[] args) {
    Node n1 = new Node(50);
    Node n2 = new Node(10);
    Node n3 = new Node(30);
    Node n4 = new Node(20);
    Node n5 = new Node(40);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    Node middle = findMiddle(n1);
    System.out.println(middle.data);
  }

  static Node findMiddle(Node head) {
    if(head == null) {
      return null;
    }

    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }
}
