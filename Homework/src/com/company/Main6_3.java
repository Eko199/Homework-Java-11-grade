package com.company;
import java.util.Scanner;

public class Main6_3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        double result = 0;
        for (int i=n; i > 0; i--) {
            result += 1.0/i;
        }
        double result2 = 0;
        for (int i=1; i <= n; i++) {
            result2 += 1.0/i;
        }
        System.out.println("Result 1 is: " + result);
        System.out.println("Result 2 is: " + result2);
    }
}
