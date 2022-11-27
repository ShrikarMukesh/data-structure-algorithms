package com.recursion;
// Find the factorial of a given number
public class Lab9 {
    static int  fact(int n){

        if( n==0 || n==1 ) {
            return 1;
        }else{
            return n  *  fact(n-1);
        }

    }
    public static void main(String[] args) {
        int n =5;
        int fact = fact(n);
        System.out.println(fact);
    }
}
//Non-Tail recursive
//Time-Complexity : O(n)
//Aux Space Complexity : O(1)