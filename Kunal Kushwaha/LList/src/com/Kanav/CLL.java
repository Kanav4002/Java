package com.Kanav;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public CLL(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value) {
        Node node = head;
        if(node == null) {
            return;
        }
        if(node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if(n.value == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while(node != head);

    }

    public void display() {
        Node node = head;
        if(head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while(node != head);
        }
        System.out.println("END");
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(8);
        list.insert(9);
        list.insert(2);
        list.insert(7);
        list.insert(17);
        list.display();
        list.delete(2);
        list.display();
    }
}
