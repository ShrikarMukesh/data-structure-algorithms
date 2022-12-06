package com.numloops1;

// 13) WAP to find sum of divisible of a given number
public class Lab13 {
    public static void main(String[] args) {
        int n = 10; // Given Number
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) //i is having each number
                sum = sum +i;
        }
        System.out.println("Sum : "+ sum);
    }
}