public class SortArrayInN {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2};

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
