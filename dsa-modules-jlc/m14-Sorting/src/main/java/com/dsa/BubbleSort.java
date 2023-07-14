package com.dsa;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,2,19,7};
        System.out.print("Before sorting \t");
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] + " ");
        }
        //Time Complexity  = O(n^2)
        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length -i -1;j++){
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
            }
        }
        System.out.print("\n After sorting ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
