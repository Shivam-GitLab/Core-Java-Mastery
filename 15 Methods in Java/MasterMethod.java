
public class MasterMethod {
  
    public static void main(String[] args) {
        System.out.println("Welcome to Master Methods in Java!");
        int result = add(5, 10);
        System.out.println("Addition Result: " + result);
        
        String greeting = greet("Alice");
        System.out.println(greeting);
    }

    
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to greet a user
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}       