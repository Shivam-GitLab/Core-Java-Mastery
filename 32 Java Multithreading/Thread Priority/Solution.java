class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public MyThread() {

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String a = "";
            for (int j = 0; j < 1000; j++) {
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() +
                    " Priority: " + Thread.currentThread().getPriority() + " Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }
}

// Start , Run Sleep Join setPriority , interrupted  , yield
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
        // h.start();
        // MyThread t1 = new MyThread();

        // t1.start();
        // t1.join();
        // System.out.println("Hello");
    }
}

/*
1. Low Priority Thread :  Priority: 1 Count: 0
2. Medium Priority Thread :  Priority: 5 Count: 0
3. High Priority Thread :  Priority: 10 Count: 0
3. High Priority Thread :  Priority: 10 Count: 1
2. Medium Priority Thread :  Priority: 5 Count: 1
1. Low Priority Thread :  Priority: 1 Count: 1
3. High Priority Thread :  Priority: 10 Count: 2
2. Medium Priority Thread :  Priority: 5 Count: 2
1. Low Priority Thread :  Priority: 1 Count: 2
3. High Priority Thread :  Priority: 10 Count: 3
2. Medium Priority Thread :  Priority: 5 Count: 3
1. Low Priority Thread :  Priority: 1 Count: 3
2. Medium Priority Thread :  Priority: 5 Count: 4
3. High Priority Thread :  Priority: 10 Count: 4
1. Low Priority Thread :  Priority: 1 Count: 4

Depend On JVM Or Which Type Of Code
 */