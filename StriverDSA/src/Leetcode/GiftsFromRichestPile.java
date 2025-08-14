package Leetcode;
import java.util.*;
/*
    2558
    https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/
 */
public class GiftsFromRichestPile {
    public static void main(String[] args) {
        int[] arr = {25, 64, 9, 4, 100};
        int k = 4;
        long result = pickGifts(arr, k);
        System.out.println(result);
    }

    static long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            int maxIndex = 0;
            for (int j = 1; j < gifts.length; j++) {
                if (gifts[j] > gifts[maxIndex]) {
                    maxIndex = j;
                }
            }
            gifts[maxIndex] = (int)Math.floor(Math.sqrt(gifts[maxIndex]));
        }

        long sum = 0;
        for (int gift : gifts) {
            sum += gift;
        }

        return sum;
    }
}
