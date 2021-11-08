package RealHomework.Tema17;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void printCircle() {
        System.out.println("Circle: radius = " + radius);
    }
}
