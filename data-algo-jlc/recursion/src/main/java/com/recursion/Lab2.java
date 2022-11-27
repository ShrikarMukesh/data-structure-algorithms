package com.recursion;

public class Lab2 {
    static void show(){
        System.out.println("Show Method");
        show();
    }
    public static void main(String[] args) {
        show();
    }
}
