package RealHomework;

public class Main {

    public static void main(String[] args) {
        for (int i = 33; i < 127; i++) {
            char x = (char)i;
            System.out.print(x);
            System.out.print(' ');
            if ((i-33) % 10 == 9) System.out.println();
        }
    }
}
