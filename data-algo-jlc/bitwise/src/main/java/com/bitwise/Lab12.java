package com.bitwise;

//count the number of set Bits in a given number
public class Lab12 {
    private static int loopcount;

    public static void main(String[] args) {
        //int n=14; // 0 0 0 0 1 1 1 0 --> This is 8-bit represent
        //int n=32; // 0 0 1 0 0 0 0 0 --> This is 8-bit represent
        //int n=31; // 0 0 0 1 1 1 1 1 --> This is 8-bit represent
        int n=1024; // 0 0 0 1 1 1 1 1 --> This is 8-bit represent
        int count=0;
        while(n > 0){
            loopcount++;
            //checking last bit is ZERO or ONE
            if( (n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        System.out.println("Total Loop count = "+loopcount);
        System.out.println("Set Bit count = "+count);
    }
}
