package JMM;

public class JMMDemo {
    private int number = 0;
    private volatile boolean ready = false;  // Volatile creates happens-before

    public static void main(String[] args) throws InterruptedException {
        JMMDemo demo = new JMMDemo();

        // Thread 1: Waits for ready, then prints number
        Thread reader = new Thread(() -> {
            while (!demo.ready) {
                // Wait
            }
            System.out.println("Number: " + demo.number);  // Always 42, thanks to JMM
        });
        reader.start();

        // Thread 2: Sets number, then ready
        Thread writer = new Thread(() -> {
            demo.number = 42;
            demo.ready = true;
        });
        writer.start();
    }
}
