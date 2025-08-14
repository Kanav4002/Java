package DependencyInjection;

public class Nokia {
    private final OnePlus k;
    public Nokia(OnePlus k) {
        this.k = k;
    }
    void unbreakable() {
        System.out.println("NO DMG");
    }
    void features2() {
        k.features1();
        k.camera();
    }
}
