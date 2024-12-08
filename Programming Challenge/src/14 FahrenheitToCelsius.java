import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Temperature Calculator...");

        System.out.print("Enter value of temp in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Temperature in Celsius is : %.2f%n", celsius);

        input.close();
    }
}
