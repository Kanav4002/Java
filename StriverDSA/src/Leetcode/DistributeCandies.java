package Leetcode;
import java.util.HashSet;
import java.util.Set;
/*
    575
    https://leetcode.com/problems/distribute-candies/
 */
public class DistributeCandies {
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,3};
        int result = distributeCandies(arr);
        System.out.println(result);
    }
    static int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(n / 2, set.size());
    }
}
