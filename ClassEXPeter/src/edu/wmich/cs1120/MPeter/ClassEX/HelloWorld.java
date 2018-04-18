package edu.wmich.cs1120.MPeter.ClassEX;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String numbersAsString;
		int[] numbersAsIntArray = new int[10];
		int sum = 0;
		int highestDigit = 0;
		int lowestDigit = 0;
		
		System.out.print("Please enter a series of 10 single-digit numbers: ");
		numbersAsString = s.nextLine();
		
		numbersAsIntArray = convertStringToIntArray(numbersAsString);
		sum = findSum (numbersAsIntArray);
		highestDigit = findHighest(numbersAsIntArray);
		lowestDigit = findLowest(numbersAsIntArray);
		
		System.out.println("\nSum: " + sum);
		System.out.println("Highest Digit: " + highestDigit);
		System.out.println("Lowest Digit: " + lowestDigit);
		
		s.close();
		
	}
	
	public static int[] convertStringToIntArray(String str) {
		int[] tempIntArray = new int[10];
		
		for (int i = 0; i < str.length(); i++) {
			tempIntArray[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		
		return tempIntArray;
	}
	
	public static int findSum (int[] numbers) {
		int temp = 0;
		int i = 0;
		
		while (i < numbers.length) {
			temp += numbers[i];
			i++;
		}
		
		return temp;
	}
	
	public static int findHighest(int[] numbers) {
		int highest = -1;
		int i = 0;
		
		do {
			if (numbers[i] > highest) {
				highest = numbers[i];
			}
			i++;
		} while (i < numbers.length);
			
		return highest;
	}
	
	public static int findLowest(int[] numbers) {
		int lowest = 10;
		int i = 0;
		
		do {
			if (numbers[i] < lowest) {
				lowest = numbers[i];
			}
			i++;
		} while (i < numbers.length);
			
		return lowest;
	}
}
