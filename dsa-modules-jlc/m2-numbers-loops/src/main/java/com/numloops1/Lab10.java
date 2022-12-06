package com.numloops1;
//10) WAP to find sum of numbers from 1 to n
public class Lab10 {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum = sum + i;
        }
        System.out.println("Final Sum " + sum);
    }
}
