package com.bitwise;

public class Lab11 {
    public static void main(String[] args) {
        int n =15;
        int k = 5;
        for(int i=0;i<k-1;i++){
            n= n>>1;
        }
        if( (n&1) !=0 ){
            System.out.println("Kth BIT is SET");
        }else{
            System.out.println("Kth BIT is  NOT SET");
        }
    }
}
