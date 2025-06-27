package List.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrListVsVector { // ThreadExample
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>(); // 1671 , 1475 ...
//        Vector<Integer> list = new Vector<>(); // 2000 Exact

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("List size: " + list.size());
    }
}
