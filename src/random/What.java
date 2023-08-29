package random;

public class What {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        boolean back = false;
        while (true) {
            if (!(y%19999999 == 0)) {
                y++;
            } else {
                for (int i = 0; i < x; i++) System.out.print(' ');
                if (x == 0) back = false;
                else if (x == 120) back = true;
                if (back) x--;
                else x++;
                System.out.println('O');
                y++;
            }
        }
    }
}
