package com.Kanav.SingleLL;

public class Main {
    Node head;
    int size;

    static class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void insertAtEnd(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            return;
        }

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtFirst(50);
        list.insertAtEnd(60);

        list.display();
    }
}
