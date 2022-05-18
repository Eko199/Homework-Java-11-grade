package RealHomework2.Week21.Recursion;

public class Problem1 {
    public static int xMethod(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum is " + xMethod(5));
    }
}
