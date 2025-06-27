
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {

    private int balance = 100;
    // Lock is interfaced
    /*
     * This line of code declares and initializes a private instance variable lock of type Lock using the ReentrantLock class. The ReentrantLock is a type of lock that allows the same thread to acquire the lock multiple times without causing a deadlock. This is useful for managing concurrent access to shared resources in a multithreaded environment.
     */
    // Manual Lock
     private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName()
                + " attemting to withdraw " + amount);
        try {
            // lock.lock(); -> same as synchronized
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " processing with withdraw");
                    Thread.sleep(3000);
                    balance-=amount;
                    System.out.println(Thread.currentThread().getName()
                    + " completed withdrawl. Remaining balance : " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } 
                    finally{
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName() + " isufficient balance");
                }
            }

            else{
                System.out.println(Thread.currentThread().getName() + " could not acquire a lock, will try later");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (Thread.currentThread().isInterrupted()) {
            System.out.println("");
        }
    }

}

public class MainBank {

    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        // Runnable Interface -> Object -> anonymous inner class creation
        Runnable task = new Runnable() {

            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();

    }
}

/*
issues Occur ^^ Fix That 
if thread o1 is not complete the task with 10 sec then wait t2 for that
class BankAccount {

    private int balance = 100;

    public synchronized  void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName()
                + " attemting to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " processing with withdraw");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName()
                    + " completed withdrawl. Remaining balance : " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " isufficient balance");
        }
    }

} 
*/
