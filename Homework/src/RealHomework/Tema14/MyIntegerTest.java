package RealHomework.Tema14;

public class MyIntegerTest {
    public static void main(String[] args) throws Exception {
        MyInteger x = new MyInteger(0);
        MyInteger y = new MyInteger(2);
        MyInteger z = new MyInteger(7);

        System.out.println(x.isEven());
        System.out.println(z.isEven());
        System.out.println();

        System.out.println(x.isOdd());
        System.out.println(z.isOdd());
        System.out.println();

        System.out.println(x.isPrime());
        System.out.println(y.isPrime());
        System.out.println(z.isPrime());
        System.out.println();

        System.out.println(MyInteger.isEven(x.getValue()));
        System.out.println(MyInteger.isEven(z.getValue()));
        System.out.println();

        System.out.println(MyInteger.isOdd(x.getValue()));
        System.out.println(MyInteger.isOdd(z.getValue()));
        System.out.println();

        System.out.println(MyInteger.isPrime(x.getValue()));
        System.out.println(MyInteger.isPrime(y.getValue()));
        System.out.println(MyInteger.isPrime(z.getValue()));
        System.out.println();

        System.out.println(MyInteger.isEven(x));
        System.out.println(MyInteger.isEven(z));
        System.out.println();

        System.out.println(MyInteger.isOdd(x));
        System.out.println(MyInteger.isOdd(z));
        System.out.println();

        System.out.println(MyInteger.isPrime(x));
        System.out.println(MyInteger.isPrime(y));
        System.out.println(MyInteger.isPrime(z));
        System.out.println();

        System.out.println(x.equals(y.getValue()));
        System.out.println(x.equals(0));
        System.out.println(x.equals(z));
        System.out.println();

        System.out.println(MyInteger.parseInt(new char[]{'1', '2', '3'}) + 1);
        System.out.println(MyInteger.parseInt("123") - 15);
        System.out.println(MyInteger.parseInt(new char[]{'1', 'a', '3'}) + 1);
    }
}
