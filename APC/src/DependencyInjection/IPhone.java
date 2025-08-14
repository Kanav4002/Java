package DependencyInjection;

public class IPhone {
    private final Phone p;
    public IPhone(Phone p) {
        this.p = p;
    }
    void security() {
        System.out.println("SECURE");
    }
    void features() {
        p.calling();
        p.sms();
    }
}
