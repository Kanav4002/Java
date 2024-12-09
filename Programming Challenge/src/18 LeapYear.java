import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        System.out.println("Leap Year Finder...");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year : ");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        input.close();
    }
}
