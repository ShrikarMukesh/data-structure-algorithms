package com.module2;

// 16) WAP to Print the digits of given number?

public class Lab16 {

	public static void main(String[] args) {

		int num = 123;

		while(num!=0) {
			int rem = num %10;
			System.out.println(rem);
			num = num /10;
		}

	}
}
