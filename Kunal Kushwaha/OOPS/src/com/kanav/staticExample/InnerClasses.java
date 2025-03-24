package com.kanav.staticExample;

// Outer classes cannot be static
public class InnerClasses {
    // Only the inner classes can be static
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test obj = new Test("Kanav");
        Test obj2 = new Test("Kannan");

        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}

//static class OutsideClass {
//
//}