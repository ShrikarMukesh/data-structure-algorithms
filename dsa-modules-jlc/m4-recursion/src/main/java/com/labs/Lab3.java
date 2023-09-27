package com.labs;

public class Lab3 {
    public static void main(String[] args) {
        show(5);
    }

    private static void show(int n) {
        if(n<=0){
            return;
        }
        System.out.println("Hello Boys");
        show(n-1);

    }
}
