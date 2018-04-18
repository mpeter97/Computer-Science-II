/*
 * DESCRIPTION:
 */

package edu.wmich.cs1120.MPeter.LA1;

import java.util.Random;

public class ProcessArray {
	private int rows;
	private int columns;
	private int[][] firstArray;
	private int[][] secondArray;
	
	public ProcessArray(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		firstArray = new int[rows][columns];
		secondArray = new int[rows][columns];
		initializeArray(firstArray);
		initializeArray(secondArray);
	}
	
	private void initializeArray(int[][] array) {
		// Loop through all the cells in the arrays
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Set the current cell's value to 0
				array[i][j] = 0;
			}
		}
	}
	
	public void randomlyFillArray() {
		// Declare and instantiate a Random object
		Random rand = new Random();
		
		// Loop through all the cells in the arrays
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Set the current cell in firstArray's value equal to a random 
				//   integer ranging from 0 to 15, included
				firstArray[i][j] = rand.nextInt(16);
			}
		}
	}
	
	public void computeArrayValues() {
		// Loop through all the cells in the arrays
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Declare and instantiate a variable (total) that will hold the 
				//   value for the current cell in secondArray
				int total = 0;
				
				// If you are not in the top row...
				if (i != 0) {
					// Add the value above you to total
					total += firstArray[i - 1][j];
					
					// If you are not in the left-most column...
					if (j != 0) {
						// Add the values above-left of you to total
						total += firstArray[i - 1][j - 1];
					}
					// If you are not in the right-most column...
					if (j != columns - 1) {
						// Add the values above-right of you to total
						total += firstArray[i - 1][j + 1];
					}
				}
				// If you are not in the bottom row...
				if (i != rows - 1) {
					// Add the value below you to total
					total += firstArray[i + 1][j];
					
					// If you are not in left-most column...
					if (j != 0) {
						// Add the value below-left of you to total
						total += firstArray[i + 1][j - 1];
					}
					// If you are not in the right-most column...
					if (j != columns - 1) {
						// Add the values below-right of you to total
						total += firstArray[i + 1][j + 1];
					}
				}
				// If you are not in the left-most column...
				if (j != 0) {
					// Add the value left of you to total
					total += firstArray[i][j - 1];
				}
				// If you are not in the right-most column...
				if (j != columns - 1) {
					// Add the value right of you to total
					total += firstArray[i][j + 1];
				}
				
				// Set the value of the current cell in secondArray equal to total
				secondArray[i][j] = total;
			}
		}
	}
	
	public void printArray(int[][] array) {
		// Loop through all the cells in the arrays
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Print out the selected value using printf so that every value
				//   will take up 4 spaces
				System.out.printf("%4d", array[i][j]);
			}
			// Go to the next line after each row is printed
			System.out.println();
		}
	}
	
	public int[][] getFirstArray() {
		return firstArray;
	}
	
	public int[][] getSecondArray() {
		return secondArray;
	}
	
}
