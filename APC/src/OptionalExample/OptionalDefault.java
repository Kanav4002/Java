package OptionalExample;

import java.util.Optional;

public class OptionalDefault {
    public static void main(String[] args) {
        String name = "Kanav";
        Optional<String> opt = Optional.ofNullable(name);

        String result = opt.orElse("Default Name");
        System.out.println(result);

        String name1 = null;
        Optional<String> opt1 = Optional.ofNullable(name);

        String result1 = opt.orElse("Default Name");
        System.out.println(result);
    }
}
