package RealHomework.Tema14;

public class MyPoint {
    private double x = 0;
    private double y = 0;

    public MyPoint() {}

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(MyPoint point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    public double getDistance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public static double getDistance(MyPoint point1, MyPoint point2) {
        return point1.getDistance(point2);
    }
}
