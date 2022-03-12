package RealHomework2.Week23.Polynomials;

public class PolynomialTest {
    public static void main(String[] args) {
        Polynomial p1 = Polynomial.create(3, new double[] {1, 3, 0, 4});
        Polynomial p2 = Polynomial.create(2, new double[] {0, 2, 5});
        Polynomial.addPolynomials(p1, p2).print();
        p1.print();
        p2.print();
        Polynomial.multPolynomialMonomial(p2, new Monomial(2, 1)).print();
        p2.print();

        Polynomial p3 = Polynomial.create(1, new double[] {1, 1});
        Polynomial p4 = p3.clone();
        p3.print();
        p4.print();
        Polynomial.multPolynomials(p3, p4).print();
    }
}
