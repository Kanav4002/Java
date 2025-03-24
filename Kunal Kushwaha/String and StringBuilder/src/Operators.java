import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // Calling the toString() method to convert int or an object to string
        System.out.println('a' + 'b'); // Adding the ASCII Value
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 5);
        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));
        // + only works with primitives, it can work with complex objects but only when one is of type String
//        System.out.println(new ArrayList<>() + new Integer(56));
        System.out.println(new ArrayList<>() + "" + new Integer(56));

    }
}
