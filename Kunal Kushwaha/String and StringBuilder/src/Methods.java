import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr1 = {6, 7, 8, 9, 10}
//         System.out.println(Arrays.toString(arr).Arrays.toString(concat(arr1)));
        String name = "KanavKumar";
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(Arrays.toString(name.toUpper`Case().toCharArray()));
        char[] arr = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(arr).toUpperCase());
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
        }
        System.out.println(str.toString());
//        System.out.println(name);
//        name.indexOf('k');
        System.out.println("   Kanav   ".strip());

        System.out.println(Arrays.toString(name.split(" ")));

    }
}
