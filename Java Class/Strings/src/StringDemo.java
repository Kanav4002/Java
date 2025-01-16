public class StringDemo {
  public static void main(String[] args) {
    // Syntax:
    // String str = new String("Hello");
    // System.out.println(str);
    String str1 = "Hello"; // creates string in string pool
    String str2 = new String("Hello"); // creates string in heap
    // String str3 = new String("Hello");

    System.out.println("String 1 : " + str1);
    System.out.println("String 1 : " + str2);

    // compare
    System.out.println(str1.equals(str2)); // char by char compare
    System.out.println(str1 == str2);  // checks reference, str1 has a different reference as well as str2

    String str3 = "Hello";
    System.out.println(str2 == str3);
    // System.out.println(str2.equals(str3));

  } 
}
