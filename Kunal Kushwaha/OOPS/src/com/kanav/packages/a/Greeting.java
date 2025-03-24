package com.kanav.packages.a;

// the message method in Message class, which is in package b is being access because the method is public
import static com.kanav.packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello Buddy");
        message();
    }
}
