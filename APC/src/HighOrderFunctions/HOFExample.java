package HighOrderFunctions;

public class HOFExample {
    public static void main(String[] args) {
        HOFExample obj = new HOFExample(); // if method is non-static
//        obj.print();
//        HOFExample.print(); // if method is static
        System.out.println(obj.square(5));
    }

//    public void print() {
//        System.out.println("Kanav");
//    }

    public int square(int n) {
        return n * n;
    }
}

