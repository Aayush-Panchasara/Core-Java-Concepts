package oops;
/*Write a program to demonstrate data abstraction. */

abstract class Vehicle {
    // abstract method for hiding implementation detail.
    public abstract void start(); 
    
    public void stop() {
        System.out.println("Stopped....");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car Started...");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started...");
    }
}

public class DataAbstraction {

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }

}
