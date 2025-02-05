// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestNumber {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'c';

        int result = nextGreatestLetter(arr, target);
        System.out.println("Ceiling of the target element (index) : " + result);
    }
}
