package com.Kanav;

public class DLL {
    Node head;
    Node tail;
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) { // Properly iterate through the list
            if (node.value == value) {
                return node; // Return node if found
            }
            node = node.next; // Move to the next node
        }
        return null; // Return null if not found
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if(p == null) {
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null) {
            node.next.prev = node;
        }
    }

    public void display() {
        Node node = head;
        Node last = null;

        while(node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        // printing in reverse order
//        while(last != null) {
//            System.out.print(last.value + " -> ");
//            last = last.prev;
//        }
//        System.out.println("START");
    }

    private static class Node  {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(55);
        list.insertFirst(44);
        list.insertFirst(33);
        list.insertFirst(22);
        list.insertFirst(11);
        list.insertLast(99);
        list.insert(44, 66);
        list.display();
    }
}
