package com.programs;

public class SumOfNumbers {
    public static void main(String[] args) {
        int res =  addition(3);
        System.out.println(res);
    }
    public static int addition(int num){
        if(num != 0){
            return num + addition(num -1);
        }else{
            return num;
        }
    }
}
