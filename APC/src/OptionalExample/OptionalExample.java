package OptionalExample;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String s = "Ball";
        String s1 = "Kanav";
        System.out.println(s1.length());
//        System.out.println(s.length());
        Optional<String> obj = Optional.ofNullable(s);
        System.out.println(obj.orElse("Kanav"));
    }
}
