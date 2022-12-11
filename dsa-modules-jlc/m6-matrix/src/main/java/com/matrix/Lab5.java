package com.matrix;

public class Lab5 {
    public static void main(String[] args) {
        //4*4 array
        int arr[][] = {{12,4,5,5},{43,6,71,474},{32,2}};
        //accessing elements
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
