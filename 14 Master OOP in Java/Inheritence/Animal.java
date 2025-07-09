package Inheritence;

public class Animal {
    String name;
    int age;
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.age = 5;
        dog.breed = "Labrador";

        Cat cat = new Cat();
        cat.name = "Whiskers";
        cat.age = 3;
        cat.breed = "Siamese";

        System.out.println("Dog Name: " + dog.name);
        System.out.println("Dog Age: " + dog.age);
        System.out.println("Dog Breed: " + dog.breed);
        System.out.println("Cat Name: " + cat.name);
        System.out.println("Cat Age: " + cat.age);
        System.out.println("Cat Breed: " + cat.breed);

    }
}

class Dog extends Animal{
    String breed;
}
class Cat extends Animal {
    String breed;
}
