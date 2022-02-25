package RealHomework2.Week21.Recursion;

public class Problem4 {
    public static boolean odd(int x) {
        if (x == 0)
            return false;
        else if (x == 1)
            return true;
        else
            return odd(x-2);
    }

    public static boolean even(int x) {
        if (x == 0)
            return true;
        else if (x == 1)
            return false;
        else
            return even(x-2);
    }

    public static void main(String[] args) {
        System.out.println(odd(17));
        System.out.println(odd(20));
        System.out.println(even(199));
        System.out.println(even(2002));
    }
}
