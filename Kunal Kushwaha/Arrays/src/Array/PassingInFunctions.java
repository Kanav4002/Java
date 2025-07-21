package Array;

import java.util.Arrays;

public class PassingInFunctions {
  public static void main(String[] args) {
    // Strings are immutable in Java
    // Arrays are mutable in Java
    // Mutable means : changing the object
    int arr[] = {3, 6, 8, 12, 15};
    System.out.println(Arrays.toString(arr));
    func(arr);
    System.out.println(Arrays.toString(arr));

    String[] str = {"Kanav", "Kannan", "Krish", "Abhishek", "Daksh"};
    System.out.println(Arrays.toString(str));
    func1(str);
    System.out.println(Arrays.toString(str));
  }

  static void func(int[] arr) {
    arr[0] = 7;
  }

  static void func1(String[] str) {
    str[1] = "Jasleen";
  }
}
