package RealHomework.Tema7;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2= new Circle(25);
        Circle circle3 = new Circle(125);

        System.out.println(circle1.getArea());
        System.out.println(circle2.getPerimeter());
        circle3.setRadius(20);
        System.out.println(circle3.radius);
    }
}
