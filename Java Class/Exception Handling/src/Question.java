public class Question {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(arr[3]);
        }
        // Handles the exception which is in try block
        catch (ArithmeticException ex) {
            System.out.println("Index out of bound");
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("Hello ");
    }
}
