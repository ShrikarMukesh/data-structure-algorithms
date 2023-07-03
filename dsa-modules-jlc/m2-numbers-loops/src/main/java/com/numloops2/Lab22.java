package com.numloops2;
//22) WAP to find sum of Factorials of individual digits of given number?
public class Lab22 {
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        while(num!=0) {
            int digit = num %10; //Each Digit
            sum = sum + factorial(digit);
            num = num /10;
        }
        System.out.println("Sum : "+ sum);
    }
}