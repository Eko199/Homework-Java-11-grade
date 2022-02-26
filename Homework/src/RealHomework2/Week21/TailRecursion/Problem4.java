package RealHomework2.Week21.TailRecursion;

import java.util.Scanner;

public class Problem4 {
    public static double power(double x, int n) {
        return power(x, n, 1);
    }

    private static double power(double x, int n, double result) {
        if (n == 0) {
            return result;
        } else {
            return power(x, n-1, result * x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(power(x, n));
    }
}
