package com.numloops1;

// 14) WAP to find whether given number is perfect or not.
public class Lab14 {
    public static void main(String[] args) {
        int num = 6; // Given Number
        int sum = 0;
        for (int i = 1; i <= num /2 ; i++) {
            if (num % i == 0) // i is having each number
                sum = sum + i;
        }
        if (sum == num)
            System.out.println(num + " is Perfect Number");
        else
            System.out.println(num + " is Not Perfect Number");
    }
}