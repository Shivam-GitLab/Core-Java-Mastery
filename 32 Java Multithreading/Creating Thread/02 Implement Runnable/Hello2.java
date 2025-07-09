class World2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("World");
            // System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Hello2 {
    public static void main(String[] args) {
        World2 world = new World2();
        Thread t1 = new Thread(world);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            // System.out.println(Thread.currentThread().getName());
        }

        
        // world.start();
    }
}

