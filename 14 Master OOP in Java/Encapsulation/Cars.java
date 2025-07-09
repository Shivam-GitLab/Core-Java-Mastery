package Encapsulation;

public class Cars {
    // Properties (Data Members) of Car Class 
    private String color;
    private String brand;
    private String model;
    private int year;
    private int speed;

    // Getter Methods of Car Class
    
    // Behavior Methods (Member Functions) of Car Class
    public void accelerate(int increment) {
        speed += increment;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    // public void setYear(int year) {
    //     this.year = year;
    // }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }

    public static void main(String[] args) {
        Cars myCar = new Cars();
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
        // myCar.setYear(2030);
        System.out.println("After Setting Year: " + myCar.getYear());
    }
}


