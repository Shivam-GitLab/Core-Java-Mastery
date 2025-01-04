class Counter {
    private int count = 0;

    // Synchronized method to ensure thread-safe increment
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Creating two threads that will increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
           
        
        

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Expected output: 2000 because both threads increment the counter
        System.out.println("Count: " + counter.getCount());
    }
}
