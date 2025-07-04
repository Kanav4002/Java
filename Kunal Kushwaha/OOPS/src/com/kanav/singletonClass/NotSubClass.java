package com.kanav.singletonClass;
import com.kanav.access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(18, "Kanav");
        int n = obj.num;
    }
}
