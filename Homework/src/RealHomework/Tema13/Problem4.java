package RealHomework.Tema13;

import java.util.Scanner;

public class Problem4 {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        StringBuilder sb = new StringBuilder(s2);
        for (int i = 0; i < s1.length(); i++) {
            if(sb.indexOf(String.valueOf(s1.charAt(i))) == -1)
                return false;
            else
                sb.deleteCharAt(sb.indexOf(String.valueOf(s1.charAt(i))));
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 words: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2))
            System.out.println("The words are anagrams.");
        else
            System.out.println("The words aren't anagrams.");
    }
}
