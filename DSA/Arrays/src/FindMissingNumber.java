public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;
        System.out.print("Missing Number is: " + findMissingNumber(arr, n));
    }

    static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int sum = 0;

        for(int num : arr) {
            sum += num;
        }

        return expectedSum - sum;
    }
}
