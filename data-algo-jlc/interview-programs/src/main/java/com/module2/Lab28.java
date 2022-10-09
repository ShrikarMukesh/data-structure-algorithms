package com.module2;

//  28) WAP to find whether given number is Palindrome or not.

public class Lab28 {

	public static void main(String[] args) {

		int num = 121;
		int numCopy = num;
		int rev = 0;
	
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit ;
			 num = num / 10;  // Changing the Number
		}
	
		if(numCopy == rev)
			System.out.println( numCopy + " is Palindrome");
		else
			System.out.println( numCopy + " is NOT Palindrome");
		
		
	}
}

// Iterations : i= 1  => N
// Iterations : i= 2  => N-1 