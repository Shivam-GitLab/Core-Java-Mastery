
public class OneDArrays {
    public static void main(String[] args) {
        // Declare and initialize a one-dimensional array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the elements of the array using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element in the array
        numbers[2] = 10;
        System.out.println("Modified element at index 2: " + numbers[2]);

        // Print the modified array
        System.out.println("Modified array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
