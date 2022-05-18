package RealHomework.Tema5;
import java.util.Scanner;

public class Main5_3 {
    //RectanglesDetector

    public static boolean isPointInRect(int x, int y, int rectX1, int rectY1, int rectX2, int rectY2) {
        return (x >= rectX1 && x <= rectX2 && y <= rectY1 && y >= rectY2);
    }

    public static void main(String[] args) {
        int[] rect1 = new int[4]; //upper left x and y, down right x and y
        int[] rect2 = new int[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("First rectangle upper left x:");
        rect1[0] = sc.nextInt();
        System.out.println("First rectangle upper left y:");
        rect1[1] = sc.nextInt();
        System.out.println("First rectangle down right x:");
        rect1[2] = sc.nextInt();
        System.out.println("First rectangle down right y:");
        rect1[3] = sc.nextInt();
        System.out.println("Second rectangle upper left x:");
        rect2[0] = sc.nextInt();
        System.out.println("Second rectangle upper left y:");
        rect2[1] = sc.nextInt();
        System.out.println("Second rectangle down right x:");
        rect2[2] = sc.nextInt();
        System.out.println("Second rectangle down right y:");
        rect2[3] = sc.nextInt();

        if (isPointInRect(rect2[0], rect2[1], rect1[0], rect1[1], rect1[2], rect1[3]) && isPointInRect(rect2[2], rect2[3], rect1[0], rect1[1], rect1[2], rect1[3])) {
            System.out.println("Second rectangle is contained in first rectangle.");
        } else if (isPointInRect(rect1[0], rect1[1], rect2[0], rect2[1], rect2[2], rect2[3]) && isPointInRect(rect1[2], rect1[3], rect2[0], rect2[1], rect2[2], rect2[3])) {
            System.out.println("First rectangle is contained in second rectangle.");
        } else {
            System.out.println("Neither of the rectangles is contained in the other.");
            if (isPointInRect(rect2[0], rect2[1], rect1[0], rect1[1], rect1[2], rect1[3]) || isPointInRect(rect2[2], rect2[3], rect1[0], rect1[1], rect1[2], rect1[3]) ||
                    isPointInRect(rect2[0], rect2[3], rect1[0], rect1[1], rect1[2], rect1[3]) || isPointInRect(rect2[2], rect2[1], rect1[0], rect1[1], rect1[2], rect1[3])) {
                System.out.println("The rectangles intersect.");
            } else System.out.println("The rectangles don't intersect.");
        }
    }
}
