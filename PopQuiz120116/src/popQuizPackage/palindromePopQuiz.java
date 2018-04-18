package popQuizPackage;

import java.util.*;

public class palindromePopQuiz {

	public static void main(String[] args) {
		
		
		Scanner kbrd = new Scanner(System.in);
		String palindrome = "";
		String newPalindrome = "";
		
		System.out.println("Please enter a palindrome: ");
		palindrome = kbrd.nextLine();
		
		Stack<Character> letters = new Stack<>();
		for (int i = 0; i < palindrome.length(); i++) {
			letters.push(palindrome.charAt(i));
		}
		
		for (int i = 0; i < palindrome.length(); i++) {
			newPalindrome += letters.pop();
		}
		System.out.println(newPalindrome);
		
		
		if (palindrome.equals(newPalindrome)) {
			System.out.println("That is a palindrome!");
		} else {
			System.out.println("That is NOT a palindrome!");
		}
		
		kbrd.close();
	}

}
