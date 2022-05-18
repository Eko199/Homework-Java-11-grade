package RealHomework2.Week27;

import java.util.Scanner;

/* There is no need to actually compute Math.sqrt(number) for every number. 
 * You need to look only for the perfect squares such as 4, 9, 16, 25, 36, 49, and so on. 
 * Note for all the numbers between 36 and 48, inclusively, their (int)(Math.sqrt(number)) is 6
 */

public class EfficientPrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Find all prime numbers <= n, enter n: ");
		int n = input.nextInt();
		
		// A list to hold prime numbers
		java.util.List<Integer> list = new java.util.ArrayList<>();
		
		final int NUMBER_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		int squareRoot = 1; // Check whether number <= squareRoot
		
		System.out.println("The prime numbers are \n");
		
		// Repeatedly find prime numbers
		while (number <= n) {
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?
			
			if (squareRoot * squareRoot < number) squareRoot++;
			
			// Test whether number is prime
			for (int k = 0; k < list.size() && list.get(k) <= squareRoot; k++) {
				if (number % list.get(k) == 0) { // If true, not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}
			
			// Print the prime number and increase the count
			if (isPrime) {
				count++; // Increase the count
				list.add(number); // Add a new prime to the list
				if (count % NUMBER_PER_LINE == 0) {
					// Print the number and advance to the new line
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
			}
			
			// Check whether the next number is prime
			number++;
		}
		
		System.out.println("\n" + count + " prime(s) less than or equal to " + n);
		input.close();
	}
}
