package RealHomework2.Week26.Sets;

import java.util.*;
import java.io.*;

public class CountKeywords {
	public static void main(String[] args) throws Exception {
		File file = new File("src/RealHomework2/Week26/Sets/TestHashSet.java");
		if (file.exists()) {
			System.out.println("The number of keywords is " + countKeywords(file));
		} else {
			System.out.println("File does not exist");
		}

	}

	public static int countKeywords(File file) throws Exception {
		// Array of all Java keywords + true, false and null
		String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };
		Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
		int count = 0;
		int flag = -1;

		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String word = input.next();

			while (word.contains("/*") || (word.contains("*/") && flag == 0)) {
				if (word.contains("/*")) {
					word = word.replaceFirst("\\w*/\\*", "");
					flag = 0;
				}

				if (word.contains("*/") && flag == 0) {
					word = word.replaceFirst("\\w*\\*/", "");
					flag = -1;
				}
			}

			if (word.contains("//") && flag == -1) {
				input.nextLine();
				continue;
			}

			while (word.contains("\"") && flag != 0) {
				word = word.replaceFirst("\\w*\"", "");
				flag = (flag == 1) ? -1 : 1;
			}

			if (keywordSet.contains(word) && flag == -1)
				count++;
		}
		input.close();
		return count;
		
	}
}