package com.hashing1;

public class Lab1 {
    public static void main(String[] args) {
        // 1. Create Array
        int arr[] = new int[5];
        // 2.find the Length of Array
        int n = arr.length;
        System.out.println(n);
        // 3.Access Elements of Array
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
       // 4. Initialize the Array
        arr[0] = 11;
        arr[2] = 33;
        arr[4] = 55;
        System.out.println("-----------------");
        // Access Elements of Array
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}