package List.Vector;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>(11); // Default increment => 2 X of capacity
//        Vector<Integer> vector2 = new Vector<>(5,3);
        System.out.println(vector1.capacity());

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        Vector<Integer> vector3 = new Vector<>(linkedList);
        System.out.println(vector3);
    }
}
