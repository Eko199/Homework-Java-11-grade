package RealHomework2.Week27;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise {
    public static Set<Integer> divisorsOf(int x) {
        if (isPrime(x))
            return null;

        Set<Integer> divisors = new HashSet<>();
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                divisors.add(i);
                x /= i;
                i = 1;
            }
        }

        return divisors;
    }

    public static boolean isPrime(int x) {
        if (x <= 1)
            return false;
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();

        if (isPrime(x))
            System.out.printf("%d is prime.", x);
        else {
            System.out.printf("The prime divisors of %d are: ", x);
            for (int divisor : divisorsOf(x))
                System.out.print(divisor + " ");
        }
    }
}
