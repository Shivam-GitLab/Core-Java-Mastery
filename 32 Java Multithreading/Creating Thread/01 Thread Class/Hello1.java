
class World1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("World");
            // System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Hello1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            // System.out.println(Thread.currentThread().getName());
        }

        World1 world = new World1();
        world.start();
    }
}

