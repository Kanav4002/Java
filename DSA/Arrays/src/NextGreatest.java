public class NextGreatest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 5, 9, 13, 11};
        nextGreatest(arr);
    }

    public static void nextGreatest(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
//            if(arr[i] == 0) {
//                arr[i] = -1;
//            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
