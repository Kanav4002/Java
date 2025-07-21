package com.Kanav.SingleLL;

public class DeleteNode {
    private Node head;
    private Node tail;

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
    }

//    public static Node convertToLL(int[] arr) {
//        Node head = new Node(arr[0]);
//        Node node = head;
//
//        for (int i = 1; i < arr.length; i++) {
//            Node temp = new Node(arr[i]);
//            node.next = temp;
//            node = temp;
//        }
//
//        return head;
//    }

//    public static void display(Node head) {
//        Node temp = head;
//        while(temp != null) {
//            System.out.print(temp.value + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("END");
//    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void delete(Node head) {
        Node node = head;
        node.value = node.next.value;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        DeleteNode list = new DeleteNode();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        System.out.println("Before Deletion:");
        list.display();

        // Deleting the third node (value 30)
        delete(list.head.next.next);

        System.out.println("After Deletion:");
        list.display();
    }
}
