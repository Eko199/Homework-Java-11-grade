package RealHomework2.Week30;

import java.io.*;
import java.util.Scanner;

public class Problem1_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\RealHomework2\\Week30\\names.txt");
        writeInFile("Blago", file);
        System.out.println(readInFile("Viktor", file));
    }

    public static int readInFile(String line, File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            int i = 1;
            boolean f = false;
            String currentLine = scanner.nextLine();

            while (scanner.hasNext()) {
                if (currentLine.equals(line)) {
                    f = true;
                    break;
                }
                currentLine = scanner.nextLine();
                i++;
            }

            return (f) ? i : -1;
        }
    }

    public static void writeInFile(String name, File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            StringBuilder str = new StringBuilder();
            String current;
            boolean f = false;

            while (scanner.hasNext()) {
                current = scanner.nextLine();
                if (current.compareTo(name) < 0 || f)
                    str.append(current).append("\n");
                else {
                    str.append(name).append("\n").append(current).append("\n");
                    f = true;
                }
            }

            if (!f)
                str.append(name);

            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.println(str);
            }
        }
    }
}
