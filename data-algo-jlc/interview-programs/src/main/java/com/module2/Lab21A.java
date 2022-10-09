package com.module2;

import java.math.BigInteger;
import java.nio.file.spi.FileSystemProvider;

// 21) WAP to find the Factorial of given Number.

public class Lab21A{

	public static void main(String[] args) {

		int num = 200;
		BigInteger fact = BigInteger.valueOf(1);
		for(int i=2; i<= num;i++) {
			fact = fact.multiply(BigInteger.valueOf(i)) ;
		}
		
		System.out.println("Factorial is : "+ fact);
		
	}
}

// Iterations : i= 1  => N
// Iterations : i= 2  => N-1 
// For Large Numbers , use BigInteger class