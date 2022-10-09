package com.programs;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 567, rev=0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);

    }
}
