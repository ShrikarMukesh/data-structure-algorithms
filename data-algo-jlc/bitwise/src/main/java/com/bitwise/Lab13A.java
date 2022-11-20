package com.bitwise;

public class Lab13A {
    public static void main(String[] args) {
        int n = 31;
        int count = 0;
        if(((n) & (n-1)) == 0){
            System.out.println("2 Power");
        } else{
            System.out.println("Not 2 power");
        }
    }
}
