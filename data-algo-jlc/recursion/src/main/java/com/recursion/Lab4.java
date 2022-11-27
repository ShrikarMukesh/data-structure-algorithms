package com.recursion;

public class Lab4 {
    static void show(int n){
        if(n ==0) {
            return;
        }
        show(n-1);
        System.out.println("Inside Show Method");
    }
    public static void main(String[] args) {
        show(5);
    }
}
