package com.module2;

// 27) WAP to print the Reverse of the given number.

public class Lab27 {

	public static void main(String[] args) {

		int num = 1234;
		int sum = 0;
	
		while (num != 0) {
			int digit = num % 10;
			sum = sum * 10 + digit ;
			 num = num / 10;  // Changing the Number
		}
	
			System.out.println(" Reverse  Number is "+ sum);
		
		
	}
}

// Iterations : i= 1  => N
// Iterations : i= 2  => N-1 