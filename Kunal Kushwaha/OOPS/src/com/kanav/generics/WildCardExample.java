package com.kanav.generics;

import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public WildCardExample() {
        data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {
        // do something

        // here you can only pass type Number
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }

        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public T remove() {
//        Here we typecasted this because we are giving something bigger to a smaller space
        T remove = (T)(data[--size]);
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
        WildCardExample list = new WildCardExample();
//        list.add(3);
//        list.add(6);
//        list.add(9);
//        list.add(12);

//        for (int i = 0; i < 15; i++) {
//            list.add(2 * i);
//        }
//
//        System.out.println(list);

//        <Integer> is an example of generics: it helps the list giving it a type. Parameter
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(10);
//
//        ArrayList<String> list3 = new ArrayList<>();
//        list3.add("Kanav");

//        If the list does not have generics
//        ArrayList list4 = new ArrayList();
//        list4.add("Kannan");
//        list4.add(10);
//        list4.add('a');

        WildCardExample<Integer> list5 = new WildCardExample<>();
        for (int i = 0; i < 15; i++) {
            list5.add(2 * i);
        }
        System.out.println(list5);
    }
}
