package com.numloops2;
//16) WAP to Print the digits of given number?
public class Lab16 {
    public static void main(String[] args) {
        int number = 3214;
        while(number != 0 ){
            int rem = number %10;
            System.out.println(rem);
            number = number / 10;
        }
    }
}
