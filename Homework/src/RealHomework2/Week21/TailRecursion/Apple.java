package RealHomework2.Week21.TailRecursion;

import java.util.Scanner;

public class Apple {
    public static int apples(int price) {
        if (price / 3 == 0)
            return price % 3;
        if (price % 3 == 0)
            return 3 * apples(price / 3) + 1;
        else
            return apples(price - price % 3) + price % 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(apples(x));
    }
}
