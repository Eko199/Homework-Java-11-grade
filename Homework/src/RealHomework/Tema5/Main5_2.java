package RealHomework.Tema5;
import java.util.Scanner;

public class Main5_2 {
    //ChecksumCalculator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN:");
        int input = sc.nextInt();
        String inputStr = String.valueOf(input);
        String isbn = "";

        int lastDigit = 0;
        for (int i=9; i>0; i--) {
            lastDigit += (input % 10) * i;
            if (input > 0) input /= 10;
            else isbn += "0";
        }
        lastDigit %= 11;

        isbn += inputStr;
        isbn += (lastDigit == 10) ? "X" : String.valueOf(lastDigit);
        System.out.println("The ISBN-10 number is " + isbn);
    }
}
