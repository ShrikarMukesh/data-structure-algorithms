package com.numloops2;
//18) WAP to find sum of individual digits of given number?
public class Lab18 {
    public static void main(String[] args) {
        int number = 9898;
        int sum = 0;
        while (number != 0 ){
            int reminder = number % 10;
            sum = sum + reminder;
            number = number /10;
        }
        System.out.println("Todtal sum of all digits of a given number "+ sum);
    }
}
