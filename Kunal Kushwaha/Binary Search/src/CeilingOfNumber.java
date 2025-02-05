public class CeilingOfNumber {
    public static int ceiling(int[] arr, int target) {
        if(target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;

        int result = ceiling(arr, target);
        System.out.println("Ceiling of the target element (index) : " + result);
    }
}
