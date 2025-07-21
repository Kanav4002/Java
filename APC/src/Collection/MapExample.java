package Collection;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
//        TreeSet<Integer> ts = new TreeSet<>();
//        HashSet<Integer> hs = new HashSet<>();
//        ArrayList<Integer> ar = new ArrayList<>();
        map.put(1, "Kanav");
        map.put(2, "Kannan");
        System.out.println(map);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(3, "Abhishek");
        map1.put(4, "Shreya");
        map.putAll(map1);
        System.out.println(map);
    }
}
