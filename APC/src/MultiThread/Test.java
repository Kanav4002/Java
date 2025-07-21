package MultiThread;

public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        try {
            mt.join();
        } catch (InterruptedException e) {
            System.out.println("join method is not executed");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Parent Class");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.out.println();
            }
        }
    }
}
