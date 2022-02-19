package RealHomework2;

interface A {
    void methodA();
}
class B implements A {
    @Override
    public void methodA() {
        System.out.println("aaa");
    }
}
abstract class C {
    abstract void methodC();
}
class D extends C {
    @Override
    void methodC() {

    }
}
class E extends B {}


public class Tests {
    public static void main(String[] args) {
        String s1 ="ABC";
        String s2 = new String("ABC");
        String s3 = "AB" + "C";

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3 == s1);
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.equals(s1));

        //int num[] = {7,7,6,6,5,5,4,4};
        //for(int i = 0; i < 8; i = i + 2)
            //System.out.print(num[i]);

        int[][] num = {{3,3,3},{2,2,2}};
        int[] array = {4,3,2};
        for(int i = 0; i < 3; i++){
            num[1][i] = num[0][i]+array[i];
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(num[i][j]);
            }
            System.out.println();
        }

        String str = "Hello World";
        for(int i = 0; i < 4; i++) {
            System.out.println(str);
            str+= "!";
        }

        A a = new B();
        B b = new B();
        D d = new D();
        E e = new E();
        b.methodA();
        e.methodA();
        //C c = new C();
        //(D)c.methodC();
    }
}
