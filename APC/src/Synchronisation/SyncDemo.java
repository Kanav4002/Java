package Synchronisation;

public class SyncDemo {
    private int count = 0;

    public synchronized void increment() {
        count++;  // Locked, so safe from races
    }

    public static void main(String[] args) throws InterruptedException {
        SyncDemo demo = new SyncDemo();

        // Two threads incrementing 1000 times each
        Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) demo.increment(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 1000; i++) demo.increment(); });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + demo.count);  // Always 2000
    }
}

