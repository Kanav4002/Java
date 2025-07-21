package com.Kanav.SingleLL;

import java.util.Scanner;

public class ArrayToLL {

    public static class Node {
        int data;
        Node next;  // Corrected from 'node' to 'next'

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
        int[] arr = {1, 2, 3, 4, 5};
        Node node = new Node(arr[2]);
        System.out.println(node.data);

//        System.out.print("Enter elements: ");
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }

//        Node head = constructLL(arr);
//        printLinkedList(head);
//        printReverseLinkedList(head);

        sc.close();
    }

    public static Node constructLL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printReverseLinkedList(Node head) {
        if(head == null) return;

        if(head.next != null) {
            printReverseLinkedList(head.next);
        }

        System.out.print(head.data + " -> ");
    }
}