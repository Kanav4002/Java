package Volatile;

public class VolatileDemo {
    private volatile boolean running = true;
    public static void main(String[] args) throws InterruptedException {
        VolatileDemo demo = new VolatileDemo();
        // Thread 1: Loops until running is false
        Thread loopThread = new Thread(() -> {
            while (demo.running) {
                // Simulating work
            }
            System.out.println("Loop stopped!");
        });
        loopThread.start();

        // Main thread: Changes the flag after 1 second
        Thread.sleep(1000);
        demo.running = false;  // Visible immediately to loopThread
    }
}
