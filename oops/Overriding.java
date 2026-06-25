package oops;
/*Write a program to demonstrate runtime polymorphism. */

class Shape {

    public void calculateArea() {
        System.out.println("Base class");
    }

    public void calculatePerimeter() {
        System.out.println("Base class");
    }
}

class Square extends Shape {

    double length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        double area = length * length;
        System.out.println("Area of Square : " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 4 * length;
        System.out.println("Perimeter of Square : " + perimeter);
    }
}

public class Overriding {

    public static void main(String[] args) {
        Shape square = new Square(20);
        square.calculateArea();
        square.calculatePerimeter();
    }

}
