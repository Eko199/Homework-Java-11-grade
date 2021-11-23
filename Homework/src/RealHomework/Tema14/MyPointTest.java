package RealHomework.Tema14;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println(MyPoint.getDistance(point1, point2));
    }
}
