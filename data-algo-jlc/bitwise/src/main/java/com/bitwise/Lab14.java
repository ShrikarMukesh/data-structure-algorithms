package com.bitwise;

// Reverse Bits of Given Number
public class Lab14 {
    public static void main(String[] args) {
        int n  = 54321;
        int rev =0;
        int count = 0;
        while (n>0){
            rev = rev<<1;
            if((n&1) == 1){
                rev = rev ^ 1;
            }
            n =n >>1;
            count++;
        }
        System.out.println("Todat Iteation = " + count);
        System.out.println(rev);
    }
}
