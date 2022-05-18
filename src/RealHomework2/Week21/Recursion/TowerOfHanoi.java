package RealHomework2.Week21.Recursion;

import java.util.*;

public class TowerOfHanoi {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        // Find the solution recursively
        System.out.println("The moves are:");
        System.out.println("Number of moves: " + moveDisks(n, 'A', 'B', 'C'));
    }
    /** The method for finding the solution to move n disks from fromTower to toTower with auxTower */

    public static int moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) { // Stopping condition
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            return 1;
        } else {
            int result = 0;
            result += moveDisks(n-1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            result++;
            result += moveDisks(n-1, auxTower, toTower, fromTower);
            return result;
        }
    }
}
