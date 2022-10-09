package com.module2;

// 21) WAP to find the Factorial of given Number.

public class Lab21{

	public static void main(String[] args) {

		int num = 1;
		int fact = 1;
		for(int i=2; i<= num;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is : "+ fact);

	}
}

// Iterations : i= 1  => N
// Iterations : i= 2  => N-1 
// For Large Numbers , use BigInteger class