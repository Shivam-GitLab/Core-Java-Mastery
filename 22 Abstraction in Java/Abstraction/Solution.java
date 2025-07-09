class Cat extends Animal{
    @Override
    public void sayHello() {
        System.out.println("Meow");
    }
}
class Dog extends Animal{

    @Override
    public void sayHello() {
        System.out.println("Woof");
    }
    
}
abstract class Animal {
    // abstract Method
    public abstract void sayHello(); 


    public void sleep(){  // Concrete Method
        System.out.println("zzzz");
    }
}

public class Solution{
    public static void main(String[] args) {
        // Animal animal = new Animal(); // Wrongj
        // abstract class cannot create object

        Animal dog = new Dog();
        dog.sayHello();
    }
}
