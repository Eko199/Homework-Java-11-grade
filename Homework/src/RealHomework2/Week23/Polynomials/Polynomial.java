package RealHomework2.Week23.Polynomials;

import java.util.Iterator;
import java.util.LinkedList;

public class Polynomial implements Cloneable {
    private LinkedList<Monomial> list;
    private int power;

    public Polynomial(LinkedList<Monomial> list) {
        this.list = list;
        power = list.getFirst().getPower();
    }

    public static Polynomial create(int power, double[] coefficients) {
        LinkedList<Monomial> list = new LinkedList<>();
        for (int i = 0; i <= power && i < coefficients.length; i++) {
            if (coefficients[i] != 0) {
                list.addLast(new Monomial(coefficients[i], power - i));
            }
        }
        return new Polynomial(list);
    }

    public void print() {
        Iterator<Monomial> iterator = list.iterator();

        while (iterator.hasNext()) {
            Monomial current = iterator.next();

            if (current.getCoefficient() != 1 || current.getPower() == 0)
                System.out.print(current.getCoefficient());
            if (current.getPower() > 1)
                System.out.printf("x^%d", current.getPower());
            else if (current.getPower() == 1)
                System.out.print("x");

            if (iterator.hasNext())
                System.out.print(" + ");
        }

        System.out.println();
    }

    public static Polynomial addPolynomials(Polynomial p1, Polynomial p2) {
        Polynomial biggerPol = (p1.power > p2.power) ? p1.clone() : p2.clone();
        Polynomial smallerPol = (p1.power > p2.power) ? p2.clone() : p1.clone();

        Iterator<Monomial> iterator = biggerPol.list.iterator();
        while (iterator.hasNext() && !smallerPol.list.isEmpty()) {
            Monomial bigCurrent = iterator.next();
            Monomial smallCurrent = smallerPol.list.getFirst();

            if (bigCurrent.getPower() == smallCurrent.getPower()) {
                bigCurrent.setCoefficient(bigCurrent.getCoefficient() + smallCurrent.getCoefficient());
                smallerPol.list.removeFirst();

                if (bigCurrent.getCoefficient() == 0) {
                    if (bigCurrent.getPower() == biggerPol.power)
                        biggerPol.power--;
                    biggerPol.list.remove(bigCurrent);
                }
            } else if (bigCurrent.getPower() < smallCurrent.getPower()) {
                biggerPol.list.add(biggerPol.power - smallCurrent.getPower(), smallCurrent);
                smallerPol.list.removeFirst();

                for (iterator = biggerPol.list.iterator(); iterator.next() != smallCurrent;);
            }
        }

        if (!smallerPol.list.isEmpty())
            biggerPol.list.addAll(smallerPol.list);

        return biggerPol;
    }

    public static Polynomial multPolynomialMonomial(Polynomial p, Monomial m) {
        if (m.getCoefficient() == 0)
            return Polynomial.create(0, new double[] {});

        Polynomial result = p.clone();

        for (Monomial current : result.list) {
            current.setCoefficient(current.getCoefficient() * m.getCoefficient());
            current.setPower(current.getPower() + m.getPower());
        }
        result.power = result.list.getFirst().getPower();

        return result;
    }

    public static Polynomial multPolynomials(Polynomial p1, Polynomial p2) {
        Polynomial biggerPol = (p1.power > p2.power) ? p1.clone() : p2.clone();
        Polynomial smallerPol = (p1.power > p2.power) ? p2.clone() : p1.clone();

        Polynomial result = null;
        for (Monomial m : smallerPol.list) {
            if (result != null)
                result = Polynomial.addPolynomials(result, Polynomial.multPolynomialMonomial(biggerPol, m));
            else
                result = Polynomial.multPolynomialMonomial(biggerPol, m);
        }

        return result;
    }

    @Override
    public Polynomial clone() {
        try {
            Polynomial clone = (Polynomial) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.list = (LinkedList<Monomial>) list.clone();
            clone.list.clear();
            for (Monomial m : list) {
                clone.list.addLast(m.clone());
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
