package Recursion.Basic;

public class RecursionBasic {
    public static void main(String[] args) {
        print(0);
    }
    static void print(int cnt) {

        if (cnt == 3) {
            return;
        }
        System.out.println(cnt);
        cnt++;
        print(cnt + 1);
    }
}
