package com.module2;

//26) WAP to display the Armstrong numbers from 1 to n.

public class Lab26 {

	private static int cube(int num) {
		return num * num * num;
	}

	private static boolean isArmStrong(int num) {
		
		int sum = 0;
		int numCopy = num;
		while (num != 0) {
			int digit = num % 10;
			sum = sum + cube(digit);
			num = num / 10;
		}

		if (sum == numCopy)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		int m = 1;
		int n = 1000;

		for (int i = m; i <= n; i++) {
			if (isArmStrong(i)) {
				System.out.println(i);
			}
		}

	}
}

// Iterations : i= 1  => N
// Iterations : i= 2  => N-1 