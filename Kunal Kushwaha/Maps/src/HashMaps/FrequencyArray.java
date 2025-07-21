package HashMaps;

import java.util.*;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = countFrequency(arr);
        System.out.println(result);
        sc.close();
    }

    public static int countFrequency(int[] arr) {
        Map<Integer, Integer> integerCount = new HashMap<>();


        return integerCount;
    }
}
