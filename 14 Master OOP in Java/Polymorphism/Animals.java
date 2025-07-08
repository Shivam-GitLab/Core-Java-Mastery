package Polymorphism;

public class Animals {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    public static void main(String[] args) {
        Animals animal1 = new Animals();
        animal1.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Animals animal2 = new Cat();
        animal2.makeSound();

    
        Animals animal3 = new Dog();
        animal3.makeSound();
    }
}

class Cat extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
class Dog extends Animals {
    // @Override
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}