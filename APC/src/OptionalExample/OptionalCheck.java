package OptionalExample;

import java.util.Optional;

public class OptionalCheck {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Java");

        if (opt.isPresent()) {
            System.out.println("Value is : " + opt.get());
        } else {
            System.out.println("No value");
        }

        Optional<String> empty = Optional.empty();
        if (empty.isPresent()) {
            System.out.println("Value is : " + opt.get());
        } else {
            System.out.println("No value");
        }
    }
}
