package RealHomework2.Week20.Big;

import java.math.BigInteger;

public class MersennePrime {
    public static void main(String[] args) {
        System.out.printf("%3c", 'p');
        System.out.println("             2^p - 1");
        System.out.println("-----------------------");

        for (int p = 1; p <= 100; p++) {
            BigInteger x = BigInteger.valueOf((long) Math.pow(2L, p) - 1L);
            if (x.isProbablePrime(1)) {
                System.out.printf("%3d", p);
                System.out.printf("%20s", x.toString());
                System.out.println();
            }
        }
    }
}
