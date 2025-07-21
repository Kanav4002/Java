package Operators;

public class FindUnique {
    public static void main(String[] args) {
        /*
            if there is a pattern like: {2, -3, -2, 4, 3, 6, -4}
            add up all the elements, the sum remaining will be the ans
         */
        int[] arr = {2, 3, 2, 4, 3, 6, 4};
        System.out.println(ans(arr));
    }

    public static int ans(int [] arr) {
        int unique = 0;

        for (int n : arr) {
            unique = unique ^ n;
        }

        return unique;
    }
}
