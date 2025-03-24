import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);

        int cnt = 1;
        int max = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i - 1)) {
                cnt++;
            } else {
                max = Math.max(max, cnt);
                cnt = 1;
            }
        }

        max = Math.max(max, cnt);
        System.out.println(max);
        sc.close();
    }
}
