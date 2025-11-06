package Practise;

public class NCR {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        long result = ncrFunc(n, r);
        System.out.println(result);
    }

    /*
        T.C : O(N)
        S.C : O(1)
     */
    static long ncrFunc(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        System.out.print("Enter n : ");
//        int r = sc.nextInt();
//        System.out.println(calcNCR(n, r));
//    }
//
//    static long calcNCR(int n, int r) {
//        return fact(n) / fact(r) * fact(n - r);
//    }
//
//    static long fact(int n) {
//        long res = 1;
//        for (int i = 1; i <= n; i++) {
//            res *= i;
//        }
//        return res;
//    }
}
