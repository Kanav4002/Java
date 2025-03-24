public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Largest Element in array is: " + largestElement(arr));
        System.out.println("Smallest Element in array is: " + smallestElement(arr));
    }

    static int largestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    static int smallestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
