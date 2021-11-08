package RealHomework.Tema8;

public class RectangleTest {
    public static void colorRectangles(Rectangle rect1, Rectangle rect2) {
        rect1.setColor((rect1.getPerimeter() > rect2.getPerimeter()) ? "yellow" : "green");
        rect2.setColor((rect1.getPerimeter() < rect2.getPerimeter()) ? "yellow" : "green");
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100, 100);
        Rectangle rect2 = new Rectangle(50, 100);
        colorRectangles(rect1, rect2);
        System.out.println(rect1.getColor());
        System.out.println(rect2.getColor());
    }
}
