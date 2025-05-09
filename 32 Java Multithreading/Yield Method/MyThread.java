

public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is Running... ");
            Thread.yield();
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1 : ");
        MyThread t2 = new MyThread("Thread 2 : ");
        t1.start();
        t2.start();
        // Interrupted
        // t1.interrupt();
    }

}

/*
    --> Without Yield
Thread 1 :  is Running... 
Thread 1 :  is Running... 
Thread 1 :  is Running... 
Thread 2 :  is Running... 
Thread 1 :  is Running... 
Thread 1 :  is Running... 
Thread 2 :  is Running... 
Thread 2 :  is Running... 
Thread 2 :  is Running... 
Thread 2 :  is Running... 

*/

/*
 --> With Yield
Thread 2 :  is Running... 
Thread 1 :  is Running... 
Thread 2 :  is Running... 
Thread 1 :  is Running... 
Thread 1 :  is Running... 
Thread 1 :  is Running... 
Thread 2 :  is Running... 
Thread 1 :  is Running... 
Thread 2 :  is Running... 
Thread 2 :  is Running... 
*/
 
