package com.kanav.singletonClass;
import com.kanav.access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(18, "Kanav");
        int n = obj.num;
        System.out.println(obj instanceof Object);
    }
}

class SubSubClass extends SubClass {

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(18, "Kanav");
        int n = obj.num;
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(18, "Kanav");
        int n = obj.num;
    }
}

