package com.matrix;

public class Lab6 {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        System.out.println("1st Array");
        for (int j=0;j<arr[0].length;j++){
            System.out.print(arr[0][j]+" ");
        }
        System.out.println("\n2nd Array");

        for (int j=0;j<arr[1].length;j++){
            System.out.print(arr[1][j]+" ");
        }

        System.out.println("\n3rd Array");
        for (int j=0;j<arr[2].length;j++){
            System.out.print(arr[2][j]+" ");
        }
    }
}
