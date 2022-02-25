package RealHomework2.Week21.Recursion;

import java.util.Scanner;

public class Problem3 {
    public static double recursionMethod(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * recursionMethod(x, n-1);
        }
    }

    public static double iterationMethod(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.printf("Recursion: %f \n", recursionMethod(x, n));
        System.out.printf("Iteration: %f \n", iterationMethod(x, n));
    }
}
