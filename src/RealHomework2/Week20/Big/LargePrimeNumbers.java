package RealHomework2.Week20.Big;

import java.math.BigInteger;

public class LargePrimeNumbers {
    public static void main(String[] args) {
        BigInteger x = BigInteger.valueOf(Long.MAX_VALUE);
        int counter = 0;

        while (counter < 5) {
            x = x.add(BigInteger.ONE);
            if (x.isProbablePrime(1)) {
                System.out.println(x);
                counter++;
            }
        }
    }
}
