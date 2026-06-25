package oops;
/*Write a program to demonstrate compile-time polymorphism. */

class Figure {

    public double calculateArea(double length) {
        return length * length;
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}

public class Overloading {

    public static void main(String[] args) {
        Figure figure = new Figure();
        System.out.println("Area of Square : " + figure.calculateArea(18));
        System.out.println("Area of Rectangle : " + figure.calculateArea(18, 20));

    }

}
