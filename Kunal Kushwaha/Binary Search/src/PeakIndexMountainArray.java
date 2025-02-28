public class PeakIndexMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        peakIndexInMountainArray(arr);
    }
}
