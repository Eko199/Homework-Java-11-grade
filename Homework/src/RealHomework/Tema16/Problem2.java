package RealHomework.Tema16;

import java.math.BigInteger;

public class Problem2 {
    public static void main(String[] args) {
        BigInteger x = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        BigInteger[] result = new BigInteger[10];

        int count = 0;
        while (count != 10) {
            if (x.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                    x.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO)) {
                result[count] = x;
                count++;
            }
            x = x.add(BigInteger.ONE);
        }

        for (BigInteger big : result)
            System.out.println(big);
    }
}
