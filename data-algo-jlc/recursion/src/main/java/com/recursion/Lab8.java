package com.recursion;
// Find the sum 1 to N
public class Lab8 {
    static int  sum(int n){

        if(n ==0) {
            return 0;
        }else{
            return n  + sum(n-1);
        }

    }
    public static void main(String[] args) {
        int n =7;
        int sum = sum(n);
        System.out.println(sum);
    }
}
//Non-Tail recursive
//Time-Complexity : O(n)
//Aux Space Complexity : O(1)
