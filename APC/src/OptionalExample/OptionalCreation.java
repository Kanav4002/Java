package OptionalExample;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        Optional<String> present = Optional.of("Hello");
        Optional<String> absent = Optional.empty();
        Optional<String> maybe = Optional.ofNullable(null);
        System.out.println(present);
        System.out.println(absent);
        System.out.println(maybe);
    }
}
