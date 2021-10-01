package com.company;
import java.util.Scanner;

public class Main6_3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        double result = 0D;
        for (int i=n; i > 0; i--) {
            result += 1.0/i;
        }
        System.out.printf("Result is: " + result);
    }
}
