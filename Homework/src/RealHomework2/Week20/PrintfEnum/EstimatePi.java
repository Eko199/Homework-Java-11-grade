package RealHomework2.Week20.PrintfEnum;

public class EstimatePi {
    public static void main(String[] args) {
        double m;

        System.out.printf("%-8c", 'i');
        System.out.println("m(i)");
        System.out.println("---------------");

        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-8d", i);
            m = 0;
            for (int j = 1; j <= i; j++) {
                m += Math.pow(-1, j+1) / (2*j - 1);
            }
            m *= 4;
            System.out.printf("%-8.4f", m);
            System.out.println();
        }
    }
}
