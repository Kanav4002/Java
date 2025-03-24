public class RotatedSortedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 6, 6, 7, 0, 1, 1, 2};
        System.out.println(findPivotWithDuplicates(arr));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

        // if you did not find a pivot, it means the array is not rotated
        if(pivot == -1) {
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found, you have 2 asc sorted arrays
        if(arr[pivot] == target) {
            return pivot;
        }

        if(target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if element at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates

                // NOTE: what if these elements at start and end were the pivot?
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // Left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
