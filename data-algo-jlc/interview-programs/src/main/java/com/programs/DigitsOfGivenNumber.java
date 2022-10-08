package com.programs;

public class DigitsOfGivenNumber {
    public static void main(String[] args) {
        int num = 567;
       while(num != 0){
           int rem = num % 10;
           System.out.println(rem);
           num = num / 10;
       }
    }
}
