import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        /*
        1) Equality
         == : Checks value equality
         === : Checks value and type equality

        2) Inequality
         != : Checks value inequality
         !== : Checks value and type inequality

        3) Relational
         > : Greater than
         < : less than
         >= : Greater than or equal to
         <= : Less than or equal to

        Order or Relational operators is less than arithmetic operators.
        */

        // WAP to find if you're eligible for driving license
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if(age >= 18) {
            System.out.println("You are eligible for driving license.");
        } else {
            System.out.println("You are not eligible");
        }

        input.close();
    }
}
