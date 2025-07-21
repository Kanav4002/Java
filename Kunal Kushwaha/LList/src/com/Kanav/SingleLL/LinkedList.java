package com.Kanav.SingleLL;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedList {
      private static Node convertToLL(int[] arr) {
          // head will always be the first element
          Node head = new Node(arr[0]);
          Node node = head;

          // traversing through array
          for (int i = 1; i < arr.length; i++) {
              Node temp = new Node(arr[i]);
              node.next = temp;
              node = temp;
          }
          return head;
      }

     public static void main(String[] args) {
         int[] arr = {1, 2, 3, 4, 5};
         Node head = convertToLL(arr);
//        System.out.println(head.data);
         Node temp = head;
         while(temp != null) {
             System.out.print(temp.data + " -> ");
             temp = temp.next;
         }
         System.out.println("END");
     }
}
