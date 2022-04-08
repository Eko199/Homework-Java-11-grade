package RealHomework2.Week26.Sets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) throws FileNotFoundException {
        Set<Character> vowelsSet = new HashSet<>(Set.of('A', 'E', 'I', 'O', 'U'));
        File file = new File("src/RealHomework2/Week26/Sets/problem1.txt");
        Scanner scanner = new Scanner(file);

        int count = 0;
        while (scanner.hasNext()) {
            for (char c : scanner.next().toCharArray()) {
                if (vowelsSet.contains(c))
                    count++;
            }
        }

        System.out.println(count);
    }
}
