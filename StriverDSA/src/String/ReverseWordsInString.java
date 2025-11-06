package String;

import java.util.Collections;

public class ReverseWordsInString {
    /*
        Example 1:
        Input: s=”this is an amazing program”
        Output: “program amazing an is this”

        Example 2:
        Input: s=”This is decent”
        Output: “decent is This”
     */
    public static void main(String[] args) {
        String str = " I   Love   Java ";
        String[] words = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
