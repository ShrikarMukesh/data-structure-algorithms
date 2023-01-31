package com.dsa.labs;

//Access the Elements of an Array
public class Lab8 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        //Do something with Element
        }
    }
}
// Time Complexity - - O(n)
// Aux Space - O(1)