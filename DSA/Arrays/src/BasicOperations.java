import java.util.*;

public class BasicOperations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array : " + Arrays.toString(arr));

        // Access Element
        System.out.println("Element at index 2 : " + arr[2]);

        // Update Element
        arr[2] = 10;
        System.out.println("Updated Array : " + arr[2]);

        // Insert Element (create new array)
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[newArr.length - 1] = 6;
        System.out.println("Array after insertion: " + Arrays.toString(newArr));

        // Delete Element (create new array)
        int[] smallerArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, smallerArr, 0, 2);
        System.arraycopy(arr, 3, smallerArr, 2, arr.length - 3);
        System.out.println("Array after deletion: " + Arrays.toString(smallerArr));

        // Search Element
        int searchElement = 10;
        boolean found = false;
        for(int num : arr) {
            if(num == searchElement) {
                found = true;
                break;
            }
        }
        System.out.println("Element " + searchElement + (found ? " found" : " not found"));

        // Sort array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Length array
        System.out.println("Length array: " + arr.length);
    }
}
