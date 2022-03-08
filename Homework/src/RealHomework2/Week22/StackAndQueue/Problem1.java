package RealHomework2.Week22.StackAndQueue;

import java.util.Scanner;

public class Problem1 {
    public static boolean areCorrespondingBraces(char opening, char closing) {
        return switch (opening) {
            case '(' -> closing == ')';
            case '[' -> closing == ']';
            case '{' -> closing == '}';
            default -> false;
        };
    }

    public static boolean isClosingBrace(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    public static boolean isValid(String str) {
        StackOfChars stack = new StackOfChars(str.length());

        for (int i = str.length() - 1; i >= 0; i--) {
            char current = str.charAt(i);
            if (isClosingBrace(current))
                stack.push(current);
            else if (!stack.empty() && areCorrespondingBraces(current, stack.peek()))
                stack.pop();
            else
                return false;
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        boolean isValidString = isValid(sc.nextLine());

        if (isValidString)
            System.out.println("The string is valid.");
        else
            System.out.println("The string is invalid.");
    }
}
