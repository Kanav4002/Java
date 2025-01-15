public class Main {
  public static void main(String[] args) {
    // String str = "Hello"; // String is immutable
    // str.concat("World!");
    // System.out.println(str); // Only Hello will print


    String str = "Hello";
    // String Methods

    // 1) length
    // str.length();
    System.out.println(str.length());


    // 2) char at
    // str.charAt();
    System.out.println(str.charAt(1));

    
    // 3) substring
    // str.substring();
    // its endIndex - 1
    System.out.println(str.substring(0, 4));


    // 4) compare
    // str.equals();
    System.out.println(str.equals("Hello"));
    System.out.println(str.equals("Helloo"));


    // 5) to uppercase
    // str.toUpperCase();
    System.out.println(str.toUpperCase());


    // 6) to lowercase
    // str.toLowerCase();
    System.out.println(str.toLowerCase());


    // 7) replace
    System.out.println(str.replace('H', 'W'));

    
    // 8) find sequence
    System.out.println(str.contains("hello"));
    System.out.println(str.contains("Hello"));
  }
}
