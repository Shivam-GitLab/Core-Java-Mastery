
public class MasterInterface {
    public static void main(String[] args) {
        System.out.println("Welcome to Mastering Java Interfaces!");
        
        // Example of using an interface
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.displayMessage();
    }
}

interface MyInterface {
    void displayMessage();
}

class MyInterfaceImpl implements MyInterface {
    @Override
    public void displayMessage() {
        System.out.println("Hello from MyInterface!");
    }
}
// This code demonstrates the use of interfaces in Java.
// It defines an interface `MyInterface` with a method `displayMessage`.