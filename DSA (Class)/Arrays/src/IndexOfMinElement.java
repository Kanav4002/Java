import java.util.Scanner;

public class IndexOfMinElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = input.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter elements in the array : ");
    for(int i = 0; i < size; i++) {
      arr[i] = input.nextInt();
    }

    int index = 0;
    for(int i = 1; i < size; i++) {
      if(arr[i] < arr[index]) {
        index = i;
      }
    }
    System.out.println("The index of the minimum element is: " + index);

    input.close();
  }
}
