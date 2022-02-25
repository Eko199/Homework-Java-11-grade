package random.Ma3;

import java.io.*;
import java.util.Scanner;

public class PowersFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = sc.nextInt();
            PrintWriter writer = new PrintWriter(new FileOutputStream("log.txt"));
            for (int i = 0; Math.pow(n, i) < 1000000000L; i++) {
                writer.println(Math.pow(n, i));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
