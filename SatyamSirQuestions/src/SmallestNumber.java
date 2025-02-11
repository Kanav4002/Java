public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, -13};
        int smallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println(smallest);
    }
}
