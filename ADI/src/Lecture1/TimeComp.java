package Lecture1;

public class TimeComp {
    public static void main(String[] args) {
//        int start = (int)System.currentTimeMillis();
//
//        for (int i = 0; i < 1000000; i++) {
//
//        }
//
//        int end = (int)System.currentTimeMillis();
//        System.out.println(end - start);

//         O (logN)
//        int n = 20;
//        int i = 1;
//        while (i < n) {
//            System.out.println("Hello");
//            i = i * 2;
//        }


//        O(N)
//        int i = 1;
//        int n = 20;
//        while (i <= n) {
//            System.out.println("Hello");
//            i = i + 2;
//            i = i + 3;
//        }


//        O(logN)
//        int i = 1;
//        int n = 20;
//        while (i <= n) {
//            System.out.println("Hello");
//            i = i * 2;
//            i = i * 3;
//        }



//        int i = 0;
//        int n = 100;
//        while (n > 1) {
//            System.out.println("Hello");
//            n = n / 2;
//            n = n / 3;
//        }


        // O (N / K)
//        int i = 0;
//        int k = 5;
//        int n = 20;
//        while (i <= n) {
//            System.out.println("Hello");
//            i = i + k;
//        }

        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= n / 2; k++) {
                    System.out.println("Hello");
                }
            }
        }

    }
}
