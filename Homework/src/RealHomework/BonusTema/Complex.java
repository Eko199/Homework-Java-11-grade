package RealHomework.BonusTema;

public class Complex implements Cloneable, Comparable<Complex> {
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

    public Complex add(Complex num) {
        a += num.getRealPart();
        b += num.getImaginaryPart();
        return this;
    }

    public Complex subtract(Complex num) {
        a -= num.getRealPart();
        b -= num.getImaginaryPart();
        return this;
    }

    public Complex multiply(Complex num) {
        a = a * num.getImaginaryPart() - b * num.getImaginaryPart();
        b = b * num.getRealPart() + a * num.getImaginaryPart();
        return this;
    }

    public Complex divide(Complex num) {
        a = (a * num.getRealPart() + b * num.getImaginaryPart()) /
                (Math.pow(num.getRealPart(), 2) + Math.pow(num.getImaginaryPart(), 2));
        b += (b * num.getRealPart() - a * num.getImaginaryPart()) /
                (Math.pow(num.getRealPart(), 2) + Math.pow(num.getImaginaryPart(), 2));
        return this;
    }

    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public String toString() {
        if (b == 0)
            return String.valueOf(a);
        else
            return String.format("(%.2f + %.2fi)", a, b);
    }

    @Override
    public int compareTo(Complex num) {
        return Double.compare(abs(), num.abs());
    }

    @Override
    public Complex clone() {
        try {
            Complex clone = (Complex) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
