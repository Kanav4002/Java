package Thread;

public class TraditionalThreadDemo {
    /*
        Traditional threads run tasks in parallel but are resource-heavy.
        Virtual threads are lighter, ideal for many waiting tasks.
        Traditional threads are good for a few heavy tasks.
     */
    public static void main(String[] args) throws InterruptedException {
        // Create and start a thread
        Thread t = new Thread(() -> {
            System.out.println("Task running in tradtional thread");
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                System.out.println("Task done");
            }
        });
        t.start(); // Runs concurrently

        System.out.println("Main thread continuing");
        t.join(); // Wait for t to finish
    }
}
