import java.util.Scanner;

public class InsertElement{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = input.nextInt();
        System.out.print("Enter number of elements : ");
        int[] arr= new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("index = ");
        int Index = input.nextInt();
        System.out.print("value = ");
        int Value = input.nextInt();

        for(int i = n - 1; i > Index; i--){
            arr[i] = arr[i - 1];
        }
        arr[Index]=Value;
        System.out.println("array after insertion");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
