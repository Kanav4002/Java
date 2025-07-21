package LambdaExpression;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
//        Interf i = new Interf();
//        Interf i = (int n)-> System.out.println(n * n);
//        i.m1(5);

//        Interf j = (int a, int b) -> System.out.println(a + b);
//        j.add(10, 20);

//        Interf k = (int x, int y) -> System.out.println(x - y);
//        k.minus(20, 30);

//        Interf l = (int b, int c) -> System.out.println(b * c);
//        l.multi(10, 30);

//        Interf m = (int n, int o) -> System.out.println(n / o);
//        m.div(200, 8);

        Predicate<Integer> p = (a) -> a % 2 == 0;
        System.out.println(p.test(10));
    }
}
