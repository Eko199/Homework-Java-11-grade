package RealHomework2.Week26.Maps;

import java.util.*;
import java.io.*;

public class Problem3 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/RealHomework2/Week26/Maps/Problem1.java");
		if (file.exists()) {
			countKeywords(file);
		} else {
			System.out.println("File does not exist");
		}
	}

	public static void countKeywords(File file) throws Exception {
		// Array of all Java keywords + true, false and null
		String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };
		Map<String, Integer> keywordMap = new HashMap<>();

		for (String keyword : keywordString)
			keywordMap.put(keyword, 0);

		int count = 0;

		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String word = input.next();
			if (keywordMap.containsKey(word)) {
				count++;
				keywordMap.put(word, keywordMap.get(word) + 1);
			}
		}
		input.close();

		System.out.println("The number of keywords is " + count);
		keywordMap.forEach((keyword, number) -> {
			if (number != 0)
				System.out.println(keyword + ": " + number);
		});
	}
}