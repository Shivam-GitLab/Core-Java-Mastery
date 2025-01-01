class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public MyThread() {

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " Priority: " + Thread.currentThread().getPriority() + " Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }
}


// Start , Run Sleep Join setPriority
public class Solution {
    public static void main(String[] args) throws InterruptedException {

        MyThread l = new MyThread("1. Low Priority Thread : ");
        MyThread m = new MyThread("2. Medium Priority Thread : ");
        MyThread h = new MyThread("3. High Priority Thread : ");

        l.setPriority(Thread.MIN_PRIORITY); // Priority 1
        m.setPriority(Thread.NORM_PRIORITY); // Priority 5
        h.setPriority(Thread.MAX_PRIORITY); // Priority 10

        l.start();
        m.start();
        h.start();
        h.start();
        // MyThread t1 = new MyThread();

        // t1.start();
        // t1.join();
        // System.out.println("Hello");
    }
}
