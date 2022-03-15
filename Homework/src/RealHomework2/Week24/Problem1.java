package RealHomework2.Week24;

import java.util.Scanner;
import java.util.Stack;

public class Problem1 {
    public static void main(String[] args) {
        Stack<Integer> operandStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isValid = true;
        for (int i = 0; i < input.length() && isValid; i++) {
            char current = input.charAt(i);

            if (Character.isDigit(current)) {
                operandStack.push(Character.getNumericValue(current));
            } else {
                if (operandStack.size() < 2) {
                    isValid = false;
                    break;
                }

                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                switch (current) {
                    case '+' -> operandStack.push(operand1 + operand2);
                    case '-' -> operandStack.push(operand1 - operand2);
                    case '*' -> operandStack.push(operand1 * operand2);
                    case '/' -> operandStack.push(operand1 / operand2);
                    case '^' -> operandStack.push((int) Math.pow(operand1, operand2));
                    default -> isValid = false;
                }
            }
        }

        if (!isValid || operandStack.size() != 1)
            System.out.println("Invalid input for postfix.");
        else
            System.out.println(operandStack.pop());
    }
}
