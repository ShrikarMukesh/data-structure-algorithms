package com.numloops2;

// 20) WAP to find sum of cubes of individual digits of given number?
public class Lab20{
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while(num!=0) {
            int digit = num %10;
            sum = sum + digit * digit * digit;
            num = num /10;
        }
        System.out.println("Sum : "+ sum);
    }
}
// Iterations : No of Digits times