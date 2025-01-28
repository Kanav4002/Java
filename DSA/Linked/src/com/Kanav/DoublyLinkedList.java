package com.Kanav;

class DoublyLinkedList {
    Node head;

    // Node class for a doubly linked list
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Method to insert a node at the end
    public void append(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        // Traverse to the last node
        while (last.next != null) {
            last = last.next;
        }

        // Set the next of the last node to the new node
        last.next = newNode;
        newNode.prev = last;
    }

    // Method to reverse the doubly linked list
    public void reverse() {
        Node temp = null;
        Node current = head;

        // Swap next and prev pointers of each node
        while (current != null) {
            // Swap next and prev for the current node
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;

            // Move to the next node (which is actually the previous node after swap)
            current = current.prev;
        }

        // After the loop, the head should be the last node
        if (temp != null) {
            head = temp.prev; // Head should now be the last node
        }
    }

    // Method to print the doubly linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the doubly linked list
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Append some nodes to the list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original list:");
        list.printList();

        // Reverse the list
        list.reverse();

        System.out.println("Reversed list:");
        list.printList();
    }
}