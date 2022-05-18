package RealHomework.Tema7;

public class Circle {
    double radius;

    Circle(double newRadius) {
        this.radius = newRadius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    void setRadius(double newRadius) {
        this.radius = newRadius;
    }
}
