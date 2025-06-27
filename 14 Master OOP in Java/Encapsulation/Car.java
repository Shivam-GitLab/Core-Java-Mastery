package Encapsulation;

public class Car {
    // Properties (Data Members) of Car Class 
    String color;
    String brand;
    String model;
    int year;
    int speed;

    // Behavior Methods (Member Functions) of Car Class
    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        myCar.speed = 40;

        System.out.println("Car Details:");
        System.out.println("Color: " + myCar.color);
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Speed: " + myCar.speed);
        myCar.accelerate(20);
        System.out.println("After Acceleration: " + myCar.speed);
    }
}


