package RealHomework2.Week21.TailRecursion;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Sum is " + xMethod(5));
    }

    public static int xMethod(int n) {
        return xMethod(n, 0);
    }

    private static int xMethod(int n, int result) {
        if (n == 0)
            return result;
        else
            return xMethod(n - 1, result + n);
    }
}
