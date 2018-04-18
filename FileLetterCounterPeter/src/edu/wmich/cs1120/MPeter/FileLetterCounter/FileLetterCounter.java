package edu.wmich.cs1120.MPeter.FileLetterCounter;

import java.io.*;
import java.util.Scanner;

public class FileLetterCounter {

	public static void main(String[] args) throws IOException {
		
		Scanner kbrd = new Scanner (System.in);
		
		String nameOfFile;
		String fileContents = "";
		
		char wantedCharacter;
		int letterCount = 0;
		
		System.out.print("Please enter the name of the file: ");
		nameOfFile = kbrd.nextLine();
		
		System.out.print("Please enter a character: ");
		wantedCharacter = kbrd.nextLine().charAt(0);
		
		
		File f = new File(nameOfFile);
		Scanner fScanner = new Scanner(f);
		while (fScanner.hasNextLine()) {
			fileContents = fileContents + fScanner.nextLine();
		}


		for (int i = 0; i < fileContents.length(); i++) {
			if (fileContents.charAt(i) == wantedCharacter) {
				letterCount++;
			}
		}
		
		System.out.println(letterCount);
		
		kbrd.close();
		fScanner.close();

	}

}
