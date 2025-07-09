class MyThread extends Thread {
    @Override
    public void run() {
        // System.out.println(Thread.currentThread().getName() + 
        // " Priority: " + Thread.currentThread().getPriority());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException{

        // MyThread t1 = new MyThread();
        // MyThread t2 = new MyThread();
        // MyThread t3 = new MyThread();

        // t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        // t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        // t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // t1.start();
        // t2.start();
        // t3.start();
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
        System.out.println("Hello");
    }
}
