package oops;

interface TwoDimentionalShape {

    public void calculateArea(double length, double breadth);
    public void calculatePerimeter(double length, double breadth);
}

interface ThreeDimentionalShape {

    public void calculateTotalSurfaceArea(double length, double breadth, double height);
    public void calculateVolume(double length, double breadth, double height);
}

class Rectangle implements TwoDimentionalShape {

    @Override
    public void calculateArea(double length, double breadth) {
        System.out.println("Area of Rectangle : " + length * breadth);
    }

    @Override
    public void calculatePerimeter(double length, double breadth) {
        System.out.println("Perimeter of Rectagle : " + 2 * (length + breadth));
    }
}

class Cuboid implements ThreeDimentionalShape {

    @Override
    public void calculateTotalSurfaceArea(double length, double breadth, double height) {
        double area = 2 * ((length * breadth) + (breadth * height) + (length * height));
        System.out.println("Total Surface area of Cuboid : " + area);
    }

    @Override
    public void calculateVolume(double length, double breadth, double height) {
        double volume = length * breadth * height;
        System.out.println("Volume of Cuboid : " + volume);
    }
}

public class Interface {

    public static void main(String[] args) {
        TwoDimentionalShape rectangle = new Rectangle();
        rectangle.calculateArea(10, 20);
        rectangle.calculatePerimeter(10, 20);

        ThreeDimentionalShape cuboid = new Cuboid();
        cuboid.calculateTotalSurfaceArea(10, 20, 30);
        cuboid.calculateVolume(10, 20, 30);
    }

}
