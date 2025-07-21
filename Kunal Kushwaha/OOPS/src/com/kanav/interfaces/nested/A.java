package com.kanav.interfaces.nested;

public class A {
    // nested interfaces
    public interface NestedInterfaces {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterfaces {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
