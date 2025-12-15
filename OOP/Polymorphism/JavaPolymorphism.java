package Polymorphism;

public class JavaPolymorphism {
    public static void main(String[] args) {

        // Polymorphism = "POLY-" = "MANY"
        //                               "-MORPH" = "SHAPE"
        //                               Objects can identify as other objects.
        //                               Objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
abstract class Vehicle {

    abstract void go();
}
class Car extends Vehicle{

    @Override
    void go(){
        System.out.println("You drive the car");
    }
}
class Bike extends Vehicle{

    @Override
    void go(){
        System.out.println("You ride the bike");
    }
}
class Boat extends Vehicle{

    @Override
    void go(){
        System.out.println("You sail the boat");
    }
}
