package RealHomework2.Week21.Recursion;

public class Problem5 {
    public static String dec2Bin(int value) {
        if (value < 3)
            return "" + value % 2;

        return dec2Bin(value / 2) + (value % 2);
    }

    public static void main(String[] args) {
        System.out.println(dec2Bin(123));
    }
}
