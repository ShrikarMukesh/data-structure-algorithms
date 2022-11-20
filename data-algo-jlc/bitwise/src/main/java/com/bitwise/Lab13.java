package com.bitwise;
//find weather given number is power of 2 or NOT
//Number of set bits are 1
public class Lab13 {
    public static void main(String[] args) {
        //int n = 40;
        //int n =32;
        int n = 64;
        int count = 0;
        while (n >0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println("Set Bit count: " + count);
        if(count == 1){
            System.out.println("2 Power");
        } else{
            System.out.println("Not 2 power");
        }
    }
}
