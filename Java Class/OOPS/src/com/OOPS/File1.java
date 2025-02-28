package com.OOPS;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class key_value {
    int key;
    int value;

    key_value(int key, int value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString() {
        return ("Key : " + key + " || value : " + value);
    }
}

public class File1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<KeyValue> arrayList = new ArrayList<>();
        KeyValue[] arr = new KeyValue[n];

        for(int i = 0; i < n; i++) {
            int key = input.nextInt();
            int value = input.nextInt();


        }

        input.close();
    }
}
