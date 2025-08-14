package Thread;

public class VirtualThreadDemo {
    /*
        What it does: Similar output, but virtual threads handle thousands efficiently
        without using up OS resources—perfect for apps with lots of waiting (e.g., web requests).
     */
    public static void main(String[] args) throws InterruptedException {
        // Create and start a virtual thread
        Thread vt = Thread.ofVirtual().start(() -> {
            System.out.println("Task running in virtual thread");
            try {
                Thread.sleep(1000); // blocks virtually, efficient
            } catch (InterruptedException e) {
                System.out.println("Tasking done");
            }
        });
        System.out.println("Main thread continuing");
        vt.join(); // Wait for vt to finish
    }
}
