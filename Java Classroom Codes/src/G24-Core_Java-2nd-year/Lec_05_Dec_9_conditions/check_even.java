package Lec_05_Dec_9_conditions;
import java.util.Scanner;

public class check_even{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("a is even number");
        }
        else{
            System.out.println("a is an odd number");
        }
    }
}