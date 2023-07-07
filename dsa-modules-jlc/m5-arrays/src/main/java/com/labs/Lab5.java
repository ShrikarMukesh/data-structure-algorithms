package com.labs;
//Insert the Element at given position in an Array If Capacity is not there Dont Insert
public class Lab5 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int pos = 1;
        for(int i=arr.length-1;i>pos;i--){
            arr[i]  = arr[i-1];
        }
        arr[pos] = 22;
        for (int i: arr){
            System.out.println(i);
        }
    }
}
