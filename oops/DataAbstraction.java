package oops;
/*Write a program to demonstrate data abstraction. */

abstract class Vehical {

    // abstract method for hiding implementation detail.
    public abstract void start(); 
    
    public void stop() {
        System.out.println("Stopped....");
    }
}

class Car extends Vehical {

    @Override
    public void start() {
        System.out.println("Car Started...");
    }
}

class Bike extends Vehical {

    @Override
    public void start() {
        System.out.println("Bike started...");
    }
}

public class DataAbstraction {

    public static void main(String[] args) {
        Vehical car = new Car();
        car.start();
        car.stop();

        Vehical bike = new Bike();
        bike.start();
        bike.stop();
    }

}
