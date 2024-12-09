import java.util.Scanner;

class Grading {
    public static void main(String[] args) {
        System.out.println("Welcome to my Grade Calculator...");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your percentage : ");
        float percentage = input.nextFloat();

        if(percentage >= 90) {
            System.out.println("Grade is : A.");
        } else if(percentage >= 75) {
            System.out.println("Grade is : B.");
        } else if(percentage >= 60) {
            System.out.println("Grade is : C.");
        } else if(percentage >= 30) {
            System.out.println("Grade is : D.");
        } else {
            System.out.println("Grade is : F.");
        }

        input.close();
    }
}
