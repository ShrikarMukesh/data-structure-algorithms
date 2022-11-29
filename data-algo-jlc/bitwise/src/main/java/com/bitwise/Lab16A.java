package com.bitwise;

//find the odd occurring Number in array
public class Lab16A {
    public static void main(String[] args) {
        int arr[] = {3,5,7,3,7,5,9,9,5};
        int length = arr.length;
        int result=0;
        for(int i=0;i<length;i++){
            result = result ^ arr[i];
        }
        System.out.println(result);
    }
}
