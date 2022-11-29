package com.recursion;

public class Lab6 {
    static void print(int n){

        if(n ==0) {
            return;
        }
        print(n-1);
        System.out.println("n = " + n);
    }
    public static void main(String[] args) {
        print(4);
    }
}
