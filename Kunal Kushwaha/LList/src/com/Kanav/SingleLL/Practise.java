package com.Kanav.SingleLL;

public class Practise {
    public Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to print the linked list
    public void display() {
        Node curr = head;

        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("END");
    }

    // Method to insert a new node at the beginning
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    // Method to insert a new node at the end
    public void insertAtEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public static void main(String[] args) {
        Practise list = new Practise();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtFirst(50);
        list.display();
    }
}
