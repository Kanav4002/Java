package Hashing;

public class FindFrequency {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 2};
        int num = 1;
        int result = search(a, num);
        System.out.println(result);
    }
    static int search(int[] arr, int number) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] == number) {
                count++;
            }
        }
        return count;
    }
}
