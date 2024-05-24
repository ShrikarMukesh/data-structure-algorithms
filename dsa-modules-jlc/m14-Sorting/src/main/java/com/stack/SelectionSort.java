package com.stack;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,2,19,7};
        System.out.print("Before sorting \t");
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] + " ");
        }
        //Time Complexity  = O(n^2)
        //bubble sort
        for(int i =0;i<arr.length-1;i++){
            int smallestElementIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallestElementIndex] > arr[j]){
                    smallestElementIndex= j;
                }
            }
            int temp = arr[smallestElementIndex];
            arr[smallestElementIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.print("\n After sorting \t");
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] + " ");
        }

    }

}
