package RealHomework.Tema13;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Social Security number in the format DDD-DD-DDDD: ");
        String ssn = sc.nextLine();

        if (ssn.matches("\\d{3}-\\d{2}-\\d{4}"))
            System.out.println("Valid SSN");
        else
            System.out.println("Invalid SSN");
    }
}
