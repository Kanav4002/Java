import java.util.Scanner;

public class CompressedString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        System.out.println(compressedString(S));
    }

    public static String compressedString(String S) {
        StringBuilder compressed = new StringBuilder();

        for(int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            int count = 1;

            while(i + 1 < S.length() && S.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            compressed.append(currentChar).append(count);
        }
        return compressed.toString();
    }
}
