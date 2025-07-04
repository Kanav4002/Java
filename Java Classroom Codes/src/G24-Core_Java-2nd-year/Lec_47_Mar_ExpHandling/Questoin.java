package Lec_47_Mar_ExpHandling;

public class Questoin {
    public static void main(String[] args) {
        
        try{
            int[] arr = new int[3];
            System.out.println(arr[3]);
        }
        catch(ArithmeticException ex){
            System.out.println("Index out of bound");
        }
        finally{
            System.out.println("Finally Block");
        }
        System.out.println("Hello !!");
    }
}
