package RealHomework.Tema12;

import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        double[][] arr = new double[rows][columns];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                arr[i][j] = sc.nextDouble();
        }

        Location location = Location.locateLargest(arr);
        System.out.println("The location of the largest element is " + location.maxValue
                + " at (" + location.row + ", " + location.column + ")");
    }
}
