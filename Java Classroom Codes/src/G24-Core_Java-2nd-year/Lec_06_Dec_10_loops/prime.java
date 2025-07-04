package Lec_06_Dec_10_loops;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2 ; i<=n ; i++){
            boolean is_prime = true;

            for(int j = 2 ; j<i ; j++){
                if(i % j == 0){
                    is_prime = false;
                    break;
                }
            }
            if(is_prime){
                System.out.println(i);
            }
        }
    }
}
