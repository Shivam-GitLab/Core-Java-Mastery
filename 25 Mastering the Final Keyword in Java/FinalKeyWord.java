public class FinalKeyWord {

    // final variable
    final int MAX_VALUE = 100;

    // final method
    public final void displayMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalKeyWord obj = new FinalKeyWord();
        System.out.println("Final variable MAX_VALUE: " + obj.MAX_VALUE);
        obj.displayMessage();

        // Uncommenting the next line will cause a compilation error
        // obj.MAX_VALUE = 200; // Error: cannot assign a value to final variable
    }
}

