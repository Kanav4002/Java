package Lecture7;

public class StringSubSets {
    public static void main(String[] args) {
        String str = "abc";
        subSett(str, "");
    }

    private static void subSett(String str, String ans) {
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subSett(str.substring(1), ans + ch);
        subSett(str.substring(1) ,ans);
    }
}
