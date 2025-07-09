package List.Stack;
import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList;
public class StackIntro {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // LIFO
        System.out.println(stack);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        var removeElement = stack.pop();
        System.out.println(removeElement);
        System.out.println(stack.peek());

        System.out.println(stack.search(20));

        // linkedList as Stack

        LinkedList<Integer> linkedList2 = new LinkedList<>();

        // Adding elements to the end
        linkedList2.addLast(1);
        linkedList2.addLast(2);
        linkedList2.addLast(3);

        // Peek the last element
        System.out.println("Last element (peek): " + linkedList2.getLast());

        // Remove the last element (pop)
        linkedList2.removeLast();

        // Get the size
        System.out.println("Size after pop: " + linkedList2.size());

        // Printing remaining elements
        System.out.println("Remaining elements: " + linkedList2);

        // ArrayList as Stack
        ArrayList<Integer> stack1 = new ArrayList<>();

        // Push elements (add to end)
        stack1.add(10);
        stack1.add(20);
        stack1.add(30);

        // Peek (top of the stack)
        int top = stack1.get(stack1.size() - 1);
        System.out.println("Top element (peek): " + top);

        // Pop (remove from end)
        int popped = stack1.remove(stack1.size() - 1);
        System.out.println("Popped element: " + popped);

        // Size
        System.out.println("Stack size: " + stack1.size());

        // Print remaining stack
        System.out.println("Stack content: " + stack1);
    }
}
