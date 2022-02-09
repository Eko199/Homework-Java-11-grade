package RealHomework.BonusTema;

public class Complex implements Cloneable, Comparable {
    private double a = 0;
    private double b = 0;

    public Complex() {}

    public Complex(double a) {
        this.a = a;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public void add(Complex num) {
        a += num.getRealPart();
        b += num.getImaginaryPart();
    }

    public void substract(Complex num) {
        a -= num.getRealPart();
        b -= num.getImaginaryPart();
    }

    public void multiply(Complex num) {
        a = a * num.getImaginaryPart() - b * num.getImaginaryPart();
        b = b * num.getRealPart() + a * num.getImaginaryPart();
    }

    public void divide(Complex num) {
        a = (a * num.getRealPart() + b * num.getImaginaryPart()) /
                (Math.pow(num.getRealPart(), 2) + Math.pow(num.getImaginaryPart(), 2));
        b += (b * num.getRealPart() - a * num.getImaginaryPart()) /
                (Math.pow(num.getRealPart(), 2) + Math.pow(num.getImaginaryPart(), 2));
    }

    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public String toString() {
        if (b == 0)
            return String.valueOf(a);
        else
            return String.format("(%d + %di)", a, b);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Complex num) {
            if (abs() > num.abs())
                return 1;
            else if (abs() < num.abs())
                return -1;
            else
                return 0;
        } else {
            return Integer.MIN_VALUE;
        }
    }
}
