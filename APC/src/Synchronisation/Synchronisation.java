package Synchronisation;

public class Synchronisation {
    static int count = 0;

    public static synchronized  void counter() {
        count++;
    }

    public static  void main(String[] args)  throws InterruptedException{
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());

        t1.start();
        t2.start();

        t1.join();  // wait for t1 to finish
        t2.join();  // wait for t2 to finish

        System.out.println("Final Count: " + count);  // Should be 2000
    }

    static class Thread1 implements Runnable {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter();
            }
        }
    }

    static class Thread2 implements Runnable {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter();
            }
        }
    }

}
