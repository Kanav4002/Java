public class TypeConversion {
    public static void main(String[] args) {
        // Implicit Conversion (Coercion) or Widening
        System.out.println("Implicit: ");
        float myFloat = 5L;
        System.out.println(myFloat);
        long big = 45;
        System.out.println(big);
        float dec = 3;
        System.out.println(dec);
        double d = 3.4f;
        System.out.println(d);

        System.out.println();

        // Explicit Conversion (Casting) or Narrowing
        System.out.println("Explicit: ");
        int myInt = (int) 5.45f;
        System.out.println(myInt);
        float eDec = (float) 3.4;
        System.out.println(eDec);
        long eBig = (long) 3.4;
        System.out.println(eBig);
        int eInt = (int)3.4;
        System.out.println(eInt);
    }
}
