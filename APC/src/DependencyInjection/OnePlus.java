package DependencyInjection;

public class OnePlus {
    private final IPhone i;
    public OnePlus(IPhone i) {
        this.i = i;
    }
    void camera() {
        System.out.println("HDR");
    }
    void features1() {
        i.features();
        i.security();
    }
}
