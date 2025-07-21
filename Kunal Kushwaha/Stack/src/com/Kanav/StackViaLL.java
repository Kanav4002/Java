package com.Kanav;

import java.util.LinkedList;
//import java.util.Stack;

public class StackViaLL {
    Node head;
    Node tail;
    int size;

    private static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;

        if(head != null) {
            head.prev = node;
        }
        node.prev = null;
        head = node;

        if(tail == null) {
            tail = node;
        }
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        node.next = null;
        node.prev = tail;

        if(tail != null) {
            tail.next = node;
        }

        tail = node;

        if(head == null) {
            head = node;
        }
        size++;
    }

//    public void insertLast(int val) {
//        Node node = new Node(val);
//
//        if (head == null) {
//            head = node;
//            size++;
//            return;
//        }
//
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = node;
//        node.prev = temp;
//
//        size++;
//    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Push to top of stack (insert at head)
    public void push(int val) {
        insertFirst(val);
    }

    // Pop from top of stack (remove head)
    public int pop() {
        if (head == null) {
            throw new RuntimeException("Stack is empty!");
        }

        int val = head.value;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // list became empty
        }

        size--;
        return val;
    }

    // Peek top of stack
    public int peek() {
        if (head == null) {
            throw new RuntimeException("Stack is empty!");
        }
        return head.value;
    }



    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        StackViaLL list = new StackViaLL();
        list.push(10);
        list.push(15);
        list.push(20);
//        list.insertFirst(10);
//        list.insertFirst(20);
//        list.insertFirst(30);
//        list.insertFirst(40);
//        list.insertFirst(50);
//        list.insertLast(60);
//        list.insertLast(70);
//        list.insertLast(80);
//        list.insertLast(90);
//        list.insertLast(100);
        list.display();
        System.out.println(list.peek());
        System.out.println(list.isEmpty());
    }
}
