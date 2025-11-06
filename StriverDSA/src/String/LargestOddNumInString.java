package String;

public class LargestOddNumInString {
    public static void main(String[] args) {
        String num = "54594762";
        int lastOddIndex = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0'; // convert char to int
            if (digit % 2 != 0) {
                lastOddIndex = i;
                break;
            }
        }

        if (lastOddIndex == -1) {
            System.out.println("");
        } else {
            System.out.println(num.substring(0, lastOddIndex + 1));
        }
    }
}
