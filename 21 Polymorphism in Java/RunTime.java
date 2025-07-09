class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTime {
    public static void main(String[] args) {
        /*
         * Animal myAnimal;
         * 
         * // Runtime polymorphism
         * myAnimal = new Dog();
         * myAnimal.sound(); // Outputs: Dog barks
         * 
         * myAnimal = new Cat();
         * myAnimal.sound(); // Outputs: Cat meows
         * 
         */

        // Wrong Statement // Child - > Parent
        // Write Statement // Parent - > Child
        // Cat c1 = new Animal();

        Animal myAnimal = new Animal();
        myAnimal.sound();

        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();

        /*
         * /*
         * Key Points to Remember:
         * 
         * 1. Method Overriding:
         * - Method overriding allows a subclass to provide a specific implementation of
         * a method already defined in its superclass.
         * - The method in the subclass must have the same name, return type, and
         * parameters as in the superclass.
         * 
         * 2. Runtime Polymorphism:
         * - Achieved through method overriding.
         * - The type of the object is determined at runtime, and the overridden method
         * in the actual object type is called.
         * 
         * 3. Use of @Override:
         * - The @Override annotation is used to indicate a method is overriding a
         * superclass method.
         * - It helps catch errors if the method signature does not match any method in
         * the superclass.
         * 
         * 4. Upcasting:
         * - A subclass object can be treated as an instance of its superclass.
         * - This is done by assigning a subclass object to a superclass reference.
         * 
         * 5. Dynamic Method Dispatch:
         * - The process of determining which method implementation to call at runtime
         * based on the object type.
         */
        /*
         * class Animal {
         * 
         * }
         * class Dog extends Animal {
         * 
         * }
         * 
         * Animal animal = new Dog(); // upcasting
         */

        /*
         * class Animal { }
         * class Dog extends Animal { }
         * 
         * Animal animal = new Dog();
         * Dog dog = (Dog) animal; // downcasting
         */

    }
}