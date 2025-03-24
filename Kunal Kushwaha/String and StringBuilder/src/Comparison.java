public class Comparison {
    public static void main(String[] args) {
//        String a = "Kanav";
//        String b = "Kanav";
//        System.out.println(a == b);

        // How to create different objects of same value
        String a = new String("Kanav");
        String b = new String("Kanav");

        // When you only need to check values, use .equals method
        // == is a comparator
//        System.out.println(a == b);
        // .equals is a method
//        System.out.println(a.equals(b));

        System.out.println(a.charAt(0));
    }
}
