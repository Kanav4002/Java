package com.Kanav;

public class DoublyLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        Node a1=null;
        while(temp!=null){
            a1=temp.prev;
            temp.prev=temp.next;
            temp.next=a1;
            prev=temp;
            temp=temp.prev;
        }
        return prev;
    }
    public static void displayrev(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(55);
        Node c=new Node(3);
        Node d=new Node(3);
        Node e=new Node(9);
        Node f=new Node(6);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=null;
        Node a1=reverse(a);
        displayrev(a1);
    }
}