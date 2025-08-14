package DependencyInjection;

public class Main {
    public static void main(String[] args) {
        Phone p = new Phone();
        IPhone i = new IPhone(p);
        OnePlus one = new OnePlus(i);
        Nokia k = new Nokia(one);
        System.out.println("Iphone class accessing Phone features");
        i.features();
        System.out.print("\nOnePlus class accessing IPhone features");
        one.features1();
        System.out.println("\nNokia class accessing OnePlus features");
        k.features2();
    }
}