package com.bitwise;

public class Lab11A {
    public static void main(String[] args) {
        int n =15;
        int k = 5;
        n = n >>k-1;
        if( (n&1) !=0 ){
            System.out.println("Kth BIT is SET");
        }else{
            System.out.println("Kth BIT is  NOT SET");
        }
    }
}
