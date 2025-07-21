package com.Kanav.SingleLL;

public class ReverseLL {
    private Node head;
    private Node tail;
    private int size;

    public ReverseLL() {
        this.size = 0;
    }

    void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size++;
    }

    void insertLast(int val) {
        if(tail == null) {
            insertLast(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    void backwardPrint(Node head) {
        if (head == null) return;

        if (head.next != null) {
            backwardPrint(head.next);
        }

        System.out.print(head.value + " ");
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertLast(60);
        list.insertLast(70);
        list.insert(35, 3);
        list.display();
        System.out.println();
        list.backwardPrint(list.head);
    }
}
