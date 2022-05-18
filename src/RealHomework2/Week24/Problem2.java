package RealHomework2.Week24;

import java.util.Stack;

public class Problem2 {
    public static int operationWeight(char operation) {
        return switch (operation) {
            case '^' -> 0;
            case '*', '/' -> 1;
            case '+', '-' -> 2;
            default -> -1;
        };
    }

    public static String infixToPostfix(String expression) {
        StringBuilder c = new StringBuilder();
        Stack<Character> s = new Stack<>();

        for (char character : expression.toCharArray()) {
            if (Character.isDigit(character)) {
                c.append(character);
                continue;
            }
            switch (character) {
                case '(' -> s.push(character);
                case '+', '-', '*', '/', '^' -> {
                    while (!s.empty() && operationWeight(s.peek()) != -1 &&
                            operationWeight(s.peek()) <= operationWeight(character)) {
                        c.append(s.pop());
                    }
                    s.push(character);
                }
                case ')' -> {
                    while (!s.empty() && s.peek() != '(') {
                        c.append(s.pop());
                    }
                    s.pop();
                }
            }
        }

        while (!s.empty() && s.peek() != '(')
            c.append(s.pop());

        return c.toString();
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("2*(1+3)"));
    }
}
