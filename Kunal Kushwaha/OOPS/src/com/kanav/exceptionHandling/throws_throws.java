package com.kanav.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throws_throws {
    static void function() throws FileNotFoundException {
        FileReader file = new FileReader("text.txt");

        try {
            int[] arr = new int[2];
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }

    }

    public static void main(String[] args) {
        try {
            function();
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
