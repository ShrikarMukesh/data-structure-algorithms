package com.numloops1;

// 12) WAP to find sum of cubes of numbers from 1 to n.
public class Lab12 {
    public static void main(String[] args) {
        int num = 3;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i * i * i ; // i contains each Number
        }
        System.out.println("Sum : "+sum);
    }
}