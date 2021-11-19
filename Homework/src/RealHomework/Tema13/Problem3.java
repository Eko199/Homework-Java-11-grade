package RealHomework.Tema13;

import java.util.Scanner;

public class Problem3 {
    static boolean isValidPassword(String password) {
        return password.matches("(?=(.*\\d){2})[a-zA-Z0-9]{8,}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        if (isValidPassword(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}
