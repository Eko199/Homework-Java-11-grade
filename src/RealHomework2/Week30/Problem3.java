package RealHomework2.Week30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("src\\RealHomework2\\Week30\\Salary.txt"))) {
            double assistantSalary = 0, associateSalary = 0, fullSalary = 0, facultySalary = 0;
            int assistantCount = 0, associateCount = 0, fullCount = 0, facultyCount = 0;

            while (scanner.hasNext()) {
                scanner.next();
                scanner.next();

                switch (scanner.next()) {
                    case "assistant" -> {
                        assistantSalary += Double.parseDouble(scanner.next());
                        assistantCount++;
                    }
                    case "associate" -> {
                        associateSalary += Double.parseDouble(scanner.next());
                        associateCount++;
                    }
                    case "full" -> {
                        fullSalary += Double.parseDouble(scanner.next());
                        fullCount++;
                    }
                }
            }

            facultySalary = assistantSalary + associateSalary + fullSalary;
            facultyCount = assistantCount + associateCount + fullCount;

            assistantSalary /= assistantCount;
            associateSalary /= associateCount;
            fullSalary /= fullCount;
            facultySalary /= facultyCount;

            System.out.println("Average assistant professor salary: " + assistantSalary);
            System.out.println("Average associate professor salary: " + associateSalary);
            System.out.println("Average full professor salary: " + fullSalary);
            System.out.println("Average faculty member salary: " + facultySalary);
        }
    }
}
