class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}


public class LinkedList {

  Node head;

  LinkedList(){
    this.head = null;
  }

  public void insertStart(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  public void insertEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  public void insertAtPos(int data, int pos) {
    Node newNode = new Node(data);
    if (pos == 0) {
      newNode.next = head;
      head = newNode;
    } else {
      Node temp = head;
      for (int i = 0; i < pos - 1 && temp != null; i++) {
        temp = temp.next;
      }
      if (temp != null) {
        newNode.next = temp.next;
        temp.next = newNode;
      }
    }
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public void deleteAtStart() {
    if (head != null) {
      head = head.next;
    }
  }

  public void deleteAtEnd() {
    if (head != null) {
      if (head.next == null) {
        head = null;
      } else {
        Node temp = head;
        while (temp.next.next != null) {
          temp = temp.next;
        }
        temp.next = null;
      }
    }
  }

  public void deleteAtPos(int pos) {
    if (head != null) {
      if (pos == 0) {
        head = head.next;
      } else {
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
          temp = temp.next;
        }
        if (temp != null && temp.next != null) {
          temp.next = temp.next.next;
        }
      }
    }
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertEnd(1);
    list.insertEnd(2);
    list.insertEnd(3);
    list.insertEnd(4);
    list.insertEnd(5);
    list.display();
    list.deleteAtPos(2);
    list.display();
  }
}
