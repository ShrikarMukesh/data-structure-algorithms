package com.dsa.labs;

//Delete the given Element from an Array
public class Lab7 {
    static void deleteElement(int arr[], int element) {
        int n = arr.length;
        int index=-1;
        for(int i=0;i<n;i++) {
            if(arr[i]==element) {
                index=i;
                break;
            }
        }
        if(index==-1) {
            return ;
        }
        for (int i = index; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n-1] = 0;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int element = 30;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        deleteElement(arr, element);
        System.out.println("----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Time Complexity - - O(n)
// Aux Space - O(1)