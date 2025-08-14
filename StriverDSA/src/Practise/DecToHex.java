package Practise;

public class DecToHex {
    public static void main(String[] args) {
        int[] arr = {10, 15, 255};
        for (int i : arr) {
            System.out.println(i + " -> " + Integer.toHexString(i).toUpperCase());
        }
    }
}
