package RealHomework2.Week21.Fractals;

import java.util.Scanner;

public class TurnOn {
    public static void changeState(int number, boolean on) {
        if (number != 1)
            changeStateExceptLast(number - 1, false);
        if (on)
            System.out.println("+" + number);
        else
            System.out.println("-" + number);
        if (number > 2 && on)
            changeState(number - 2, on);
        else if (number != 1 && !on)
            changeState(number - 1, on);
    }

    public static void changeStateExceptLast(int number, boolean on) {
        if (number != 1)
            changeStateExceptLast(number - 1, false);
        if (on)
            System.out.println("-" + number);
        else
            System.out.println("+" + number);
        if (number != 1)
            changeState(number - 1, false);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        changeState(sc.nextInt(), true);
    }
}
