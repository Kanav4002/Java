package com.Jan29;

import java.util.Stack;

public class MyStack {
    private int[] arr;
    private int index = -1;

    MyStack() {
        arr = new int[20];
    }

    MyStack(int size) {
        arr = new int[size];
    }

    public void push(int item) {
        if(isFull()) {
            throw new IllegalStateException("Stack is empty.");
        }

        index++;
        arr[index] = item;
    }

    public int peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return arr[index];
    }

    public int pop() {
        if(isEmpty()) {
            throw new IllegalStateException("Stack is already full");
        }

        int top = peek();
        index--;
        return top;
    }

    public int size() {
        return index + 1;
    }

    public boolean isEmpty() {
        return index == -1;
//        if(index == -1) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public boolean isFull() {
        return index == arr.length;
    }

    public void display() {
        for(int i = index; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
