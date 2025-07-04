package com.kanav.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }

        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    public int remove() {
        int remove = data[--size];
        return remove;
    }

    // Here the size means the number of elements in the list
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(6);
//        list.add(9);
//        list.add(12);

        for (int i = 0; i < 15; i++) {
            list.add(2 * i);
        }

        System.out.println(list);

//        <Integer> is an example of generics: it helps the list giving it a type. Parameter
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Kanav");

//        If the list does not have generics
        ArrayList list4 = new ArrayList();
        list4.add("Kannan");
        list4.add(10);
        list4.add('a');

        
    }
}
