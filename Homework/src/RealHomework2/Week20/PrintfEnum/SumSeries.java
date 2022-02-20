package RealHomework2.Week20.PrintfEnum;

public class SumSeries {
    public static void main(String[] args) {
        double m;

        System.out.printf("%-8c", 'I');
        System.out.println("m(i)");
        System.out.println("---------------");

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-8d", i);
            m = 0;
            for (int j = 1; j <= i; j++) {
                m += 1.0 * j / (j+2);
            }
            System.out.printf("%-8.4f", m);
            System.out.println();
        }
    }
}
