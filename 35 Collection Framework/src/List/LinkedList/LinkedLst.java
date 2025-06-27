package List.LinkedList;

import java.util.LinkedList;

public class LinkedLst {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Adding elements
        linkedList.addLast(4);         // O(1)
        linkedList.addFirst(0);        // O(1)

        // Getting elements
        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Element at index 2: " + linkedList.get(2));

        // Print the linked list
        System.out.println("LinkedList: " + linkedList);

        // Remove all odd elements
        linkedList.removeIf(x -> x % 2 != 0);
        System.out.println("After removing odd numbers: " + linkedList);

        // Working with LinkedList of Strings
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Lion");
        animals.add("Elephant");

        LinkedList<String> animalsToRemove = new LinkedList<>();
        animalsToRemove.add("Lion");

        animals.removeAll(animalsToRemove);
        System.out.println("Animals after removal: " + animals);
    }
}

/*
LinkedList
A LinkedList is a linear data structure in which each element is a separate object called a node. Each node consists of two parts:

Data:
The value or information stored in the node.

Pointers:

Next: A pointer that references the next node in the list.

Previous: A pointer that references the previous node in the list (used in doubly linked lists).

Performance Considerations
LinkedList has different performance characteristics compared to ArrayList:

Insertions and Deletions:

LinkedList is better for frequent insertions and deletions, especially in the middle of the list.

Unlike ArrayList, it does not require shifting elements during insertions or deletions.

Random Access:

LinkedList has slower random access using get(int index) compared to ArrayList.

This is because it must traverse the list from the beginning to reach the desired index.

Memory Overhead:

LinkedList requires more memory than ArrayList.

Each node in a linked list stores extra references (pointers) to both the next and previous nodes (in the case of a doubly linked list).
 */
