package MultiThread;

// Your custom thread extending Thread
class MyThread1 extends Thread {

    public MyThread1(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        play();
    }

    private void play() {
        System.out.print(getName());
        System.out.print(getName());
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread tableThread = new MyThread1("Table");
        tableThread.start();  // You must start the thread to run it!
    }
}
