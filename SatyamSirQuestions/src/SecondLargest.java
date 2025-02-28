import java.util.Arrays;

public class SecondLargest {
//    Optimized Solution
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > largest) {
                second_largest = largest;
                largest = num;
            } else if (num > second_largest && num != largest) {
                second_largest = num;
            }
        }

        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element : " + second_largest);
        }
    }

//    Brute Force Solution
//    public static void main(String[] args) {

//        int[] arr = {12, 35, 1, 10, 34, 1};
//        Arrays.sort(arr);
//        int secondLargest = arr[arr.length - 2];
//        System.out.println("Second largest element is : " + secondLargest);
//    }
}