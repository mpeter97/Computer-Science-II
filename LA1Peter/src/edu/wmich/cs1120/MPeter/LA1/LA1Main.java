/*
 * AUTHOR: Matt Peter
 * DATE: 9/28/16
 * CLASS/ASSIGNMENT: CS1120-545 LA1
 * DESCRIPTION:
 */

package edu.wmich.cs1120.MPeter.LA1;

import java.util.Scanner;

public class LA1Main {

	public static void main(String[] args) {
		
		// Declare and Instantiate a Scanner object
		Scanner kbrd = new Scanner(System.in);
		
		// Declare and Instantiate two Integer variables and a Boolean variable
		boolean inputValid = false;				// Used to tell when input is valid
		int rows = 0;							// Number of rows in array
		int columns = 0;						// Number of columns in array
		
		System.out.println("Enter number of rows in range [5, 20]:");
		
		// Enter a do-while loop that will get valid input from the user
		do {
			// If the user enters an integer...
			if (kbrd.hasNextInt()) {
				rows = kbrd.nextInt();
				// If the entered integer is outside of the range...
				if (rows > 20 || rows < 5) {
					// Print a message
					System.out.println("Invalid input!");
					System.out.println("Enter number of rows in range [5, 20]:");
				// Otherwise...
				} else {
					// Allow the loop to end by setting inputValid to true
					inputValid = true;
				}
			// If the user does NOT enter an integer...
			} else {
				// Print a message and clear the input buffer
				System.out.println("Input must be an integer. Re-enter:");
				kbrd.nextLine();
			}
		} while (!inputValid);
		
		// Reset inputValid
		inputValid = false;
		
		System.out.println("Enter number of rows in range [5, 20]:");
		System.out.println("This must be different from number of rows:");
		
		// Enter another do-while loop identical to the first one EXCEPT that it will
		//   also check to make sure that this input is not the same as the first
		do {
			if (kbrd.hasNextInt()) {
				columns = kbrd.nextInt();
				if (columns > 20 || columns < 5) {
					System.out.println("Invalid input!");
					System.out.println("Enter number of rows in range [5, 20]:");
					System.out.println("This must be different from number of rows:");
				} else if (columns == rows) {
					System.out.println("Number of columns is the same as number of rows!");
					System.out.println("Enter number of rows in range [5, 20]:");
					System.out.println("This must be different from number of rows:");
				} else {
					inputValid = true;
				}
			} else {
				System.out.println("Input must be an integer. Re-enter:");
				kbrd.nextLine();
			}
		} while (!inputValid);
		
		// Declare and Instantiate a ProcessArray object using the rows and columns
		//   values that have been received from the user
		ProcessArray process = new ProcessArray(rows, columns);
		
		// Fill firstArray with randomly generated values
		process.randomlyFillArray();
		
		// Compute the values for secondArray
		process.computeArrayValues();
		
		// Print out the values of firstArray
		System.out.println("\nInitial array with random numbers:\n");
		process.printArray(process.getFirstArray());
		
		// Print out the values of secondArray
		System.out.println("\nComputed array:\n");
		process.printArray(process.getSecondArray());
		
		// Close the Scanner object
		kbrd.close();
		
	}

}
