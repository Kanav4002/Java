public class Unary {
    public static void main(String[] args) {
        // -, converts a positive value to a negative
        // pre increment, increments the value by 1 and then use it in our statement
        // pre decrement, decrements the value by 1 and them use it in our statement
        // post increment, use current value in the statement and then increment it by 1
        // post decrement, use current value in the statement and then decrement it by 1
        int x = 5;
        int y = -x;
        int z = -y;
        //System.out.println(z);

        int a = 5;
        a = a + 1;
        //System.out.println(a);
        a += 1;
        //System.out.println(a);

        System.out.println("Incrementing");
        int p = 5;
        System.out.println(p++); // used 5 and increased it to 6
        System.out.println(p);

        System.out.println(++p); // increased it to 7 and used 7
        System.out.println(p);

        System.out.println("Decrementing");
        int q = 10;
        System.out.println(--q); // 9
        System.out.println(q); // 9

        System.out.println(q--); // 9
        System.out.println(q); // 8
    }
}
