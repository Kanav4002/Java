package HighOrderFunctions;

public class HOFUsingLambda {
    public static void main(String[] args) {
//        Interf i = () -> System.out.println("m1 method is used");
//        i.m1();

        HOFUsingLambda obj = new HOFUsingLambda();
//        obj.print(i);
    }

    public void print(Interf i) {
//        i.m1();
        System.out.println("Print method is called");
    }
}
