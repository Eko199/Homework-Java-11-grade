package RealHomework.Tema16;

import java.math.BigInteger;

public class Problem1 {
    public static void main(String[] args) {
        BigInteger x = BigInteger.TEN.pow(50);
        BigInteger[] result = new BigInteger[10];

        int count = 0;
        while (count != 10) {
            if (x.mod(BigInteger.TWO).equals(BigInteger.ZERO) ||
                    x.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
                result[count] = x;
                count++;
            }
            x = x.add(BigInteger.ONE);
        }

        for (BigInteger big : result)
            System.out.println(big);
    }
}
