package List.ArrayList;


import java.util.*;

/*
1. List - interface
2. ArrayList - List ko implement krta hai
*/


/*
import java.util.ArrayList;

public class ArrLis {

    // Method to demonstrate ArrayList operations
    public void performOperations() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));

        // For Loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // For Each Loop
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Contains 50? " + list.contains(50));
        System.out.println("Contains 20? " + list.contains(20));

        list.remove(2); // Remove index 2

        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();

        list.add(1, 90); // Shift
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();

        list.set(1, 9); // Replace
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Final List: " + list);
    }
}


public class TestArrLis {
    public static void main(String[] args) {
        ArrLis obj = new ArrLis();
        obj.performOperations();
    }
}


*/


/*
https://www.callicoder.com/java-arraylist/
           => Internal working <=
Unlike a regular array, which has a fixed size,
an ArrayList can grow and shrink as elements
are added or removed. This dynamic resizing
is achieved by creating a new array when the
current array is full and copying the elements
to the new array.

Internally, the ArrayList is implemented as an
array of Object references. When you add
elements to an ArrayList, you're essentially
storing these elements in this internal array.

When you create an ArrayList, it has an initial
capacity (default is IO). The capacity refers
to the size of the internal array that can hold
elements before needing to resize.
*/


/*
        ==>> Adding Elements
When we add an element to an ArrayList, the following steps occur

1. Check Capacity: Before adding the new element, ArrayList checks if
there is enough space in the internal array (elementData).
If the array is full, it needs to be resized.

2. Resize if Necessary: If the internal array is full, the ArrayList will create
a new array with a larger capacity (usually 1.5 times the current
capacity) and copy the elements from the old array to the new array.

3. Add the Element: The new element is then added to the internal array at
the appropriate index, and the size is incremented.


        ==>> Resizing the Array ==> TC - O(N)
1. Initial Capacity: By default, the initial capacity is IO. This means the
internal array can hold IO elements before it needs to grow.

2. Growth Factor: When the internal array is full, a new array is created
with a size 1.5 times the old array. This growth factor balances
memory efficiency and resizing cost.

3. Copying Elements: When resizing occurs, all elements from the old
array are copied to the new array, which is an O(n) operation, where
n is the number of elements in the ArrayList.

                ==> Removing Elements
1. Check Bounds:
The ArrayList first checks if the index is within the valid range.

2. Remove the Element: The element is removed, and all elements to
the right of the removed element are shifted one position to the left
to fill the gap.

3. Reduce Size: The size is decremented by 1.


== Using reflection - > check the capacity of ArrayList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Default constructor — creates an empty ArrayList with an initial capacity of 10
        ArrayList<String> list1 = new ArrayList<>();

        // 2. Creating an ArrayList with a specified initial capacity
        ArrayList<String> listWithCapacity = new ArrayList<>(20);

        // 3. Creating an ArrayList from another collection
        List<String> anotherList = Arrays.asList("Apple", "Banana", "Orange");
        ArrayList<String> listFromCollection = new ArrayList<>(anotherList);

        // Print lists to verify
        System.out.println("List 1 (Empty): " + list1);
        System.out.println("List with Capacity: " + listWithCapacity);
        System.out.println("List from Collection: " + listFromCollection);
    }
}

*/

public class ArrList {
    public static void main(String[] args) {
        // Creating an empty ArrayList
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        // Creating a list from an array
        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());

        // Modifying an element in the list -> Replace Only
        list1.set(1, "Wednesday");
        System.out.println(list1);

        // Creating a list from an array
        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);

        // Creating a list using List.of -> Can not any modification
        // introduce in java9
        List<Integer> list3 = List.of(1, 2, 3);
        System.out.println(list3.getClass().getName());

        // Note: List.of creates an immutable list, so the following line will
        // throw an UnsupportedOperationException
        // list3.set(1, 33);

        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(4);
        lists.add(3);
        lists.add(5);
        lists.add(6);

        // Accessing element at index 1
        System.out.println("Element at index 1: " + lists.get(1));

        // if remove value 1 but remove index 1 problem
        // lists.remove(1); // [1, 3] -> Expect [2, 3]

        lists.remove(Integer.valueOf(1)); // Object -> [2, 3]

        // Printing the entire list
        System.out.println(lists);

        boolean hasApple = lists.contains(2); // Returns true if "Apple" is present
        System.out.println(hasApple);

        // 1. Convert List to Object array
        Object[] objectArray = lists.toArray();

        // 2. Convert List to Integer array
        Integer[] array1 = lists.toArray(new Integer[0]);

        // Print arrays
        System.out.println("Object Array:");
        for (Object obj : objectArray) {
            System.out.print(obj + " ");
        }

        System.out.println("\nInteger Array:");
        for (Integer i : array1) {
            System.out.print(i + " ");
        }
        lists.sort(null);
//        Collections.sort(lists);
        System.out.println(lists);
    }
}

/*
import java.util.ArrayList;

public class AddingElementsExample {
    public static void main(String[] args) {
        // Creating a new ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("Apple");
        list.add("Banana");

        // Adding an element at a specific index
        // "Orange" will be added at index 1, shifting "Banana" to index 2
        list.add(1, "Orange");

        // Printing the updated list
        System.out.println("Updated List: " + list);  // Output: [Apple, Orange, Banana]
    }
}
*/
/*
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Accessing element at index 1
         System.out.println("Element at index 1: " + list.get(1));


        // Printing the entire list
        System.out.println(list);

*/

/*
✅ Time Complexity of ArrayList Operations
  1. Access by index (get(index)) → O(1)
➤ Because it uses an internal array, accessing elements by index is constant time.

  2. Adding an element
➤ Amortized: O(1) (when there's space)
➤ Worst-case: O(n) (when resizing occurs and all elements are copied to a new array)

  3. Removing elements → O(n)
➤ Removing causes a shift of all elements after the removed index.

  4. Iteration (e.g., for-each loop) → O(n)
➤ All elements are visited once.*/
