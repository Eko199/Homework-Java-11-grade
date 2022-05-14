package RealHomework2.Week30;

import java.io.File;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
	public static void main(String[] args) throws java.io.IOException {
		 File file = new File("scores.txt");
		 if (file.exists()) {
			 System.out.println("File already exists");
			 System.exit(1);
		 }
		 // Create a file
		 try(PrintWriter output = new PrintWriter(file);)
		 {
			 // Write formatted output to the file
			 output.print("John T Smith ");
			 output.println(90);
			 output.print("Eric K Jones ");
			 output.println(85);
		 }
	}

}
