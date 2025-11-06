package ENDTERM;

import java.util.Scanner;

public class DeliveryProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of delivered packages : ");
        int n = sc.nextInt();

        System.out.print("Enter the delivered packages in increasing order : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the k-th missing number : ");
        int k = sc.nextInt();

        int missingCount = 0;
        int currentID = 1;
        int i = 0;

        while (true) {
            if (i < n && arr[i] == currentID) {
                i++;
            } else {
                missingCount++;
                if (missingCount == k) {
                    System.out.println(currentID);
                    break;
                }
            }
            currentID++;
        }

        sc.close();
    }
}
