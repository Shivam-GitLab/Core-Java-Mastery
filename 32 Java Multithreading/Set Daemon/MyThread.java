

public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        int n = 100;
        int i = 0;
        while (i<=n) {
            System.out.println("Hello World !!");
            i++;
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1 : ");
        t1.setDaemon(true);
        t1.start();
        System.out.println("main done ");
        
       /*
        MyThread t1 = new MyThread("Thread 1 : ");
        MyThread t2 = new MyThread("Thread 1 : ");
        t1.setDaemon(true);
        t1.start();
        t2.start();
        System.out.println("main done ");
        */
    }

}
