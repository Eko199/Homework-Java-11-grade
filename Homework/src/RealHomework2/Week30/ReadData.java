package RealHomework2.Week30;

import java.io.File;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws Exception   {
		File file = new File("scores.txt");
		 
		// Create a Scanner for the file
		Scanner input = new Scanner(file);
		
		// Read data from a file
		while (input.hasNext()) {
			String firstName = input.next();
			String mi = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.println(firstName + " " + mi + " " + lastName + " " + score);
		}
		
		// Close the file

		 //StringBuilder
		input.close();

	}

}
