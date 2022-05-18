package RealHomework2.Week30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = Integer.parseInt(consoleInput.next());

        try (Scanner scanner = new Scanner(new File(
                "Homework\\src\\RealHomework2\\Week30\\babynamesranking"+ year +".txt"))) {
            System.out.print("Enter the gender: ");
            char gender = consoleInput.next().toLowerCase().charAt(0);

            System.out.print("Enter the name: ");
            String name = consoleInput.next();

            boolean f = false;
            int ranking = -1;
            while (scanner.hasNext()) {
                ranking = Integer.parseInt(scanner.next());

                if (gender == 'f') {
                    scanner.next();
                    scanner.next();
                }

                String currentName = scanner.next();
                if (name.equals(currentName)) {
                    f = true;
                    break;
                }

                scanner.nextLine();
            }

            if (f)
                System.out.printf("%s is ranked #%d in year %d", name, ranking, year);
            else
                System.out.printf("The name %s is not ranked in year %d", name, year);
        } catch (FileNotFoundException e) {
            System.out.println("Invalid year input.");
        }
    }
}
