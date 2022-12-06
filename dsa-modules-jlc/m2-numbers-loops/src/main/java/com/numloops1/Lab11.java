package com.numloops1;

// 11) WAP to find sum of squares of numbers from 1 to n.

public class Lab11 {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i * i ; // i contains each Number
        }
        System.out.println("Sum : "+sum);
    }
}