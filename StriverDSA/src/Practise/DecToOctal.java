package Practise;

public class DecToOctal {
    public static void main(String[] args) {
        int[] arr = {8, 10, 64};
        for (int i : arr) {
            System.out.println(i + " -> " + Integer.toOctalString(i));
        }
    }
}
