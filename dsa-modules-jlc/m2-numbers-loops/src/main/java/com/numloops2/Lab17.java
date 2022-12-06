package com.numloops2;

// 17) WAP to find number of digits of given number?
public class Lab17 {
    public static void main(String[] args) {
        int num = 123;
        int count = 0;
        while(num!=0) {
           //int rem = num %10;
            count++;
            num = num /10;
        }
        System.out.println("No of Digits : "+ count);
    }
}