package RealHomework.BonusTema;

import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first complex number: ");
        Complex num1 = new Complex(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter the second complex number: ");
        Complex num2 = new Complex(sc.nextDouble(), sc.nextDouble());

        System.out.printf("%s + %s = %s", num1.toString(), num2.toString(), num1.add(num2).toString());
        System.out.println();
        System.out.printf("%s - %s = %s", num1.toString(), num2.toString(), num1.substract(num2).toString());
        System.out.println();
        System.out.printf("%s * %s = %s", num1.toString(), num2.toString(), num1.multiply(num2).toString());
        System.out.println();
        System.out.printf("%s / %s = %s", num1.toString(), num2.toString(), num1.divide(num2).toString());
        System.out.println();
        System.out.printf("|%s| = %.2f", num1.toString(), num1.abs());
        System.out.println();
        System.out.printf("|%s| = %.2f", num2.toString(), num2.abs());
    }
}
