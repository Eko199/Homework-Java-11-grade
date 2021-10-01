package com.company;
import java.util.Scanner;

public class Main5_3 {
    //RectanglesDetector
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

        if (rect1[0] <= rect2[0] && rect1[1] >= rect2[1] && rect1[2] >= rect2[2] && rect1[3] <= rect2[3]) {
            System.out.println("Second rectangle is contained in first rectangle.");
        } else if (rect2[0] <= rect1[0] && rect2[1] >= rect1[1] && rect2[2] >= rect1[2] && rect2[3] <= rect1[3]) {
            System.out.println("First rectangle is contained in second rectangle.");
        } else {
            System.out.println("Neither of the rectangles is contained in the other.");
        }
    }
}
