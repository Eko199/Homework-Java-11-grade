package RealHomework2.Week25.Problems2;

import java.util.Scanner;
import java.util.Stack;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> speedLimit = new Stack<>();
        int distance = scanner.nextInt();
        double time = 0;
        int currentDistance = 0, traveled = 0;

        while (distance - currentDistance > 10) {
            currentDistance = scanner.nextInt();
            int maxVelocity = scanner.nextInt();
            if (maxVelocity == -1) {
                time += 1.0 * (currentDistance - traveled) / speedLimit.pop();
            } else {
                time += 1.0 * (currentDistance - traveled) / ((speedLimit.isEmpty()) ? 80 : speedLimit.peek());
                speedLimit.push(maxVelocity);
            }
            traveled = currentDistance;
        }

        time += 1.0 * (distance - traveled) / ((speedLimit.isEmpty()) ? 80 : speedLimit.peek());
        System.out.printf("%.2f", time);
    }
}
