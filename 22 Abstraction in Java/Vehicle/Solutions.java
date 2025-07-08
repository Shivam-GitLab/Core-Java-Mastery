
abstract class Vehicle {

    public abstract void accelerate();

    public abstract void decelerate();

    public void speed(){
        System.out.println("Speed 40");
    }

}

class Car extends Vehicle{
    @Override
    public void accelerate(){
        System.out.println("Car Run");
    }
    @Override
    public void decelerate(){
        System.out.println("Car Break");
    }
}

class Bike extends Vehicle{
    @Override
    public void accelerate(){
        System.out.println("Bike Run");
    }
    @Override
    public void decelerate(){
        System.out.println("Bike Break");
    }
}

public class Solutions{
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.accelerate();
        car.decelerate();
        System.out.println();
        Vehicle bike = new Bike();
        bike.accelerate();
        bike.decelerate();

        bike.speed();
    }
}