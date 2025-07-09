package Abstraction;

public class Abstactions {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
