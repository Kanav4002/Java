package com.Jan29;

public class StackUsingLinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    StackUsingLinkedList() {
        top = null;
        size = 0;
    }

    void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    int pop() {
        if(isEmpty()) {
            throw new IllegalStateException("Stack is Empty.");
        }
        int topData = top.data;
        top = top.next;
        size--;
        return top.data;
    }

    int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty: No top element");
        }
        return top.data;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node curr = top;

        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
            if(curr != null) System.out.print(" -> ");
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Is stack empty? : " + stack.isEmpty());
        System.out.println("Size of stack : " + stack.size());
        System.out.println("Popped element: " + stack.pop());

//        stack.pop();
//        stack.pop();
//        stack.pop();
//
//        System.out.println("Is stack empty? : " + stack.isEmpty());
    }
}