package com.bitwise;

public class Lab12A {
    private static int loopcount;
    public static void main(String[] args) {
        int n=1024;
        int count=0;
        while(n > 0){
            loopcount++;
            n = n & (n-1);
            count++;
        }
        System.out.println("Total Loop count = "+loopcount);
        System.out.println("Set Bit count = "+count);
    }
}
