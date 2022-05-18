package RealHomework2.Week25.Problems1;

import java.util.Scanner;
import java.util.Stack;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            switch (c) {
                case 'L' -> stack.push(c);
                case 'O' -> {
                    if (stack.isEmpty() || stack.peek() != 'L')
                        stack.push(c);
                }
                case 'T' -> {
                    while (!stack.isEmpty() && stack.peek() == 'O')
                        stack.pop();
                    stack.push(c);
                }
            }
        }

        System.out.println(stack.size());
    }
}
