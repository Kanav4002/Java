package Lec_05_Dec_9_conditions;
import java.util.Scanner;

public class grades {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int grade = sc.nextInt();

    if(grade > 90){
        System.out.println("A");
    }
    else if(grade>=80 && grade <=90){
        if(grade > 85){
            System.out.println("A-");
        }
        else{
            System.out.println("B+");
        }
    }
    sc.close();
    }
}
