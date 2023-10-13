// Superclass
abstract class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }
    public abstract double calculateArea();
    public void display() {
        System.out.println("This is a " + name);
    }
}
// Subclass 1: Circle
class Circle extends Shape {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
// Subclass 2: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle("Circle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);

        // Polymorphism: Using a common method to calculate and display areas
        Shape[] shapes = {circle, rectangle};
        for (Shape shape : shapes) {
            shape.display();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println();
        }
    }





    public boolean areTheAreasTheSame(Shape sh1, Shape sh2) {
        return sh1.calculateArea()==sh2.calculateArea();

    }
