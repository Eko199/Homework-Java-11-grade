package RealHomework2.Week25.Problems2;

import java.util.Scanner;
import java.util.Stack;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == 'L' && !stack.isEmpty() && stack.peek() == 'R')
                stack.pop();
            else if (c == 'R' || c == 'L')
                stack.push(c);
        }

        System.out.println(stack.size());
    }
}
