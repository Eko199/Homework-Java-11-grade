package RealHomework2.Week21.TailRecursion;

import java.util.Scanner;

public class Problem2 {
    public static int foo (int x, int y)
    {
        if (y == 0)
            return x;
        else
            return foo(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(foo(x, y));
        //намира НОД на двете числа по алгоритъма на Евклид
    }
}
