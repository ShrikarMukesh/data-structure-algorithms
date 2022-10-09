package com.module2;

// 25) WAP to find whether given number is armstrong or not.

public class Lab25 {

	private static int cube(int num) {

		return num * num * num;
		
	}

	public static void main(String[] args) {

		int num = 153;
		int sum = 0;
		int numCopy = num;
		while (num != 0) {
			int digit = num % 10;
			sum = sum + cube(digit);
			 num = num / 10;  // Changing the Number
		}

		if (sum == numCopy)
			System.out.println(numCopy + " is ArmStrong Number ");
		else
			System.out.println(numCopy + " is Not ArmStrong Number ");
	}
}

// Iterations : i= 1  => N
// Iterations : i= 2  => N-1 