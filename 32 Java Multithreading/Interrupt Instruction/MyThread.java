public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println("Thread is Running");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupt: "+e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();
    }

}
