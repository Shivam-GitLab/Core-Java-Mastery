public class CompileTime {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CompileTime compileTime = new CompileTime();

        // Calling the add method with two integers
        System.out.println("Sum of 2 and 3: " + compileTime.add(2, 3));

        // Calling the add method with three integers
        System.out.println("Sum of 2, 3 and 4: " + compileTime.add(2, 3, 4));

        // Calling the add method with two double values
        System.out.println("Sum of 2.5 and 3.5: " + compileTime.add(2.5, 3.5));
    }
}