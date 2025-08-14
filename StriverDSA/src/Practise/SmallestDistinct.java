package Practise;

public class SmallestDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] > firstMin && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second smallest distinct element exists.");
        } else {
            System.out.println("Second smallest distinct element is: " + secondMin);
        }
    }
}