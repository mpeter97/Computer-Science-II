package edu.wmich.cs1120.MPeter.HelloWorld;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		long result = factorial(10);
		System.out.print(result);
	}
	
	public static long factorial(int num) {
		if (num == 0)
			return 1;
		return (num * factorial(num - 1));
	}
}
