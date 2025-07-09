

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println("Thread is Running.....");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted : " + e);
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        // Interrupted
        t1.interrupt();
    }

}
