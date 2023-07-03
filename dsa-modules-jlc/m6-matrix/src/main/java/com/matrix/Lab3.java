package com.matrix;

public class Lab3 {
    public static void main(String[] args) {
        //creating 2-D Jagged array
        int arr[][] = new int[3][];

        //creating 1-D array
        arr[0]= new int[3];
        arr[1] = new int[4];
        arr[2] = new int[5];

        //accessing elements
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //initializing 2-D array
        arr[0][0] =11;
        arr[1][1] =22;
        arr[2][3] = 33;

        //accessing elements
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
