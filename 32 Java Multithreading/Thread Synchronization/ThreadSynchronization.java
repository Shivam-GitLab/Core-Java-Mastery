class Counter {
    private int count = 0;

    /* Critical Section */
    public synchronized void increment() {
        count++;
    }

    /* Synchronized Block */
    // public void increment() {
    // synchronized (this) {
    // count++;
    // }
    // }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter ;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

}

public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Creating two threads that will increment the counter
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.getMessage();
        }

        // Expected output: 2000 because both threads increment the counter
        System.out.println("Count: " + counter.getCount());
    }
}
