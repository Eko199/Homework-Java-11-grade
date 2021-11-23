package RealHomework.Tema14;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public boolean isPrime() {
        if (value < 1) return false;
        for (int i = 2; i <= value/2; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static boolean isOdd(int x) {
        return x % 2 == 1;
    }

    public static boolean isPrime(int x) {
        return new MyInteger(x).isPrime();
    }

    public static boolean isEven(MyInteger x) {
        return x.isEven();
    }

    public static boolean isOdd(MyInteger x) {
        return x.isOdd();
    }

    public static boolean isPrime(MyInteger x) {
        return x.isPrime();
    }

    public boolean equals(int x) {
        return value == x;
    }

    public boolean equals(MyInteger x) {
        return value == x.getValue();
    }

    public static int parseInt(char[] arr) throws Exception {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (a < 48 || a > 57) {
                throw new Exception("Char array isn't numeric.");
            } else {
                x += (a - 48) * Math.pow(10, arr.length - 1 - i);
            }
        }
        return x;
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
