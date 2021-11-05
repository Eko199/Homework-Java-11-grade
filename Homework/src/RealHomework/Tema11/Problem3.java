package RealHomework.Tema11;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] rightAnswers = new char[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter answer " + i + ": ");
            rightAnswers[i] = sc.next().charAt(0);
        }

        int[] scores = new int[8];
        for (int score : scores)
            score = 0;

        char[][] studentAnswers = new char[8][10];
        for (int i = 0; i < 8; i++) {
            System.out.println("\nStudent " + i + ": \n");
            for (int j = 0; j < 10; j++) {
                System.out.println("Enter answer " + j + ": ");
                studentAnswers[i][j] = sc.next().charAt(0);
                if (studentAnswers[i][j] == rightAnswers[j])
                    scores[i]++;
            }
        }

        for (int i = 0; i < 8; i++)
            System.out.println("Student " + i + " score: " + scores[i]);
    }
}
