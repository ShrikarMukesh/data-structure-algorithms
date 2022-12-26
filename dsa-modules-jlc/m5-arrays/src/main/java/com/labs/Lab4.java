package com.labs;

//Search for given Element in the Unsorted Array
public class Lab4 {
    static int linearSearch(int arr[], int element) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 25, 10, 5, 15, 30, 20, 50 };
        int element = 30;
        int index = linearSearch(arr, element);
        System.out.println(index);
        if (index == -1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found at Index : " + index);
    }
}
// Time Complexity - - L.S O(n)
// Aux Space - O(1)