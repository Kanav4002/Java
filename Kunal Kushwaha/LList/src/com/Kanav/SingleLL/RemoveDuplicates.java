package com.Kanav.SingleLL;

public class RemoveDuplicates {
    ListNode head;
    int size;

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertAtFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        size++;
    }

    public void display() {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicates list = new RemoveDuplicates();
        list.insertAtFirst(1);
        list.insertAtFirst(1);
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(4);
        list.insertAtFirst(4);
        list.display();
    }
}
