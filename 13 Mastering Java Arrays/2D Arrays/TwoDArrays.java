
public class TwoDArrays {
    public static void main(String[] args) {
        // Declare and initialize a two-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the elements of the 2D array using nested loops
        System.out.println("2D Array elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "]: " + matrix[i][j]);
            }
        }

        // Modify an element in the 2D array
        matrix[1][1] = 10;
        System.out.println("Modified element at [1][1]: " + matrix[1][1]);

        // Print the modified 2D array
        System.out.println("Modified 2D Array elements:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.println(element);
            }
        }
    }
}
