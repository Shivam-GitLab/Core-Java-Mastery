# 🚗 Mastering Object-Oriented Programming (OOP) in Java

Welcome to your **Java OOP journey**! In this guide, we’ll use a real-life example — a **Car class** — to understand the core pillars of Object-Oriented Programming in Java.  

---

## 🎯 What is OOP?

**Object-Oriented Programming (OOP)** is a programming paradigm that uses **objects** — instances of **classes** — to design software.

---

## 🧱 Four Pillars of OOP

| Concept       | Description                                                              | Example                                                                 |
|---------------|--------------------------------------------------------------------------|-------------------------------------------------------------------------|
| 🧩 **Encapsulation** | Wrapping data and code into a single unit (class)                    | `Car` class contains both properties and methods                        |
| 🔁 **Inheritance**   | Acquiring properties of another class                              | `ElectricCar` extends `Car` (Example below)                             |
| 🧠 **Polymorphism**  | One interface, many implementations                                 | `brake()` method could be overridden in child class                    |
| 👥 **Abstraction**   | Hiding internal details and showing only functionality              | Using `start()` without knowing how engine works internally             |

---

## 🔧 Example: Car Class in Java

```java
public class Car {
    // 🧾 Properties (Encapsulation)
    String color;
    String brand;
    String model;
    int year;
    int speed;

    // 🚀 Behaviors (Methods)
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

        System.out.println("🚘 Car Details:");
        System.out.println("🎨 Color: " + myCar.color);
        System.out.println("🏷️ Brand: " + myCar.brand);
        System.out.println("📦 Model: " + myCar.model);
        System.out.println("📅 Year: " + myCar.year);
        System.out.println("⚡ Speed: " + myCar.speed);

        myCar.accelerate(20);
        System.out.println("🚀 After Acceleration: " + myCar.speed);
    }
}
