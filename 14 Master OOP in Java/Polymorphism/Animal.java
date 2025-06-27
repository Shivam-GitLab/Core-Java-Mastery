public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Animal animal2 = new Cat();
        animal2.makeSound();

    
        Animal animal3 = new Dog();
        animal3.makeSound();
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
class Dog extends Animal {
    // @Override
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}