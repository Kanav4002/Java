import java.util.Scanner;

public class PalindromeCheck {
    //    1st approach
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str = input.nextLine();
//        int n = str.length();
//        String rev = "";
//        for(int i = n - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        System.out.println(rev);
//        System.out.println(rev.equals(str));
//
//        input.close();
//    }

//    2nd approach
//    public static void main(String[] args) {
//        String str = "racecar";
//        StringBuilder rev = new StringBuilder(str);
//        rev.reverse().toString();
//        // convert rev to string before comparison
//        System.out.println(str.equals(rev.toString()));
//    }

    public static void main(String[] args) {
        String str = "mnbbnmv adkfkalsjfl";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if(str.length() == 0 || str == null) return true;

        str = str.toLowerCase();

        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - i - 1);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}