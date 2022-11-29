package com.recursion;

public class Lab3 {
    static void show(int n){
        if(n ==0){
            return;
        }
        System.out.println("Show Method");
        show(n-1);
    }
    public static void main(String[] args) {
        show(5);
    }
}
