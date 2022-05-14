package RealHomework2.Week30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Year\tRank 1\t\tRank 2\t\tRank 3\t\tRank 4\t\tRank 5\t\tRank 1\t\tRank 2\t\tRank 3\t\tRank 4\t\tRank 5");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (int year = 2010; year >= 2001; year--) {
            try (Scanner scanner = new Scanner(new File(
                    "Homework\\src\\RealHomework2\\Week30\\babynamesranking"+ year +".txt"))) {
                ArrayList<String> topMaleNames = new ArrayList<>();
                ArrayList<String> topFemaleNames = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        scanner.next();
                        topMaleNames.add(scanner.next());
                    } else
                        topFemaleNames.add(scanner.next());
                    scanner.next();
                }
                System.out.print(year + "\t");
                topFemaleNames.forEach(name -> System.out.printf("%-8s\t", name));
                topMaleNames.forEach(name -> System.out.printf("%-8s\t", name));
                System.out.println();
            }
        }
    }
}
