package com.labsimp;

//Problem1- Reverse the given String
public class Lab1A {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        StringBuilder stringBuilder  =new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
// Time Complexity - - O(1)
// Aux Space - O(1)