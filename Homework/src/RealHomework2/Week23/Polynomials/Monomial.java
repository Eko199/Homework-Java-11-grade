package RealHomework2.Week23.Polynomials;

public class Monomial implements Cloneable {
    private double coefficient;
    private int power;

    public Monomial(double coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public Monomial clone() {
        try {
            return (Monomial) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
