package Lec_48_Mar_20_;

import java.util.Scanner;

public class toggleBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // creating mask (Number having 2nd, 4th, 5th, 8th, 11th bit 1)
        int mask = 0;
        for(int i=11 ; i>0 ; i--){
            if(i==11 || i==8 || i==5 || i==4 || i==2){
                mask = mask | 1;
            }
            mask = mask << 1;
        }

        // number with toggled bits
        int ans = n ^ mask;
        System.out.println(ans);
    }
}
