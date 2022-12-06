package com.numloops2;
//21) WAP to find the Factorial of given Number.
public class Lab21 {
    public static void main(String[] args) {
        int number  = 6;
        int fact = 1;
        for (int i=1;i<=number;i++){
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
    }
}
