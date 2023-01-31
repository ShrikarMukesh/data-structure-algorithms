package com.dsa.labs;

//Insert the Element at given position in an Array
// Create New Array and Insert
public class Lab5B {
    static int[] insert(int arr[], int element, int position) {
        int index = position - 1;
        int tempArr[] = new int[arr.length + 1];
        int n = tempArr.length;
        for (int i = n - 1; i > index; i--) {
            tempArr[i] = arr[i - 1];
        }
        // Insert
        tempArr[index] = element;
        for (int i = 0; i < index; i++) {
            tempArr[i] = arr[i];
        }
        return tempArr;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int element = 99;
        int position = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int newArr[] = insert(arr, element, position);
        System.out.println("----");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
// Time Complexity - - O(n)
// Aux Space - O(n)
