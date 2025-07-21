package Collection;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(9);
        a.add(27);
        a.add(32);
        a.add(21);
        a.add(16);
        a.add(29);
//        a.add(9); // doesn't allow duplicates
        a.add(null);
        System.out.println(a);
    }

}