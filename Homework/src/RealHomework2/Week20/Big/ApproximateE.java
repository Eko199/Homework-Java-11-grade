package RealHomework2.Week20.Big;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApproximateE {
    public static BigDecimal factorial(int n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(new BigDecimal(String.valueOf(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("%3c", 'i');
        System.out.println("             e");
        System.out.println("---------------------------------");

        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal e = BigDecimal.ONE;
            System.out.printf("%4d", i);
            for (int j = 1; j <= i; j++) {
                e = e.add(BigDecimal.ONE.divide(factorial(j), 25, RoundingMode.HALF_EVEN));
            }
            System.out.printf("%29s", e);
            System.out.println();
        }
    }
}
